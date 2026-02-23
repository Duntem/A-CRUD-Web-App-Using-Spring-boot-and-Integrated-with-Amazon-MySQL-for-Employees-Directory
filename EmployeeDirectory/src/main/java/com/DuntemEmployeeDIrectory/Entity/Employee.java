package com.DuntemEmployeeDIrectory.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "employee_id")
    private String employeeid;

    @Column(name = "employee_name")
    private String employee_name;

    @Column(name = "address")
    private String address;

    @Column(name = "department")
    private String department;

    @Column(name = "phoneNumber")
    private String phoneNumber;

}
