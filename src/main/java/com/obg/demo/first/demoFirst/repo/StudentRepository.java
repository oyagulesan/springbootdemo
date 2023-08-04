package com.obg.demo.first.demoFirst.repo;

import com.obg.demo.first.demoFirst.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
