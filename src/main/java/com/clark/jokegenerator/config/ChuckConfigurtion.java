package com.clark.jokegenerator.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfigurtion {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
