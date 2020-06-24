package com.cruz.joao.calculadoralombok.controle;

import com.cruz.joao.calculadoralombok.modelo.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraControle {

    @GetMapping("/")
    public String mensagem(){
        return "Bem vindo a calculadora";
    }
    @GetMapping("/calcular")
    public String getCalcular(){

        Calculadora c = new Calculadora();

        c.setValor1(12);
        c.setValor2(30);

        return "Valor 1: "+c.getValor1()+
                "\nValor 2: "+c.getValor2()+
                "\nSoma: "+c.calcularSomar()+
                "\nSubtracacao: "+c.calcularSubtracao()+
                "\nMultiplicacao: "+c.calcularMultiplicacao()+
                "\nDivisao: "+c.calcularDivisao();
    }
}
