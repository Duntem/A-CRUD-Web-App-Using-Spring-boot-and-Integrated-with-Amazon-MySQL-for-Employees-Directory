package com.DuntemEmployeeDIrectory.Service.impl;

import com.DuntemEmployeeDIrectory.Entity.Employee;
import com.DuntemEmployeeDIrectory.Repository.EmployeeRepository;
import com.DuntemEmployeeDIrectory.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceimpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        Employee updateEmployee = employeeRepository.findByEmployeeId(employee.getEmployeeid());
        updateEmployee.setEmployeeid(employee.getEmployeeid());
        updateEmployee.setEmployee_name(employee.getEmployee_name());
        updateEmployee.setAddress(employee.getAddress());
        updateEmployee.setDepartment(employee.getDepartment());
        updateEmployee.setPhoneNumber(employee.getPhoneNumber());
        employeeRepository.save(updateEmployee);
        return updateEmployee;
    }

    @Override
    public Employee findEmployeeById(String employeeId){
        return employeeRepository.findByEmployeeId(employeeId);
    }

    @Override
    public void deleteEmployee(String employeeId){
        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        employeeRepository.delete(employee);
    }
}
