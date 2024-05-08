package com.example.strategy.service;

import org.springframework.stereotype.Service;

@Service("Gabigol")
public class GabigolJogador implements Jogador{
    @Override
    public String mostrarTime() {
        return "Clube de Regatas do Flamengo";
    }
}
