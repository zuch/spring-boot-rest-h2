package com.github.zuch.repository;

import com.github.zuch.dao.Carrier;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CarrierRespository extends CrudRepository<Carrier, Long> {

    List<Carrier> findAll();

    List<Carrier> findByName(String name);
}
