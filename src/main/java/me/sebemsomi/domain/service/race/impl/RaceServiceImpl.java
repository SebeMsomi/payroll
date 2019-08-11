package me.sebemsomi.domain.service.race.impl;

import me.sebemsomi.domain.domain.demography.Race;
import me.sebemsomi.domain.repository.race.RaceRepository;
import me.sebemsomi.domain.repository.race.impl.RaceRepositoryImpl;
import me.sebemsomi.domain.service.race.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {



    private static RaceServiceImpl service = null;
    private RaceRepository repository;

    public RaceServiceImpl() {
        repository = RaceRepositoryImpl.getRaceRepository();
    }

    public static RaceServiceImpl getService(){

        if(service == null){
            return new RaceServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Race> getAll() {
        return repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return repository.create(race);
    }

    @Override
    public Race read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Race update(Race race) {
        return repository.update(race);
    }

    @Override
    public void delete(Integer integer) {
        repository.delete(integer);
    }
}
