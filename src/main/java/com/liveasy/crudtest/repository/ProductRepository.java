package com.liveasy.crudtest.repository;

import com.liveasy.crudtest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
