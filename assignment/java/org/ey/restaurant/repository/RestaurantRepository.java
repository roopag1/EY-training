package org.ey.restaurant.repository;

import org.ey.restaurant.dto.Restaurant_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant_dto, Long> {

}
