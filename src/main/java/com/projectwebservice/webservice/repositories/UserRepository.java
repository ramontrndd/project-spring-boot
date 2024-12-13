package com.projectwebservice.webservice.repositories;

import com.projectwebservice.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
