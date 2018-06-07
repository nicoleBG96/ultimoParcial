package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.Restaurant;
import com.ucbcba.taller.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantRepository restaurantRepository;

    @Autowired
    @Qualifier(value = "restaurantRepository")
    public void setRestaurantRepository(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Iterable<Restaurant> listAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public void saveRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant getRestaurant(Integer id) {
        return restaurantRepository.findOne(id);
    }

    @Override
    public void deleteRestaurant(Integer id) {
        restaurantRepository.delete(id);
    }

    @Override
    public Restaurant findRestaurantByName(String name){
        return restaurantRepository.findRestaurantByName(name);
    }
}
