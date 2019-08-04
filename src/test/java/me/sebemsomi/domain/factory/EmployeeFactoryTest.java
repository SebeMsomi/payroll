package me.sebemsomi.domain.factory;

import me.sebemsomi.domain.domain.Employee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {
    @Test
    public void getEmployee() {

        Employee employee = EmployeeFactory.getEmployee(1, "Sebe", "Msomi");
        Assert.assertNotNull(employee);

    }
}
