package com.github.zuch.controller;

import com.github.zuch.dao.Carrier;
import com.github.zuch.service.CarrierService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController()
public class CarrierController {

    private CarrierService carrierService;

    @GetMapping("/carriers")
    public ResponseEntity<List<Carrier>> findAll() {
        final List<Carrier> carriers = carrierService.findAll();
        return new ResponseEntity<>(carriers, HttpStatus.OK);
    }

    @GetMapping("carrier/{iata}")
    public ResponseEntity<Carrier> getCarrierByName(final @PathVariable("iata") String iata) {
        final Carrier carrier = carrierService.findByIata(iata);
        return new ResponseEntity<>(carrier, HttpStatus.OK);
    }

    @PostMapping("carrier")
    public ResponseEntity<String> addCarrier(final @RequestBody Carrier carrier) {
        boolean flag = carrierService.addCarrier(carrier);
        if (!flag) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        final String message = String.format("Carrier [%s] created", carrier.getCallSign());
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    @PutMapping("carrier")
    public ResponseEntity<Carrier> updateCarrier(final @RequestBody Carrier carrier) {
        final Carrier byIata = carrierService.findByIata(carrier.getIata());
        if (byIata == null) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        carrierService.updateCarrier(carrier);
        return new ResponseEntity<>(carrier, HttpStatus.OK);
    }

    @DeleteMapping("carrier/{iata}")
    public ResponseEntity<Void> deleteCarrier(final @PathVariable("iata") String iata) {
        carrierService.deleteCarrier(iata);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
