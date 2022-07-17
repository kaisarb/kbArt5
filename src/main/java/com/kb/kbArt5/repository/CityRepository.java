package com.kb.kbArt5.repository;

import com.kb.kbArt5.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "select city_id, city, country_id, last_update from city where city = ?1", nativeQuery = true)
    public List<City> findBycityIgnoreCase(String cityName);
}
