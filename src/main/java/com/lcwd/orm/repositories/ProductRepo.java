package com.lcwd.orm.repositories;

import com.lcwd.orm.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
}
