package com.example.strategy.controller;

import com.example.strategy.service.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/time")
public class ComStrategyController {
    @Autowired
    private Map<String, Jogador> jogadorMap;
    @GetMapping("/jogador")
    public String cadastrarCandidato(@RequestParam String jogador){
        Jogador jogadorImpl = jogadorMap.get(jogador);

        if (Objects.nonNull(jogadorImpl)){
            return jogadorImpl.mostrarTime();
        }
        throw new RuntimeException("Jogador não encontrado");
    }
}
