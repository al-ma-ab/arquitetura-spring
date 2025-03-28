package io.github.al_ma_ab.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro {
    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HRM");
        setCor(Color.BLACK);
        setMotadora(Montadora.HONDA);
    }
}
