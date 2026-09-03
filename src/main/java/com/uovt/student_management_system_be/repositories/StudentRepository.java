package com.uovt.student_management_system_be.repositories;

import com.uovt.student_management_system_be.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}