package com.example.gasolinera.Gasolinera;

import java.util.LinkedList;
import java.util.Random;


public class Caja {
    LinkedList<Integer> coches = new LinkedList<Integer>();
    private Random random = new Random();

    private int id;

    private boolean libre = true;

    public Caja(int id){
        this.id = id;
    }

    public synchronized void entraCaja(int id_f) throws InterruptedException{
        while(!libre)
            this.wait();
        coches.add(id_f);
        System.out.println("El coche " + (id_f+1) + " entra en la caja");
        //if (Clase10Control.getjTextArea_Log()!=null)System.out.println("El coche " + (id_f+1) + " entra en la caja");
        libre = false;
    }


    public synchronized void saleCaja(int id_f) throws InterruptedException {
        libre = true;
        coches.remove(id_f);
        System.out.println("El coche " + (id_f+1) + " sale de la caja");
        //if (Clase10Control.getjTextArea_Log()!=null) System.out.println("El coche " + (id_f+1) + " sale de la caja");
        this.notify();
    }
}
