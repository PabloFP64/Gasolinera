package com.example.gasolinera.Controlador;

import com.example.gasolinera.Gasolinera.Coche;
import com.example.gasolinera.Gasolinera.Surtidor;


public class controlGasolinera {

    public static void abrimos() {

        Surtidor[] surtidor = new Surtidor[5];
        Coche[] coche = new Coche[5];

        for (int i = 0; i < surtidor.length ; i++) {
            surtidor[i] = new Surtidor(i);
        }

        for(int i = 0; i < coche.length; i++){
            coche[i] = new Coche(i, surtidor[i]);
        }

        for (int i = 0; i< (coche.length); i++) {
            coche[i].start();
        }


//
//        if (nSurtidores == 0) {
//            throw new IllegalArgumentException("Debe haber un mínimo de 1 surtidor.");
//        }
//        this.coche = new ArrayList<>();
//        this.surtidor = new ArrayList<>();
//        this.times = new Random().longs(5,10).iterator();



    }

}
