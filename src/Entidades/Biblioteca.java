package Entidades;

import Interfaces.Ibiblioteca;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class Biblioteca  implements Ibiblioteca {

    private ArrayList<Cancion> canciones = new ArrayList<>();

    /**
     * Creates a playlist object that contains an ArrayList for Songs.
     */
    protected ArrayList<Cancion> playlist = new ArrayList<>();



    public void Mostarlistadereproduccion() {

    }


    public void filtrarcancion() {

    }


   public void Biblioteca(){
       canciones.add(new Cancion(1, "Milk it", "2001-09-15", "4:10", "Rock", "./Imagenes/Nirvana.jpg", "Banda de rock de los 90'"));
       canciones.add(new Cancion(2, "Pump it", "2005-08-07", "3:10", "Electrónica", "./Imagenes/BEP.jpg", "4 integrantes"));
       canciones.add(new Cancion(3, "Velouria", "1991-01-03", "3:30", "Rock", "../src/Imagenes/Pixies.jpg", "Banda de rock"));
       canciones.add(new Cancion(4, "Enjoy the Silence", "1994-04-29", "4:20", "Rock", "./Imagenes/DM.jpg", "Clásico"));
       canciones.add(new Cancion(5, "Be A Body", "2012-09-09", "3:10", "Alternativo", "./Imagenes/Grimes.png", "Cantante Australiana"));
       canciones.add(new Cancion(6, "Burn The Witch", "2015-12-17", "3:10", "Rock alternativo", "./Imagenes/Rh.jpg", "Banda Británica"));
       canciones.add(new Cancion(7, "Chop Suey", "1998-07-22", "4:30", "Rock", "./Imagenes/SOAD.jfif", "Banda de rock USA"));
       canciones.add(new Cancion(8, "Count Contessa", "2010-03-22", "4:00", "Rap", "./Imagenes/AzBanks.jpg", "Rapera USA"));
       /*canciones.add(new Cancion(9, "Du Hast", "1994-11-27", "4:20", "Rock", "./Imagenes/Rammstein.jpg", "Banda de rock Alemania"));
       canciones.add(new Cancion(10, "Bad", "1993-08-19", "3:50", "Pop", "./Imagenes/MJ.jpg", "Rey del pop"));*/


    }
    public void agregarcancionplaylist() {
        for (int i = 0; i < canciones.size(); i++) {
            JOptionPane.showMessageDialog(null, canciones.get(i).toString());
        }
        try {


            int id = Integer.parseInt(JOptionPane.showInputDialog("\nEscribe el id de la canción que quieres agregar:"));
            if (id <= 0 || id > 10) {
                JOptionPane.showMessageDialog(null,"\nIngrese un Id válido!");

            } else {
                for (Cancion cancion : canciones) {
                    if (id == cancion.getId()) {
                        playlist.add(cancion);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"\nIngrese un Id válido!");
        }
    }
    public void Mostrarplaylist() {

        if (playlist.isEmpty()) {
            JOptionPane.showMessageDialog(null,"la lista de reproduccion esta vacia!");
        } else {
            for (Cancion c : playlist) {
                JOptionPane.showMessageDialog(null, c.toString());
            }
        }
    }


    public void filtrarCancion() {
        String songGenre;
        String songDate;
        try {

            int filter = Integer.parseInt(JOptionPane.showInputDialog("Como desea filtrar\n" +
                    "1. Por Género\n" +
                    "2. Por Año de Lanzamiento\n"));
            switch (filter){
                case 1:
                    songGenre = JOptionPane.showInputDialog("\nIngrese un género\n");
                    JOptionPane.showMessageDialog(null, "\nLas canciones del género " + songGenre +" son: ");
                    for (Cancion cancion: canciones) {
                        if (songGenre.equalsIgnoreCase(cancion.getGenero())){
                            System.out.println(cancion);
                        }
                    }
                    break;
                case 2:
                    songDate = JOptionPane.showInputDialog("\nIngrese un año de lanzamiento\n");
                    JOptionPane.showMessageDialog(null, "\nLas canciones lanzadas en el año " + songDate + " son: " );
                    for (Cancion cancion: canciones) {
                        String [] format = cancion.getFecha().split("-");
                        for (String element : format) {
                            if (element.equals(songDate)){
                                System.out.println(cancion);
                            }
                        }
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "\nNo es una selección válida!\n");
            }
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "\nDebes ingresar un número entero!");
        }
    }

    public void order() {
        int date;
        int form;
        try {
            Collections.sort(canciones, new Ordering());
            date = Integer.parseInt(JOptionPane.showInputDialog("Como desea ordenar \n" +
                    "1- Por Duracion\n" +
                    "2- Por fecha de Lanzamiento\n"));
            if (date == 1) {
                try {
                    form = Integer.parseInt(JOptionPane.showInputDialog("\nSeleccione el orden \n" +
                            "1- Ascendente \n" +
                            "2- Descendente\n" +
                            "3- Normal\n"));
                    if (form == 1) {
                        for (Cancion orderSong : canciones) {
                            JOptionPane.showMessageDialog(null, orderSong);
                        }
                    }
                    else if (form ==2) {
                        new Ordering();
                        Collections.reverse(canciones);
                        for (Cancion orderSong : canciones) {
                            JOptionPane.showMessageDialog(null, orderSong);
                        }
                    }
                    else {
                        Collections.sort(canciones, new Ordering().id);
                        for (int i = 0; i < canciones.size(); i++) {
                            JOptionPane.showMessageDialog(null, canciones.get(i).toString());
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "\nDebes ingresar un número entero!");
                }
            }
            else if (date == 2) {
                try {
                    Collections.sort(canciones,new Ordering().date);
                    form = Integer.parseInt(JOptionPane.showInputDialog("\nSeleccione el orden: \n" +
                            "1- Ascendente \n" +
                            "2- Descendente\n" +
                            "3- Normal\n"));
                    if (form == 1) {
                        for (Cancion orderSong : canciones) {
                            JOptionPane.showMessageDialog(null, orderSong);
                        }
                    }
                    else if (form == 2) {
                        new Ordering();
                        Collections.reverse(canciones);
                        for (Cancion orderSong : canciones) {
                            JOptionPane.showMessageDialog(null, orderSong);
                        }
                    }
                    else {
                        Collections.sort(canciones, new Ordering().id);
                        for (Cancion orderSong : canciones) {
                            JOptionPane.showMessageDialog(null, orderSong);
                        }
                    }
                } catch (InputMismatchException e) {
                    JOptionPane.showMessageDialog(null, "\nDebes ingresar un número entero!");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Opción no válida!");
            }
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "\nDebes ingresar un número entero!");
        }
    }
}

