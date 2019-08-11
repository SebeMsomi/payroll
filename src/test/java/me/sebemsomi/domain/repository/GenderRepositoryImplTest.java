package me.sebemsomi.domain.repository;

import me.sebemsomi.domain.domain.demography.Gender;
import me.sebemsomi.domain.factory.demography.GenderFactory;
import me.sebemsomi.domain.repository.gender.GenderRepository;
import me.sebemsomi.domain.repository.gender.impl.GenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class GenderRepositoryImplTest {
    private GenderRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getGenderRepository();
    }

    @Test
    public void getAll() {

        Set<Gender> genderSet = repository.getAll();
        Assert.assertNotNull(genderSet);

    }

    @Test
    public void create() {

        Gender gender = GenderFactory.getGender(1,"M");

        repository.create(gender);

        Gender inRepo = repository.read(gender.getId());

        Assert.assertNotNull(inRepo);

    }
    @Test
    public void read() {

        Gender gender = GenderFactory.getGender(1,"M");

        repository.create(gender);

        Gender inRepo = repository.read(gender.getId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Gender gender = GenderFactory.getGender(1,"M");

        repository.create(gender);

        Gender inRepo = repository.read(gender.getId());
        gender.getId();

        repository.update(gender);

        Assert.assertEquals(gender.getId(), inRepo.getId());

    }

    @Test
    public void delete() {

        Gender gender = GenderFactory.getGender(1,"M");

        repository.create(gender);;

        Gender inRepo = repository.read(gender.getId());

        Assert.assertNotNull(inRepo);

        repository.delete(gender.getId());

        Gender deleted = repository.read(gender.getId());

        Assert.assertNull(deleted);

    }


}
