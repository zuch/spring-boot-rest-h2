package com.github.zuch.service;

import com.github.zuch.dao.Carrier;
import com.github.zuch.repository.CarrierRespository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class CarrierService {

    @Autowired
    private CarrierRespository carrierRespository;

    @GetMapping("/carriers")
    public List<Carrier> findAll() {
        log.info("GET all Carrier");
        return carrierRespository.findAll();
    }

//    @PostMapping("/carriers")
//    public List<Carrier> findAll(@RequestParam(value = "name", defaultValue = "World") String name) {
}
