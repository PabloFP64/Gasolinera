package com.example.gasolinera;

import com.example.gasolinera.Servicio.Lanzador;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GasolineraApplication {

    public static void main(String[] args) throws InterruptedException{
        //SpringApplication.run(GasolineraApplication.class, args);
        Lanzador.lanzame();
    }



}
