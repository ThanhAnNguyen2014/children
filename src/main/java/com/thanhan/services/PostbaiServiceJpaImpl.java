package com.thanhan.services;

import com.thanhan.models.postbai;
import com.thanhan.repositories.postbaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by ThanhAnNguyen on 12/9/2016.
 */
@Service
@Primary
public class PostbaiServiceJpaImpl implements postbaiService {
    @Autowired
    private postbaiRepository postRepo;
    @Override
    public List<postbai> findAll() {
        return this.postRepo.findAll();
    }

    @Override
    public postbai findById(Long id) {
        return this.postRepo.findOne(id);
    }

    @Override
    public postbai Create(postbai pos) {
        return this.postRepo.save(pos);
    }

    @Override
    public postbai Edit(postbai pos) {
        return this.postRepo.save(pos);
    }

    @Override
    public void Delete(Long id) {
        this.postRepo.delete(id);
    }
}
