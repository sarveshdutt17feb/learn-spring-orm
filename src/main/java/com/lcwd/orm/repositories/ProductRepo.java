package com.lcwd.orm.repositories;

import com.lcwd.orm.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import  java.util.*;
public interface ProductRepo extends JpaRepository<Product,String> {

    //1.custom methods or custome finder method for derived query
    //Rule
    //for good coding practice
    Optional<Product> findByProductName(String productName);
    Product findByPId(String pid);
//    Product findByProductNameIs(String productName);
//    Product findByProductNameEquals(String productName);
    Product findByProductNameIsNot(String productName);

    List<Product> findByProductNameIsNull();

    List<Product> findByActiveTrue();
    List<Product> findByActiveFalse();

    List<Product> findByProductNameStartingWith(String prefix);

    List<Product> findByProductNameEndingWith(String suffix);

    List<Product> findByProductNameContaining(String infix);

    String pattern ="Samsung%";
    List<Product> findByProductNameLike(String pattern);

    List<Product> findByPriceLessThan(double price);
    List<Product> findByPriceLessThanEqual(double price);
    List<Product> findByPriceGreaterThanEqual(double price);
    List<Product> findByProductNameIn(Collection<String> names);

    List<Product> findByProductNameAndPrice(String name,double price);
    List<Product> findByProductNameOrPrice(String name,double price);

    Product findByProductNameOrderByProductNameDesc(String productName);





    //2.queryMethod
}
