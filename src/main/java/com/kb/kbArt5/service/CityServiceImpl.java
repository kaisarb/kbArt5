package com.kb.kbArt5.service;

import com.kb.kbArt5.entity.City;
import com.kb.kbArt5.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> fetchCityList() {
        return cityRepository.findAll();
    }

    @Override
    public City fetchCityById(Long cityId) {
        return cityRepository.findById(cityId).get();
    }

    @Override
    public List<City> fetchCityByName(String cityName) {
        return cityRepository.findBycityIgnoreCase(cityName);
    }
}
