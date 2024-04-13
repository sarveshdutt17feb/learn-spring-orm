package com.lcwd.orm.repositories;

import com.lcwd.orm.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

    List<Product> findByActiveTrue(Pageable pageable);
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
    //select all products with query
    //JPQL--> iske liye entity name dekhna padta h like Product
    //JPQL specific query db independent
    @Query(value = "select p from Product p")
    List<Product> getAllProductWhileLearningJPA();
    @Query("select p from Product p wherep.productName='Samsung'")
    List<Product> getAllActiveProducts();
    //dynamic param with pos
    @Query("select p from Product where p.pId=?1 AND p.productName=?2")
    Product getSingleProductByIdAndName1(String pid,String productName);
    //named parameter
    @Query("select p from Product where p.pId=:productId AND p.productName=:productName")
    Product getSingleProductByIdAndName2(@Param("productId") String pid,@Param("productName") String productName);
    //if you write update query then use @Modify annotation

    //native query
    //native query ke liye table dekhni padti db mn--> db specific query
    @Query("select * from jpa_product where product_name=:productName ")
    Product getProductByIdAndNameNative(@Param("productName") String productName);

}
