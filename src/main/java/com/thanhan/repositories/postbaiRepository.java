package com.thanhan.repositories;

import com.thanhan.models.postbai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ThanhAnNguyen on 12/9/2016.
 */
@Repository
public interface postbaiRepository extends JpaRepository<postbai,Long>{

}
