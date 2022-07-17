package com.kb.kbArt5.service;

import com.kb.kbArt5.entity.City;

import java.util.List;

public interface CityService {
    public List<City> fetchCityList();

    public City fetchCityById(Long cityId);

    public List<City> fetchCityByName(String cityName);
}
