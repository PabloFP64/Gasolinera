package com.example.gasolinera.Gasolinera;

public class Surtidor {
    private int nSurtidor;

    private boolean ocupado = false;

    private long Tiempo = (long) (Math.random()*(130-50)+50);

    public Surtidor(int nSurtidor){
        this.nSurtidor = nSurtidor;
    }
    public synchronized boolean entraCoche(int idCoche)throws InterruptedException{
        while (ocupado){
            this.wait(Tiempo);
            return false;
        }
        System.out.println("El coche " + idCoche + " entra en el surtidor: "+ nSurtidor);
        nSurtidor++;
        ocupado=true;
        return true;
    }

    public synchronized void saleCoche(int idCoche)throws InterruptedException{
        ocupado = false;
        nSurtidor--;
        System.out.println("El coche " + idCoche + " sale del surtidor: "+ nSurtidor);
        this.notify();
    }
}
