package com.example.billetteriedeconcerts;

import org.springframework.boot.SpringApplication;

public class TestBilletterieDeConcertsApplication {

    public static void main(String[] args) {
        SpringApplication.from(BilletterieDeConcertsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
