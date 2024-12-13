package com.projectwebservice.webservice.repositories;

import com.projectwebservice.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
