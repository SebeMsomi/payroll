package me.sebemsomi.domain.service;

import me.sebemsomi.domain.domain.Race;
import me.sebemsomi.domain.factory.RaceFactory;
import me.sebemsomi.domain.service.race.RaceService;
import me.sebemsomi.domain.service.race.impl.RaceServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RaceServiceImplTest {
    private RaceService service;

    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImpl.getService();

    }

    @Test
    public void getAll() {

        Set<Race> races = service.getAll();
        Assert.assertNotNull(races);

    }
    @Test
    public void create() {

        Race race = RaceFactory.buildRace(1,"Black");

        service.create(race);

        Race inRepo = service.read(race.getRaceID());

        Assert.assertNotNull(inRepo);

    }
    @Test
    public void read() {

        Race race = RaceFactory.buildRace(1,"Black");

        service.create(race);

        Race inRepo = service.read(race.getRaceID());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Race race = RaceFactory.buildRace(1,"Black");

        service.create(race);

        Race inRepo = service.read(race.getRaceID());
        service.update(race);
        Assert.assertEquals(race.getRaceID(), inRepo.getRaceID());

    }

    @Test
    public void delete() {

        Race race = RaceFactory.buildRace(1,"Black");

        service.create(race);

        Race inRepo = service.read(race.getRaceID());

        Assert.assertNotNull(inRepo);

        service.delete(race.getRaceID());

        Race deleted = service.read(race.getRaceID());

        Assert.assertNull(deleted);

    }

}
