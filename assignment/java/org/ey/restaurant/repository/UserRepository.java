package org.ey.restaurant.repository;

import org.ey.restaurant.dto.User_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User_dto, Long> {

}
