package com.cruz.joao.conversoridadelombok.modelo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Conversor {

    @Getter @Setter
    private byte idade;

    public double mostrarIdadeMes(){
        return (idade*12);
    }
    public double mostrarIdadeDias(){
        return (idade*365);
    }
    public double mostrarIdadeSemanas(){
        return (idade*53);
    }
}
