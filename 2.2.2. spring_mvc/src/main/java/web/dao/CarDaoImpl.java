package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{

    @Override
    public List<Car> getAllCars(int number) {

        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("K1", 1, "L1"));
        carsList.add(new Car("K2", 2, "L2"));
        carsList.add(new Car("K3", 3, "L3"));
        carsList.add(new Car("K4", 4, "L4"));
        carsList.add(new Car("K15", 5, "L5"));

        if (number>carsList.size()){
            number = carsList.size();
        }

        return carsList.subList(0, number);
    }
}