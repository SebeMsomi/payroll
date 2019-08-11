package me.sebemsomi.domain.factory;

import me.sebemsomi.domain.domain.user.Employee;
import me.sebemsomi.domain.factory.user.EmployeeFactory;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {
    @Test
    public void getEmployee() {

        Employee employee = EmployeeFactory.getEmployee(1, "Sebe", "Msomi");
        Assert.assertNotNull(employee);

    }
}
