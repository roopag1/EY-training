package org.ey.restaurant.controller;

import org.ey.restaurant.dto.Restaurant_dto;
import org.ey.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurants")
public class Restaurant_contoller {

	@Autowired
	private RestaurantService  restaurantService;

	@PostMapping
	public Restaurant_dto save(@RequestBody Restaurant_dto restaurant) {
		return restaurantService.save(restaurant);
	}

	@GetMapping("/findrbyid/{id}")
	public Restaurant_dto findById(@PathVariable Long id) {
		return restaurantService.findById(id);
	}

	@DeleteMapping("/deleterby/{id}")
	public void deleteById(@PathVariable Long id) {
		restaurantService.deleteById(id);
	}

	@PutMapping("//putrbyid/{id}")
	public Restaurant_dto update(@PathVariable Long id, @RequestBody Restaurant_dto restaurant) {
		return restaurantService.update(id, restaurant);
	}
}
