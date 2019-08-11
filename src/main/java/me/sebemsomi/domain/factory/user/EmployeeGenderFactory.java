package me.sebemsomi.domain.factory.user;

import me.sebemsomi.domain.domain.user.EmployeeGender;

public class EmployeeGenderFactory {
    public static EmployeeGender buildEmployeeGender(int empID, int genderID)
    {
        return new EmployeeGender.Builder()
                .empNumber(empID)
                .genderID(genderID)
                .build();
    }
}
