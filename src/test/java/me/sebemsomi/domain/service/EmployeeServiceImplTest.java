package me.sebemsomi.domain.service;

import me.sebemsomi.domain.domain.user.Employee;
import me.sebemsomi.domain.factory.user.EmployeeFactory;
import me.sebemsomi.domain.service.employee.EmployeeService;
import me.sebemsomi.domain.service.employee.impl.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class EmployeeServiceImplTest {
    private EmployeeService service;

    @Before
    public void setUp() throws Exception {
        this.service = EmployeeServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Employee> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Employee employee = EmployeeFactory.getEmployee(1, "Sebe", "Msomi");

        service.create(employee);

        Employee inRepo = service.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Employee employee = EmployeeFactory.getEmployee(1, "Sebe", "Msomi");

        service.create(employee);

        Employee inRepo = service.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Employee employee = EmployeeFactory.getEmployee(1, "Sebe", "Msomi");

        service.create(employee);
        Employee inRepo = service.read(employee.getEmpNumber());

        employee.setEmpFirstName("Not Sebe");

        service.update(employee);

        Assert.assertEquals(employee.getEmpNumber(), inRepo.getEmpNumber());

    }

    @Test
    public void delete() {

        Employee employee = EmployeeFactory.getEmployee(1, "Sebe", "Msomi");

        service.create(employee);

        Employee inRepo = service.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getEmpNumber());

        Employee deleted = service.read(employee.getEmpNumber());

        Assert.assertNull(deleted);

    }


}
