package me.sebemsomi.domain.factory;

import me.sebemsomi.domain.domain.Race;
import org.junit.Assert;
import org.junit.Test;

public class RaceFactoryTest {
    @Test
    public void buildRace() {

        Race race = RaceFactory.buildRace(1, "African");
        Assert.assertNotNull(race);


    }
}
