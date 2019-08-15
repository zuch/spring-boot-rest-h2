package com.github.zuch;

import com.github.zuch.dao.Carrier;
import com.github.zuch.repository.CarrierRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@Slf4j
@AllArgsConstructor
@SpringBootApplication
public class SpringRestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class, args);
    }

    private CarrierRepository carrierRepository;

    @Override
    public void run(final String... args) throws Exception {
        log.info("Starting Application...");

        List<Carrier> carriers = Arrays.asList(
                new Carrier(1L, "Qantas", "QANTAS", "Australia", "QF", "QFA"),
                new Carrier(2L, "South African Airways", "SPRINGBOK", "South Africa", "SA", "SAA"),
                new Carrier(3L, "Emirates Airlines", "EMIRATES", "United Arab Emirates", "EK", "UAE"),
                new Carrier(4L, "Ethiopian Airlines", "ETHIOPIAN", "Ethiopia", "ET", "ETH"),
                new Carrier(5L, "American Airlines", "AMERICAN", "United States", "AA", "AAL"),
                new Carrier(6L, "Delta Air Lines", "DELTA", "United States", "DL", "DAL"),
                new Carrier(7L, "Lufthansa", "LUFTHANSA", "Germany", "LH", "DLH"),
                new Carrier(8L, "Air New Zealand", "NEW ZEALAND", "New Zealand", "NZ", "ANZ"));

        for (final Carrier carrier : carriers) {
            carrierRepository.save(carrier);
            log.info("Inserted Carrier: [{}]", carrier.getName());
        }
    }
}
