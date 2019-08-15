package com.github.zuch.repository;

import com.github.zuch.dao.Carrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrierRepository extends JpaRepository<Carrier, Long> {

    Carrier findByIata(final String iata);
}
