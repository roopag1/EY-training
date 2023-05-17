package org.ey.restaurant.repository;

import org.ey.restaurant.dto.Order_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order_dto, Long> {

}
