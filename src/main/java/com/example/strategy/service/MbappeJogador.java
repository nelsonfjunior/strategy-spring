package com.example.strategy.service;


import org.springframework.stereotype.Service;

@Service("Mbappe")
public class MbappeJogador implements Jogador{
    @Override
    public String mostrarTime() {
        return "Paris Saint-Germain Football Club";
    }
}
