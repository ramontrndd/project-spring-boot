package com.projectwebservice.webservice.repositories;

import com.projectwebservice.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
