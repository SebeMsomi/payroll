package me.sebemsomi.domain.factory.demography;

import me.sebemsomi.domain.domain.demography.Race;

public class RaceFactory {
    public static Race buildRace(int id, String desc)
    {
        return new Race.Builder()
                .raceID(id)
                .desc(desc)
                .build();

    }

}
