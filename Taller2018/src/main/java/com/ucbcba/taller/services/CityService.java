package com.ucbcba.taller.services;


import com.ucbcba.taller.entities.City;

public interface CityService {
    Iterable<City> listAllCities();

    void saveCity(City city);

    City getCity(Integer id);

    void deleteCity(Integer id);
}
