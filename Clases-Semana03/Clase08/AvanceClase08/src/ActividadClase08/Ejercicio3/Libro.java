package Ejercicio3;

//Crea una clase Libro con atributos titulo, autor y año. Implementa Comparable para ordenar los libros
//por título en orden alfabético. Crea una lista de libros y muéstralos ordenados.

public class Libro implements Comparable<Libro> {
	private String titulo;
	private String autor;
	private int anio;
	
	public Libro(String titulo, String autor, int anio) {
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public int compareTo(Libro o) {
		return this.titulo.compareTo(o.titulo);
	}
	
	@Override
    public String toString() {
        return titulo + " - " + autor + " - " + anio;
    }
	
}
