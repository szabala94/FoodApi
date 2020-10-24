package io.spring.foodapi.dao;



import io.spring.foodapi.dao.entity.Kitchen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitchenRepo extends CrudRepository<Kitchen, Long> {

}
