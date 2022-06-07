package Test;

import Entidades.Biblioteca;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\nQué te gustaría hacer? \n" +
                    "1- Añadir canción de biblioteca a la lista de reproducción\n" +
                    "2- Ver lista de reproducción \n" +
                    "3- Reproducir lista de reproducción \n" +
                    "4- Filtrar Canciones \n" +
                    "5- Ordenar\n"+
                    "6 - Salir"
                    + "\n\nSeleccionar opción: "));

            switch (opcion){
                case 1:
                    biblioteca.agregarcancionplaylist();
                    break;
                case 2:
                    biblioteca.Mostrarplaylist();
                    break;
                case 3:
                    System.out.println("Reproduciendo lista");
                    break;
                case 4:
                    biblioteca.filtrarCancion();
                    break;
                case 5:
                    biblioteca.order();
                    break;
            }
        }while (opcion != 6);

    }
}
