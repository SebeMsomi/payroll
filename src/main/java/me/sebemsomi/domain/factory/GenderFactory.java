package me.sebemsomi.domain.factory;

import me.sebemsomi.domain.domain.Gender;

public class GenderFactory {
    public static Gender getGender(int genderId, String gender)
    {
        return new Gender.Builder()
                .id(genderId)
                .desc(gender)
                .build();

    }


}
