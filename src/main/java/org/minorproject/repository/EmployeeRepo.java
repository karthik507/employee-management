package org.minorproject.repository;

import org.minorproject.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
