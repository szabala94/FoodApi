package io.spring.foodapi.dao;


        import io.spring.foodapi.dao.entity.Food;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends CrudRepository<Food, Long> {

}
