package com.kodilla.patterns2.decorator.taxiportal;

import java.math.BigDecimal;

public class MyTaxiNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public MyTaxiNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by MyTaxi Network";
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(30));
    }
}
