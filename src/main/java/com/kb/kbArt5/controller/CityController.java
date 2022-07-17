package com.kb.kbArt5.controller;

import com.kb.kbArt5.entity.City;
import com.kb.kbArt5.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public List<City> fetchCityList() {
        return cityService.fetchCityList();
    }

    @GetMapping("/cities/{id}")
    public City fetchCityById(@PathVariable("id") Long cityId) {
        return cityService.fetchCityById(cityId);
    }

    @GetMapping("/cities/name/{name}")
    public List<City> fetchCityByName(@PathVariable("name") String cityName) {
        return cityService.fetchCityByName(cityName);
    }

}
