package Ejercicio2;

import java.util.*;

public class MainEmpleado {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Ana", 3500.0, "6 años, 5 meses y 10 días"));
        empleados.add(new Empleado("Carlos", 4500.0, "5 años, 3 meses y 0 días"));
        empleados.add(new Empleado("Luis", 3500.0, "4 años, 5 meses y 21 días"));
        empleados.add(new Empleado("Pedro", 4000.0, "2 años, 1 meses y 14 días"));
        empleados.add(new Empleado("Maria", 4500.0, "8 años, 5 meses y 26 días"));
        System.out.println("Antes de ordenar:");
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " - " + e.getSalario() + " - " + e.getAntiguedad());
        }
        Collections.sort(empleados);
        System.out.println("\nDespués de ordenar:");
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " - " + e.getSalario() + " - " + e.getAntiguedad());
        }
    }
}

