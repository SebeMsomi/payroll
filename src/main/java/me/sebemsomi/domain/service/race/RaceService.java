package me.sebemsomi.domain.service.race;

import me.sebemsomi.domain.domain.demography.Race;
import me.sebemsomi.domain.service.Service;

import java.util.Set;

public interface RaceService extends Service<Race, Integer> {

    Set<Race> getAll();

}
