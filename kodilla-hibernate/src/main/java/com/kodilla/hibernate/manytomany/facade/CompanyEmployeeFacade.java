package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeFacade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompanyByLetters(String letters) {
        return companyDao.retrieveNameOfCompanyWithThreeLetters(letters);
    }

    public List<Employee> searchEmployeeByLetters(String letters) {
        return employeeDao.retrieveEmployeesWithLastname(letters);
    }
}
