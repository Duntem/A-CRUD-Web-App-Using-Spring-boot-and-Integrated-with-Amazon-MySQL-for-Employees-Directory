package com.DuntemEmployeeDIrectory.Repository;

import com.DuntemEmployeeDIrectory.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByEmployeeId(String employee_id);
}
