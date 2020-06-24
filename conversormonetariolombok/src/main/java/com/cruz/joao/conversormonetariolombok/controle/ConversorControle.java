package com.cruz.joao.conversormonetariolombok.controle;

import com.cruz.joao.conversormonetariolombok.modelo.Conversor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorControle {

    @GetMapping("/")
    public String mensagem(){
        return "Seja bem vindo ao conversor monetário!";
    }

    @GetMapping("/cotacao")
    public String getCotacao(){
        Conversor c = new Conversor();

        c.setReal(1);
        return
                "\nDolar $: "+c.cotacaoDolar()+
                "\nEuro : "+c.cotacaoEuro();
    }
}
