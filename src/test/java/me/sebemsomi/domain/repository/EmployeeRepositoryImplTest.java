package me.sebemsomi.domain.repository;

import me.sebemsomi.domain.domain.Employee;
import me.sebemsomi.domain.factory.EmployeeFactory;
import me.sebemsomi.domain.repository.employee.EmployeeRepository;
import me.sebemsomi.domain.repository.employee.impl.EmployeeRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class EmployeeRepositoryImplTest {
    private EmployeeRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getEmployeeRepository();
    }


    @Test
    public void getAll() {

        Set<Employee> employeeSet = repository.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Employee employee = EmployeeFactory.getEmployee(1, "Riaz", "Khan");

        repository.create(employee);

        Employee inRepo = repository.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Employee employee = EmployeeFactory.getEmployee(1, "Riaz", "Khan");

        repository.create(employee);

        Employee inRepo = repository.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Employee employee = EmployeeFactory.getEmployee(1, "Riaz", "Khan");

        repository.create(employee);
        Employee inRepo = repository.read(employee.getEmpNumber());

        employee.setEmpFirstName("Not Riaz");

        repository.update(employee);

        Assert.assertEquals(employee.getEmpNumber(), inRepo.getEmpNumber());

    }

    @Test
    public void delete() {

        Employee employee = EmployeeFactory.getEmployee(1, "Riaz", "Khan");

        repository.create(employee);

        Employee inRepo = repository.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);

        repository.delete(employee.getEmpNumber());

        Employee deleted = repository.read(employee.getEmpNumber());

        Assert.assertNull(deleted);

    }

}
