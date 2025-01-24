package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class MainLibro {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();        
        libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));        
        libros.add(new Libro("1984", "George Orwell", 1949));
        libros.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", 2001));
        libros.add(new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985));
        System.out.println("Antes de ordenar:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        Collections.sort(libros);
        System.out.println("\nDespués de ordenar por título:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}

