package egen.service;

import egen.entity.Vehicle;
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

    @Transactional(readOnly = true)
    public Vehicle findOne(String id) {
        return repository.findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Vehicle with id " + id + " doesn't exist."));
    }

   /* @Override
    public Vehicle create(Vehicle emp) {
        Optional<Vehicle> existing = repository.findByEmail(emp.getEmail());
        if (existing.isPresent()) {
            throw new BadRequestException("Employee with email " + emp.getEmail() + " already exists.");
        }
        return repository.save(emp);
    }*/

    @Transactional
    public Vehicle update(String id, Vehicle emp) {
        Optional<Vehicle> existing = repository.findById(id);
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("Vehicle with id " + id + " doesn't exist.");
        }
        return repository.save(emp);
    }

    @Override
    @Transactional
    public void delete(String id) {
        Optional<Vehicle> existing = repository.findById(id);
        if (!existing.isPresent()) {
            throw new ResourceNotFoundException("Vehicle with id " + id + " doesn't exist.");
        }
        repository.delete(existing.get());
    }
}
