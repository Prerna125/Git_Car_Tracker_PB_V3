package egen.service;

import egen.entity.Readings;
import egen.entity.Vehicle;
import egen.exception.BadRequestException;
import egen.exception.ResourceNotFoundException;
import egen.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository repository;

    @Transactional(readOnly = true)
    public List<Vehicle> findAll() {
        return (List<Vehicle>) repository.findAll();
    }

    @Transactional
    public Vehicle create(Vehicle vehicle){
    Optional<Vehicle> existing = repository.findById(vehicle.getVin());
        if(existing.isPresent()) {
        throw new BadRequestException("Vehicle with vin " + vehicle.getVin() + " already exists");
    }
        return repository.save(vehicle);
}

    @Transactional
    public List<Vehicle> loadAll(List<Vehicle> list) {

        for(Vehicle vehicle : list){
            Optional<Vehicle> existing = repository.findById(vehicle.getVin());
            if(!existing.isPresent() || existing.isPresent()){
                repository.save(vehicle);
        }
    }
        return list;
    }



    @Transactional
    public Vehicle update(Vehicle vehicle) {

            Optional<Vehicle> existing = repository.findById(vehicle.getVin());
            if (existing.isPresent()) {
                return repository.save(vehicle);

            }
            else {
                throw new ResourceNotFoundException("Vehicle with id="+ vehicle.getVin() + "NOT FOUND");
            }
    }


}

//    @Transactional
//    public Vehicle create(Vehicle vehicle) {
//        Optional<Vehicle> existing = repository.findById(vehicle.getVin());
//        if(existing.isPresent()){
//            throw new BadRequestException("Vehicle with email " + vehicle.getVin() + "already exists.");
//        }
//        return repository.save(vehicle);
//    }