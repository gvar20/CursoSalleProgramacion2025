package Comparacion;

public class MainPersona {
	public static void main(String[] args) {
		Persona p1 = new Persona("Luis", "Mendez", 13);
		Persona p2 = new Persona("Luis", "Mendez", 15);
		
		/*
		if(p1.getNombre().compareTo(p2.getNombre()) > 0){
			System.out.println("El mayor es: " + p1.getNombre());
		}else {
			System.out.println("El mayor es: " + p2.getNombre());
		}
		*/
		int comparacion = p1.compareTo(p2);
		if(comparacion==0) {
			System.out.println("Ambos son iguales");
		}else if(comparacion > 0) {
			System.out.println("El mayor es p1: "+p1.getNombre());
		}else {
			System.out.println("El mayor es p2: "+p2.getNombre());
		}
	}
}

/*Comparar dos personas, una es mayor si el nombre es mayor
 *si tienen el mismo nombre, verificar el apellido
 *si tienen el mismo apellido verificar la edad 
 */