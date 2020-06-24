package com.cruz.joao.conversoridadelombok.controle;

import com.cruz.joao.conversoridadelombok.modelo.Conversor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorControle {

    @GetMapping("/")
    public String mensagem(){
        return "Seja bem vindo ao Conversor de idade!";
    }
    @GetMapping("/conclusao")
    public String getConclusao(){

        Conversor c = new Conversor();
        c.setIdade((byte) 33);

        return "Resultado: "+c.getIdade()+
                "Meses: "+c.mostrarIdadeMes()+
                "Dia: "+c.mostrarIdadeDias()+
                "Semana:"+c.mostrarIdadeSemanas();

    }
}
