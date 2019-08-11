package me.sebemsomi.domain.factory;

import me.sebemsomi.domain.domain.user.EmployeeGender;
import me.sebemsomi.domain.factory.user.EmployeeGenderFactory;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeGenderFactoryTest {
    @Test
    public void buildEmployeeGender() {

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(1, 1);
        Assert.assertNotNull(employeeGender);

    }
}
