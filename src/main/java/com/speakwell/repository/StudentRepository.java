// src/main/java/com/example/demo/repository/StudentRepository.java
package com.speakwell.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.speakwell.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
