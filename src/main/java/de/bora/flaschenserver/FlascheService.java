package de.bora.flaschenserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlascheService {

    @Autowired
    FlascheRepository flascheRepository;

    public FlascheEntity getFlascheByName(String name){
        return flascheRepository.findFlascheEntityByName(name);
    }

    public List<FlascheEntity> getAllFlasche(){
        return flascheRepository.findAll();
    }

    public void insertNewFlasche(FlascheEntity flascheEntity){
        flascheRepository.save(flascheEntity);
    }
    public void deleteFlascheById(Long id){
        flascheRepository.deleteById(id);
    }
}
