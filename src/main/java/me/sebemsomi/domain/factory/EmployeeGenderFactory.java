package me.sebemsomi.domain.factory;

import me.sebemsomi.domain.domain.EmployeeGender;

public class EmployeeGenderFactory {
    public static EmployeeGender buildEmployeeGender(int empID, int genderID)
    {
        return new EmployeeGender.Builder()
                .empNumber(empID)
                .genderID(genderID)
                .build();
    }
}
