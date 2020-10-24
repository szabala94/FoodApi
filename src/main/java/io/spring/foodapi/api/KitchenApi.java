package io.spring.foodapi.api;

import io.spring.foodapi.dao.entity.Kitchen;
import io.spring.foodapi.manager.KitchenManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/kitchen")
@CrossOrigin
public class KitchenApi {
    private KitchenManager km;

    @Autowired
    public KitchenApi(KitchenManager km) {

        this.km = km;
    }

    @GetMapping("/all")
    public Iterable<Kitchen> getAll(){
        return km.findAll();

    }
    @GetMapping
    public Optional<Kitchen> getById(@RequestParam Long id){
        return km.findById(id);

    }
}
