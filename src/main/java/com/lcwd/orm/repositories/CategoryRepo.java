package com.lcwd.orm.repositories;

import com.lcwd.orm.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,String> {
}
