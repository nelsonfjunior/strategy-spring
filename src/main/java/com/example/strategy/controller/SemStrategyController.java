package com.example.strategy.controller;

import org.springframework.web.bind.annotation.*;

//@RequestMapping ("/time")
@RestController
public class SemStrategyController {

    @GetMapping("/jogador")
    public String cadastrarCandidato(@RequestParam String jogador){
        if(jogador.equalsIgnoreCase("Neymar")){
            return "Al-Hilal Saudi Football Club";
        }else if(jogador.equalsIgnoreCase("Mbappe")){
            return "Paris Saint-Germain Football Club";
        }else if(jogador.equalsIgnoreCase("Gabigol")){
            return "Clube de Regatas do Flamengo";
        }

        throw new RuntimeException("Jogador não encontrado");
    }

}
