package io.spring.foodapi.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Optional;

@Entity
public class Kitchen {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String kitchen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public Kitchen() {

    }

    public Kitchen(Long id, String kitchen) {
        this.id = id;
        this.kitchen = kitchen;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "id=" + id +
                ", kitchen='" + kitchen + '\'' +
                '}';
    }
}