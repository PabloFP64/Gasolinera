package com.example.gasolinera.Servicio;

import com.example.gasolinera.Controlador.controlGasolinera;

public class Lanzador {
    public static void lanzame(){
        System.out.printf("Empezamos el servicio");

        controlGasolinera gasolinera= new controlGasolinera();
        gasolinera.abrimos();



    }
}
