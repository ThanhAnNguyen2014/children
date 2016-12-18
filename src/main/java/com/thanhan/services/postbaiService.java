package com.thanhan.services;

import com.thanhan.models.postbai;

import java.util.List;

/**
 * Created by ThanhAnNguyen on 12/9/2016.
 */
public interface postbaiService {
    List<postbai> findAll();
    postbai findById(Long id);
    postbai Save (postbai pos);
    void Delete (Long id);
}
