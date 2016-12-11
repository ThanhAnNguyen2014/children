package com.thanhan.repositories;

import com.thanhan.models.chude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ThanhAnNguyen on 12/8/2016.
 */
@Repository
public interface chudeRepository extends JpaRepository<chude,Long> {
}
