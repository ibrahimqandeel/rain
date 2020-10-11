package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfiguration {

    @Bean
    public List<TeamDto> teamsList() {
        List<TeamDto> teamsDtoList = new ArrayList<>();
        return teamsDtoList;
    }
}
