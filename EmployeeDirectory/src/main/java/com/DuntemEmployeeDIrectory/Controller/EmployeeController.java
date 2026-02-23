package com.DuntemEmployeeDIrectory.Controller;


import com.DuntemEmployeeDIrectory.Entity.Employee;
import com.DuntemEmployeeDIrectory.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity(employeeService.createEmployee(employee), HttpStatus.CREATED);
    }

    @PutMapping("update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        return new ResponseEntity(employeeService.updateEmployee(employee), HttpStatus.OK);
    }

    @GetMapping("{employeeId}")
    public ResponseEntity<Employee> findEmployee(@PathVariable("employeeId") String employeeId){
        return new ResponseEntity(employeeService.findEmployeeById(employeeId), HttpStatus.OK);
    }

    @DeleteMapping("{employeeId}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("employeeId") String employeeId){
        employeeService.deleteEmployee(employeeId);
        return new ResponseEntity( "Employee Deleted", HttpStatus.OK);
    }
}
