package me.sebemsomi.domain.repository.race.impl;

import me.sebemsomi.domain.domain.Race;
import me.sebemsomi.domain.repository.race.RaceRepository;

import java.util.HashSet;
import java.util.Set;

public class RaceRepositoryImpl implements RaceRepository {


    private static RaceRepositoryImpl raceRepository = null;
    private Set<Race> races;


    public RaceRepositoryImpl(){

        races = new HashSet<Race>();

    }

    public static RaceRepositoryImpl getRaceRepository() {

        if(raceRepository == null){
            return new RaceRepositoryImpl();
        }

        return raceRepository;
    }


    @Override
    public Set<Race> getAll() {
        return races;
    }

    @Override
    public Race create(Race race) {
        races.add(race);
        return race;
    }

    @Override
    public Race read(Integer integer) {

        return races.stream().filter(race -> race.getRaceID() == integer).findAny().orElse(null);
    }

    @Override
    public Race update(Race race) {

        Race raceToDelete = read(race.getRaceID());

        if(raceToDelete != null) {
            races.remove(raceToDelete);
            return create(race);
        }
        return null;
    }

    @Override
    public void delete(Integer integer) {
        Race raceToDelete = read(integer);

        if(raceToDelete != null) {
            races.remove(raceToDelete);
        }
    }

}
