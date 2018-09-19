package egen.service;

import egen.entity.Vehicle;

import java.util.List;

public interface VehicleService {

        List<Vehicle> findAll();

        Vehicle findOne(String id);

        //Vehicle create(Vehicle emp);

        Vehicle update(String id, Vehicle emp);

        void delete(String id);
    }
