package io.spring.foodapi.manager;


import io.spring.foodapi.dao.entity.Food;
import io.spring.foodapi.dao.FoodRepo;
import io.spring.foodapi.dao.entity.Kitchen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;


@Service
public class FoodManagerDB {


private FoodRepo foodRepo;


    public FoodManagerDB(){

    }


    @Autowired
    public FoodManagerDB(FoodRepo foodRepo) {
        this.foodRepo = foodRepo;
    }

    public Optional<Food> findById(Long id){

        return foodRepo.findById(id);
    }
    //public Optional<Food> findByKitchen(String kitchen){
   //     return foodRepo.findAll();
   // }
    public Iterable<Food> findAll(){

        return foodRepo.findAll();
    }
    public Food save(Food food){
        return foodRepo.save(food);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        //if you need data in DB:
        save(new Food(1L, "Italian", "Pizza"));
        save(new Food(2L, "Italian", "Pasta"));
        save(new Food(3L, "American", "Burgery"));
        save(new Food(4L, "American", "Steak"));
        save(new Food(5L, "Chinese", "Chicken"));
        save(new Food(6L, "Chinese", "beef"));
        save(new Food(7L, "Chinese", "Pad Thai"));
        save(new Food(8L, "Chinese", "spring rolls"));
        save(new Food(9L, "Spanish", "schrimps"));
        save(new Food(10L, "Spanish", "squid"));
        save(new Food(11L, "Japanese", "sushi"));
        save(new Food(12L, "Japanese", "ramen"));
        save(new Food(13L, "Polish", "pierogi"));
        save(new Food(14L, "Polish", "schabowy"));
        save(new Food(15L, "Vege", "salad"));
        save(new Food(16L, "Vege", "burgers"));
        save(new Food(17L, "Vege", "dim-sum"));
        save(new Food(18L, "German", "sausage"));

    }


}
