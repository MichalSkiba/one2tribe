package com.michalskiba.one2tribe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class One2tribeApplication {

    public static void main(String[] args) {
        SpringApplication.run(One2tribeApplication.class, args);
    }


}
