package com.thanhan.services;

import com.thanhan.models.chude;

import java.util.List;

/**
 * Created by ThanhAnNguyen on 12/8/2016.
 */
public interface chudeService {
    List<chude> findAll();
    chude findById(Long Id);
    chude Create(chude cd);
    chude Edit(chude cd);
    void DeleteById (Long Id);
}
