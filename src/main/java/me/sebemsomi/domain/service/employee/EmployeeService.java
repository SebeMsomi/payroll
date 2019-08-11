package me.sebemsomi.domain.service.employee;

import me.sebemsomi.domain.domain.user.Employee;
import me.sebemsomi.domain.service.Service;

import java.util.Set;

public interface EmployeeService extends Service<Employee, Integer> {

    Set<Employee> getAll();
}
