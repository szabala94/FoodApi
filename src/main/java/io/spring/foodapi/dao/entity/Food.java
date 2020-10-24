package io.spring.foodapi.dao.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String kitchen;
    private String type;


    public Food() {

    }
    public Food(Long id, String kitchen, String type) {
        this.id = id;
        this.kitchen = kitchen;
        this.type = type;
    }


    public String getKitchen() {
        return kitchen;
    }
    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", kitchen='" + kitchen + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
