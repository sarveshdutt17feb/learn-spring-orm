package com.lcwd.orm.repositories;

import com.lcwd.orm.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
