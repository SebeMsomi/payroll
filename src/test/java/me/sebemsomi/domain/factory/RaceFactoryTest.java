package me.sebemsomi.domain.factory;

import me.sebemsomi.domain.domain.demography.Race;
import me.sebemsomi.domain.factory.demography.RaceFactory;
import org.junit.Assert;
import org.junit.Test;

public class RaceFactoryTest {
    @Test
    public void buildRace() {

        Race race = RaceFactory.buildRace(1, "African");
        Assert.assertNotNull(race);


    }
}
