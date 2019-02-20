package de.bora.flaschenserver;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlascheRepository extends CrudRepository<FlascheEntity,Long> {

    FlascheEntity findFlascheEntityByName(String name);

    @Override
    List<FlascheEntity> findAll();




}
