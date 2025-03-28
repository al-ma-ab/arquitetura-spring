package io.github.al_ma_ab.arquiteturaspring.montadora.api;

import io.github.al_ma_ab.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    //@Qualifier("motorTurbo")
    @Eletrico
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        //var carro = new HondaHRV(motor);
        //return carro.darIgnicao(chave);
        var carro = new ToyotaCOROLA(motor);
        return carro.darIgnicao(chave);
    }
}
