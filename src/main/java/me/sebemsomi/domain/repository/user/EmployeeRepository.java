package me.sebemsomi.domain.repository.user;

import me.sebemsomi.domain.domain.user.Employee;
import me.sebemsomi.domain.repository.IRepo;

import java.util.Set;

public interface EmployeeRepository extends IRepo<Employee, Integer> {

    Set<Employee> getAll();
}
