package me.sebemsomi.domain.factory;

import me.sebemsomi.domain.domain.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {
    @Test
    public void getGender() {

        Gender gender = GenderFactory.getGender(1, "M");
        Assert.assertNotNull(gender);

    }
}
