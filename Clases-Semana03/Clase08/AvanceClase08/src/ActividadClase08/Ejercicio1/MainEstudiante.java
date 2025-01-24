package Ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class MainEstudiante {

	public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Pedro", 18.5, 20));
        estudiantes.add(new Estudiante("Carlos", 17.2, 22));
        estudiantes.add(new Estudiante("Luis", 19.0, 18));

        System.out.println("Antes de ordenar por nombre:");
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " - " + e.getNota() + " - " + e.getEdad());
        }

        Collections.sort(estudiantes);
        System.out.println("\nOrdenados por nombre:");
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " - " + e.getNota() + " - " + e.getEdad());
        }

        estudiantes.sort((e1, e2) -> Estudiante.compararEdadNota(0, e1, e2));
        System.out.println("\nOrdenados por nota:");
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " - " + e.getNota() + " - " + e.getEdad());
        }

        estudiantes.sort((e1, e2) -> Estudiante.compararEdadNota(1, e1, e2));
        System.out.println("\nOrdenados por edad:");
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " - " + e.getNota() + " - " + e.getEdad());
        }
    }

}
