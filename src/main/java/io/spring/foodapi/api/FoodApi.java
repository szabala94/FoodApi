package io.spring.foodapi.api;

import io.spring.foodapi.dao.entity.Food;
import io.spring.foodapi.manager.FoodManagerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class FoodApi {

private FoodManagerDB food;

    @Autowired
    public FoodApi(FoodManagerDB food) {

        this.food = food;
    }

    @GetMapping("/all")
    public Iterable<Food> getAll(){
        return food.findAll();

    }
    @GetMapping
    public Optional<Food> getById(@RequestParam Long id){
        return food.findById(id);

    }



//    @GetMapping
//    public Optional<Food> getByKitchen(@RequestParam String kitchen){
//        Optional<Food> selectedKitchen = foodList.stream().filter(element -> element.getKitchen().equals(kitchen)).findAny();
//        return food.findById(kitchen);
//    }


}
