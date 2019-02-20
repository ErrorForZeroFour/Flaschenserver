package de.bora.flaschenserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlascheController {

@Autowired
 FlascheService flascheService;

    @RequestMapping(method = RequestMethod.GET, value = "/flasche/{name}")
    public FlascheEntity getFlascheByName(@PathVariable(value = "name") String name){
        return flascheService.getFlascheByName(name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/flaschen")
    public List<FlascheEntity> getAllFlasche(){
       return flascheService.getAllFlasche();
    }

    @RequestMapping(method = RequestMethod.POST, value ="/flaschen")
    public void postFlasche(@RequestBody FlascheEntity flascheEntity){
        flascheService.insertNewFlasche(flascheEntity);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/flasche/{Id}")
    public void deleteFlascheById(@PathVariable(value = "Id") Long id){
        flascheService.deleteFlascheById(id);
    }

}
