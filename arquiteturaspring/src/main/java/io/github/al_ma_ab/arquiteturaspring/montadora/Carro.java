package io.github.al_ma_ab.arquiteturaspring.montadora;

import java.awt.*;

public class Carro {
    private String modelo;
    private Color cor;
    private Motor motor;
    private Montadora motadora;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Montadora getMotadora() {
        return motadora;
    }

    public void setMotadora(Montadora motadora) {
        this.motadora = motadora;
    }

    public CarroStatus darIgnicao(Chave chave) {
        if(chave.getMontadora() != this.motadora){
            return new CarroStatus("Não foi possivel ligar com essa chave");
        }
        return new CarroStatus("Carro ligado, Rodando com o motor " + motor);
    }
}
