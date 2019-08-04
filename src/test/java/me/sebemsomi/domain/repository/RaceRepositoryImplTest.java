package me.sebemsomi.domain.repository;

import me.sebemsomi.domain.domain.Race;
import me.sebemsomi.domain.factory.RaceFactory;
import me.sebemsomi.domain.repository.race.RaceRepository;
import me.sebemsomi.domain.repository.race.impl.RaceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class RaceRepositoryImplTest {
    private RaceRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRaceRepository();
    }
    @Test
    public void getAll() {

        Set<Race> genderSet = repository.getAll();
        Assert.assertNotNull(genderSet);

    }

    @Test
    public void create() {

        Race race = RaceFactory.buildRace(1,"African");

        repository.create(race);

        Race inRepo = repository.read(race.getRaceID());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Race race = RaceFactory.buildRace(1,"African");

        repository.create(race);

        Race inRepo = repository.read(race.getRaceID());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {
        Race race = RaceFactory.buildRace(1,"African");

        repository.create(race);

        Race inRepo = repository.read(race.getRaceID());
        race.getRaceID();

        repository.update(race);

        Assert.assertEquals(race.getRaceID(), inRepo.getRaceID());

    }

    @Test
    public void delete() {

        Race race = RaceFactory.buildRace(1,"African");

        repository.create(race);

        Race inRepo = repository.read(race.getRaceID());

        Assert.assertNotNull(inRepo);

        repository.delete(race.getRaceID());

        Race deleted = repository.read(race.getRaceID());

        Assert.assertNull(deleted);

    }
}
