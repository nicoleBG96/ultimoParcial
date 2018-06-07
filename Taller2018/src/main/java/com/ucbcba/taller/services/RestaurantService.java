package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.Restaurant;

public interface RestaurantService {

    Iterable<Restaurant> listAllRestaurants();

    void saveRestaurant(Restaurant restaurant);

    Restaurant getRestaurant(Integer id);

    void deleteRestaurant(Integer id);

    Restaurant findRestaurantByName(String name);
}
