package com.example.employee_management_system.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.employee_management_system.model.Department;


public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
