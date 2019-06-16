package com.kodilla.patterns2.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class ShopService {
    private final List<Order> orders = new ArrayList<>();
    @Autowired
    private Authenticator authenticator;
    @Autowired
    private ProductService productService;

    public Long openOrder(Long userId) {
        if (authenticator.isAuthenticated(userId)) {
            Long maxOrder = (long)orders.stream()
                    .mapToInt(o -> o.getOrderId().intValue())
                    .max().orElse(0);
            orders.add(new Order(maxOrder + 1, userId, productService));
            return maxOrder + 1;
        } else {
            return -1L;
        }
    }

    public void addItem(Long orderId, Long productId, double qty) {
        orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .forEach(order -> order.getItemList().add(new Item(productId, qty)));
    }

    public boolean removeItem(Long orderId, Long productId) {
        Iterator<Order> orderIterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (orderIterator.hasNext()) {
            Order order = orderIterator.next();
            int orderSize = order.getItemList().size();
            for (int n = 0; n < orderSize; n++) {
                if (order.getItemList().get(n).getProductId().equals(productId)) {
                    order.getItemList().remove(n);
                    return true;
                }
            }
        }
        return false;
    }

    public BigDecimal calculateValue(Long orderId) {
        Iterator<Order> iterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            return order.calculateValue();
        }
        return BigDecimal.ZERO;
    }

    public boolean doPayment(Long orderId) {
        Iterator<Order> iterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.isPaid()) {
                return true;
            } else {
                Random generator = new Random();
                order.setPaid(generator.nextBoolean());
                return order.isPaid();
            }
        }
        return false;
    }

    public boolean verifyOrder(Long orderId) {
        Iterator<Order> iterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            boolean result = order.isPaid();
            Random generator = new Random();
            if (!order.isVerified()) {
                order.setVerified(result && generator.nextBoolean());
            }
            return order.isVerified();
        }
        return false;
    }

    public boolean submitOrder(Long orderId) {
        Iterator<Order> iterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.isVerified()) {
                order.setSubmitted(true);
            }
            return true;
        }
        return false;
    }

    public void cancelOrder(Long orderId) {
        Iterator<Order> iterator = orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            orders.remove(order);
        }
    }
}
