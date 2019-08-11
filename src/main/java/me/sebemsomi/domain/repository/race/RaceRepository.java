package me.sebemsomi.domain.repository.race;

import me.sebemsomi.domain.domain.demography.Race;
import me.sebemsomi.domain.repository.IRepo;

import java.util.Set;

public interface RaceRepository extends IRepo<Race, Integer> {

    Set<Race> getAll();

}
