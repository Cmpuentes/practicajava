package Entidades;

import java.util.Comparator;

public class Ordering implements Comparator<Cancion> {

    public int compare(Cancion sn1, Cancion sn2) {
        Cancion song1 = sn1;
        Cancion song2 = sn2;
        return (song1.getDuracion().compareTo(song2.getDuracion()));
    }
    /**
     * Compare songs by their Date.
     */
    Comparator date = (Comparator<Cancion>) Comparator.comparing(Cancion::getFecha);

    /**
     * Compare songs by their Id.
     */
    Comparator id = (Comparator<Cancion>) Comparator.comparing(Cancion::getId);

}
