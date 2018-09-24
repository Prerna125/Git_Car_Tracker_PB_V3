package egen.controller;


import egen.entity.Readings;
import egen.service.ReadingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://mocker.egen.io")
@RequestMapping(value = "readings")
@ResponseBody
public class ReadingsController {

    @Autowired
    private ReadingsService service;

    @RequestMapping(method = RequestMethod.POST, consumes= MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Readings create(@RequestBody Readings reading)
    {
        return service.create(reading);
    }


}
