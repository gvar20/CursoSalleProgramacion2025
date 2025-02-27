package Comparacion;

public class Persona {
	
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    /*Comparar dos personas, una es mayor si el nombre es mayor
     *si tienen el mismo nombre, verificar el apellido
     *si tienen el mismo apellido verificar la edad 
     */
    
    public int compareTo(Persona other) {
    	int v_nombre = nombre.compareTo(other.getNombre());
    	int v_apellido = apellido.compareTo(other.getApellido());
    	
    	if (v_nombre != 0) {
    		return v_nombre;
    	}else if(v_apellido != 0){
    		return v_apellido;
    	}else if(edad > other.getEdad()){
    		return 1;
    	}else if(edad < other.getEdad()) {
    		return -1;
    	}
		return 0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
	
}
