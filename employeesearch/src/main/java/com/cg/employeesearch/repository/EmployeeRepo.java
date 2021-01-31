package com.cg.employeesearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.employeesearch.entity.Employee;



public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
