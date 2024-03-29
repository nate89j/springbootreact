package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Employee;

//we extend to jparepository to use important functions that we do not need to write from the beginning

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
