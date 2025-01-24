package Ejercicio2;

// Crea una clase Empleado con atributos nombre, salario y antigüedad. Implementa Comparable para
//que los empleados se ordenen por salario en orden descendente y, si dos empleados tienen el mismo
//salario, desempata por nombre en orden ascendente. Crea una lista de Empleados y muéstralos
//ordenados.

public class Empleado implements Comparable<Empleado>{
	private String nombre;
	private double salario;
	private String antiguedad;
	
	public Empleado(String nombre, double salario, String antiguedad) {
		this.nombre = nombre;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public int compareTo(Empleado o) {
        int comparacionSalario = Double.compare(o.salario, this.salario);
        if (comparacionSalario == 0) {
            return this.nombre.compareTo(o.nombre);
        }        
        return comparacionSalario;
    }
	
}
