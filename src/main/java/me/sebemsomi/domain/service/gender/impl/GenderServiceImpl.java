package me.sebemsomi.domain.service.gender.impl;

import me.sebemsomi.domain.domain.Gender;
import me.sebemsomi.domain.repository.gender.GenderRepository;
import me.sebemsomi.domain.repository.gender.impl.GenderRepositoryImpl;
import me.sebemsomi.domain.service.gender.GenderService;

import java.util.Set;

public class GenderServiceImpl implements GenderService {



    private static GenderServiceImpl service = null;
    private GenderRepository repository;

    public GenderServiceImpl() {
        repository = GenderRepositoryImpl.getGenderRepository();
    }

    public static GenderServiceImpl getService(){

        if(service == null){
            return new GenderServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Gender> getAll() {
        return repository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return repository.create(gender);
    }

    @Override
    public Gender read(Integer integer) {
        return repository.read(integer);
    }

    @Override
    public Gender update(Gender gender) {
        return repository.update(gender);
    }

    @Override
    public void delete(Integer integer) {
        repository.delete(integer);
    }
}
