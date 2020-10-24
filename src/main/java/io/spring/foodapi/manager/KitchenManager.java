package io.spring.foodapi.manager;



import io.spring.foodapi.dao.KitchenRepo;
import io.spring.foodapi.dao.entity.Kitchen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KitchenManager {


    private KitchenRepo kitchenRepo;
    List<String> list;

    public KitchenManager(){

    }
    @Autowired
    public KitchenManager(KitchenRepo kitchenRepo) {
        this.kitchenRepo = kitchenRepo;
    }

    public Kitchen saveKitchen(Kitchen kitchen){
        return kitchenRepo.save(kitchen);
    }
    Long l = 1L;
    @EventListener(ApplicationReadyEvent.class)
    public void fillKitchenDB(){
        //if you need data in DB:
        saveKitchen(new Kitchen(1L, "Italian"));
        saveKitchen(new Kitchen(2L, "American"));
        saveKitchen(new Kitchen(3L, "Chinese"));
        saveKitchen(new Kitchen(4L, "Spanish"));
        saveKitchen(new Kitchen(5L, "Japanese"));
        saveKitchen(new Kitchen(6L, "Polish"));
        saveKitchen(new Kitchen(7L, "German"));
        saveKitchen(new Kitchen(8L, "Vege"));


        Iterable<Kitchen> all = kitchenRepo.findAll();
        list = new ArrayList<>();
        for (int i=0;i<8;i++) {

            list.add(i, kitchenRepo.findById(l).get().getKitchen());
            l++;
        }
        list.forEach(System.out::println);

    }
    public Iterable<Kitchen> findAll(){

        return kitchenRepo.findAll();
    }
    public Optional<Kitchen> findById(Long id){

        return kitchenRepo.findById(id);
    }
    public void kitchenList(){
        list = new ArrayList<>();
        Long l = 1L;
        for (int i=0;i<8;i++) {


            list.add(i, findById(l).get().getKitchen());
            l++;
            System.out.println(list.get(i));
        }

    }


}
