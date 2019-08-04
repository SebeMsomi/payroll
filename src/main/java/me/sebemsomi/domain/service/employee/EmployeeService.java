package me.sebemsomi.domain.service.employee;

import me.sebemsomi.domain.domain.Employee;
import me.sebemsomi.domain.service.Service;

import java.util.Set;

public interface EmployeeService extends Service<Employee, Integer> {

    Set<Employee> getAll();
}
