package com.thanhan.services;

import com.thanhan.models.chude;
import com.thanhan.repositories.chudeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ThanhAnNguyen on 12/8/2016.
 */
@Service
@Primary
public class chudeServiceJpaImpl implements chudeService {
    @Autowired
    private chudeRepository chudeRepo;


    @Override
    public List<chude> findAll() {
        return this.chudeRepo.findAll();
    }

    @Override
    public chude findById(Long Id) {
        return this.chudeRepo.findOne(Id);
    }

    @Override
    public chude Create(chude cd) {
        return this.chudeRepo.save(cd);
    }

    @Override
    public chude Edit(chude cd) {
        return this.chudeRepo.save(cd);
    }

    @Override
    public void DeleteById(Long Id) {
        this.chudeRepo.delete(Id);
    }
}
