package me.sebemsomi.domain.service.gender;

import me.sebemsomi.domain.domain.demography.Gender;
import me.sebemsomi.domain.service.Service;

import java.util.Set;

public interface GenderService extends Service<Gender, Integer> {

    Set<Gender> getAll();

}
