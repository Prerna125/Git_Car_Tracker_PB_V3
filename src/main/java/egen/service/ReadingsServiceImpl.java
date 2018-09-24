package egen.service;


import egen.entity.Readings;
import egen.exception.BadRequestException;
import egen.repository.ReadingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ReadingsServiceImpl implements ReadingsService{

    @Autowired
    private ReadingsRepository repository;


    @Transactional
    public Readings create(Readings reading) {
        Optional<Readings> existing = repository.findById(reading.getVin());
        if(!existing.isPresent()) {
            throw new BadRequestException("Vehicle with vin " + reading.getVin() + " already exists");
        }
        return repository.save(reading);
    }
}
