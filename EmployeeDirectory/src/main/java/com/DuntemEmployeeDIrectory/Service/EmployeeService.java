package com.DuntemEmployeeDIrectory.Service;

import com.DuntemEmployeeDIrectory.Entity.Employee;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    Employee findEmployeeById(String employeeId);

    void deleteEmployee(String employeeId);
}
