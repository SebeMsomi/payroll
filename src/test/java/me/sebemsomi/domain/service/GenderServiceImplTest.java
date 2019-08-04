package me.sebemsomi.domain.service;

import me.sebemsomi.domain.domain.Gender;
import me.sebemsomi.domain.factory.GenderFactory;
import me.sebemsomi.domain.service.gender.GenderService;
import me.sebemsomi.domain.service.gender.impl.GenderServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class GenderServiceImplTest {
    private GenderService service;

    @Before
    public void setUp() throws Exception {
        this.service = GenderServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Gender> genders = service.getAll();
        Assert.assertNotNull(genders);

    }
    @Test
    public void create() {

        Gender gender = GenderFactory.getGender(1,"M");

        service.create(gender);

        Gender inRepo = service.read(gender.getId());

        Assert.assertNotNull(inRepo);

    }
    @Test
    public void read() {

        Gender gender = GenderFactory.getGender(1,"M");

        service.create(gender);

        Gender inRepo = service.read(gender.getId());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Gender gender = GenderFactory.getGender(1,"M");

        service.create(gender);

        Gender inRepo = service.read(gender.getId());


        service.update(gender);
        Assert.assertEquals(gender.getId(), inRepo.getId());

    }

    @Test
    public void delete() {

        Gender gender = GenderFactory.getGender(1,"M");

        service.create(gender);

        Gender inRepo = service.read(gender.getId());

        Assert.assertNotNull(inRepo);

        service.delete(gender.getId());

        Gender deleted = service.read(gender.getId());

        Assert.assertNull(deleted);

    }
}
