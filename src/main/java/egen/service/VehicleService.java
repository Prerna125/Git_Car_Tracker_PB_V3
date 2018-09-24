package egen.service;

import egen.entity.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAll();
    //List<Vehicle> loadAll(List<Vehicle> vehicleList);
    //public Vehicle create(Vehicle vehicle);
    Vehicle update(Vehicle vehicle);



    }
