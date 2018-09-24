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
public class VehicleController {

    @Autowired
    private VehicleService service;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> findAll() {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.PUT,
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
//    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    @ApiOperation(value = "Find All Vehicle",
//            notes = "Returns a list of all Vehicles available in the database")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "OK"),
//            @ApiResponse(code = 500, message = "Internal Server Error")
//    })
//    public List<Vehicle> findAll() {
//        return service.findAll();
//    }
//
//
//    @RequestMapping(method = RequestMethod.GET, value = "/{id}",
//            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    @ApiOperation(value = "Find Vehicle by ID",
//            notes = "Return a single Vehicle or throws 404")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "OK"),
//            @ApiResponse(code = 404, message = "Not Found"),
//            @ApiResponse(code = 500, message = "Internal Server Error")
//    })
//    public Vehicle findOne(
//            @ApiParam(value = "id of the Vehicle", required = true) @PathVariable("id") String empId) {
//        return service.findOne(empId);
//    }
//
//    /*@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
//            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public Vehicle create(@RequestBody Vehicle emp) {
//        return service.create(emp);
//    }*/
//
//    @RequestMapping(method = RequestMethod.PUT, value = "/{id}",
//            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
//            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public Vehicle update(@PathVariable("id") String empId, @RequestBody Vehicle emp) {
//        return service.update(empId, emp);
//    }
//
//    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
//    public void delete(@PathVariable("id") String empId) {
//        service.delete(empId);
//    }
