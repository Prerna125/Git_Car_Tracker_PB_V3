package egen.controller;


import egen.entity.Readings;
import egen.service.ReadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://mocker.ennate.academy/")
@RestController
@ResponseBody
@RequestMapping(value = "readings")
public class ReadingsController {

    @Autowired
    private ReadingsService service;

    @RequestMapping(method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Readings create(@RequestBody Readings reading)
    {
        return service.create(reading);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Readings> findAll() {
        return service.findAll();
    }
}
