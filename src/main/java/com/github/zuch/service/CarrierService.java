package com.github.zuch.service;

import com.github.zuch.dao.Carrier;
import com.github.zuch.repository.CarrierRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@AllArgsConstructor
@Service
public class CarrierService {

    private CarrierRepository carrierRepository;

    public List<Carrier> findAll() {
        log.info("GET all Carrier's");
        return carrierRepository.findAll();
    }

    public Carrier findByIata(final String iata) {
        log.info("GET Carrier by name [{}]", iata);
        return carrierRepository.findByIata(iata);
    }

    public synchronized boolean addCarrier(final Carrier carrier) {
        final Carrier byIata = carrierRepository.findByIata(carrier.getIata());
        if (byIata != null) {
            return false;
        } else {
            carrierRepository.save(carrier);
            return true;
        }
    }

    public void updateCarrier(final Carrier carrier) {
        carrierRepository.save(carrier);
    }

    public void deleteCarrier(final String iata) {
        carrierRepository.delete(findByIata(iata));
    }
}
