package com.kb.kbArt5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class City {

    public Long getCity_id() {
        return city_id;
    }

    public void setCity_id(Long city_id) {
        this.city_id = city_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Byte getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Byte country_id) {
        this.country_id = country_id;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city='" + city + '\'' +
                ", country_id=" + country_id +
                ", last_update=" + last_update +
                '}';
    }

    @Id
    @GeneratedValue
    private Long city_id;
    private String city;
    private Byte country_id;
    private Timestamp last_update;

}
