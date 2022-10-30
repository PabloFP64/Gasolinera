package com.example.gasolinera.Gasolinera;

import java.util.Random;

public class Coche extends Thread {

//    private Gasolinera gasolinera;
    private long Tiempo = (long) (Math.random()*(130-50)+50);
    private int id;

    private Surtidor surtidor;

    public static boolean finalizado = false;

    public Coche(int id, Surtidor surtidor){
        this.id = id;
        this.surtidor = surtidor;
    }


    @Override
    public void run(){
        while(true){
            try{
                surtidor.entraCoche(id);
                if(surtidor.entraCoche(id)) {
                    surtidor.saleCoche(id);
                    try{
                        Coche.sleep(Tiempo);
                    }catch (InterruptedException ex){
                        System.out.println("Error error: "+ex.toString());
                    }
                    continue;
                }
                System.out.println("El coche "+ id+" está repostando.");
                try {
                    sleep(Tiempo);
                } catch (InterruptedException ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
                finalizado = true;
                System.out.println("El coche "+ id+" ha terminado de repostar.");
                surtidor.saleCoche(id);


            }catch (InterruptedException ex){
                ex.printStackTrace();
                System.err.println("Error error: "+ ex.toString());
            }
            if(finalizado){
                break;
            }
        }
    }

    private void spendTime(long time) throws InterruptedException {
        Thread.sleep(time * 1000);
    }
}
