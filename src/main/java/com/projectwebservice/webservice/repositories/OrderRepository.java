package com.projectwebservice.webservice.repositories;

import com.projectwebservice.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
