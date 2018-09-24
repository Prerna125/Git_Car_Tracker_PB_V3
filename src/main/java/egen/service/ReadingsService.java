package egen.service;

import egen.entity.Readings;
import egen.entity.Vehicle;

import java.util.List;

public interface ReadingsService {

    Readings create(Readings reading);
    List<Readings> findAll();
}
