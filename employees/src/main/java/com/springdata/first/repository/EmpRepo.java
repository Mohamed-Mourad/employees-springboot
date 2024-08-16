package com.springdata.first.repository;

import com.springdata.first.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
}
