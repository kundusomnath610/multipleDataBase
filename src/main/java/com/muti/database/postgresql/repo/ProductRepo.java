package com.muti.database.postgresql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muti.database.postgresql.entity.Product;

public interface ProductRepo extends JpaRepository <Product, Long> {

    

}
