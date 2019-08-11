package me.sebemsomi.domain.repository.gender;

import me.sebemsomi.domain.domain.demography.Gender;
import me.sebemsomi.domain.repository.IRepo;

import java.util.Set;

public interface GenderRepository extends IRepo<Gender, Integer> {

    Set<Gender> getAll();

}
