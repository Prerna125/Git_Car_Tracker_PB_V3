package egen.service;

import egen.entity.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAll();
    //Vehicle create(Vehicle vehicle);
    Vehicle update(Vehicle vehicle);
    List<Vehicle> loadAll(List<Vehicle> list);



    }
