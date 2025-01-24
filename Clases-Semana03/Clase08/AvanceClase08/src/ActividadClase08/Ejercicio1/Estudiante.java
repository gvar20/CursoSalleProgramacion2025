package Ejercicio1;

//Crea una clase Estudiante con atributos nombre, nota y edad. Implementa Comparable para ordenar
//por nombre y un Comparator para ordenar por nota o por edad.

public class Estudiante implements Comparable<Estudiante>{
	private String nombre;
	private double nota;
	private int edad;
	
	public Estudiante(String nombre, double nota, int edad) {
		this.nombre = nombre;
		this.nota = nota;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Estudiante o) {
		return this.nombre.compareTo(o.nombre);
	}	
	
	public static int compararEdadNota(int opcion, Estudiante e1, Estudiante e2) {
		if(opcion == 0) {
			return Double.compare(e1.nota,  e2.nota);
		}else {
			return Integer.compare(e1.edad, e2.edad);
		}
	}
		
}
