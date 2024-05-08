package com.example.strategy.service;

import org.springframework.stereotype.Service;

@Service("Neymar")
public class NeymarJogador implements Jogador{
    @Override
    public String mostrarTime() {
        return "Al-Hilal Saudi Football Club";
    }
}
