package me.sebemsomi.domain.repository.employee;

import me.sebemsomi.domain.domain.Employee;
import me.sebemsomi.domain.repository.IRepo;

import java.util.Set;

public interface EmployeeRepository extends IRepo<Employee, Integer> {

    Set<Employee> getAll();
}
