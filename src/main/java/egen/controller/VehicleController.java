package egen.controller;


import egen.entity.Vehicle;
import egen.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://mocker.egen.io")
@RequestMapping(value = "/vehicles")
//@Api(description = "Vehicle related endpoints")
@ResponseBody
public class VehicleController {

    @Autowired
    private VehicleService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> findAll() {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> loadAll(@RequestBody List<Vehicle> vehicleList) {
        return service.loadAll(vehicleList);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle update(@RequestBody Vehicle vehicle) {
        return service.update(vehicle);
    }

}
