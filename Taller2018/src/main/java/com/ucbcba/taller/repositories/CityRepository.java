package com.ucbcba.taller.repositories;


import com.ucbcba.taller.entities.City;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CityRepository extends CrudRepository<City, Integer>{
}
