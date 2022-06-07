package Persistence;

import Entidades.Cancion;

import java.util.ArrayList;

public class ListadeCanciones {
    private ArrayList<Cancion> canciones = new ArrayList<>();

    /**
     * Creates a playlist object that contains an ArrayList for Songs.
     */
    protected ArrayList<Cancion> playlist = new ArrayList<>();
    public void canciones(){
        canciones.add(new Cancion(1, "Milk it", "2001-09-15", "4:10", "Rock", "./Imagenes/Nirvana.jpg", "Banda de rock de los 90'"));
        canciones.add(new Cancion(2, "Pump it", "2005-08-07", "3:10", "Electrónica", "./Imagenes/BEP.jpg", "4 integrantes"));
        canciones.add(new Cancion(3, "Velouria", "1991-01-03", "3:30", "Rock", "../src/Imagenes/Pixies.jpg", "Banda de rock"));
        canciones.add(new Cancion(4, "Enjoy the Silence", "1994-04-29", "4:20", "Rock", "./Imagenes/DM.jpg", "Clásico"));
        canciones.add(new Cancion(5, "Be A Body", "2012-09-09", "3:10", "Alternativo", "./Imagenes/Grimes.png", "Cantante Australiana"));
        canciones.add(new Cancion(6, "Burn The Witch", "2015-12-17", "3:10", "Rock alternativo", "./Imagenes/Rh.jpg", "Banda Británica"));
        canciones.add(new Cancion(7, "Chop Suey", "1998-07-22", "4:30", "Rock", "./Imagenes/SOAD.jfif", "Banda de rock USA"));
        canciones.add(new Cancion(8, "Count Contessa", "2010-03-22", "4:00", "Rap", "./Imagenes/AzBanks.jpg", "Rapera USA"));
        canciones.add(new Cancion(9, "Du Hast", "1994-11-27", "4:20", "Rock", "./Imagenes/Rammstein.jpg", "Banda de rock Alemania"));
        canciones.add(new Cancion(10, "Bad", "1993-08-19", "3:50", "Pop", "./Imagenes/MJ.jpg", "Rey del pop"));
    }
}
