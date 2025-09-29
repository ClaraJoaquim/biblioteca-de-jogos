package com.jogos.bibliotecajogos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.jogos.bibliotecajogos.entity")
@EnableJpaRepositories("com.jogos.bibliotecajogos.repository")
public class JogosApplication {

    public static void main(String[] args) {
        SpringApplication.run(JogosApplication.class, args);
    }

}
