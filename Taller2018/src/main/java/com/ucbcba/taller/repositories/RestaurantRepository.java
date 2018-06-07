package com.ucbcba.taller.repositories;

import com.ucbcba.taller.entities.Category;
import com.ucbcba.taller.entities.Restaurant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;


@Transactional
public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {
    @Query(value="SELECT restaurant FROM Restaurant restaurant WHERE restaurant.name= :name")
    Restaurant findRestaurantByName(@Param("name") String name);
}
