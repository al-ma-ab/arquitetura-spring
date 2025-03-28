package io.github.al_ma_ab.arquiteturaspring.montadora;

import java.awt.*;

public class ToyotaCOROLA extends Carro {
    public ToyotaCOROLA(Motor motor){
        super(motor);
        setModelo("Hibrido");
        setCor(Color.BLACK);
        setMotadora(Montadora.TOYOTA);
    }
}
