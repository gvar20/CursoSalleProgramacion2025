package inicio;

import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    
    public static void main(String[] args){
    
       try (Scanner sc = new Scanner(System.in)) {
		int opcion=0;
		   
		   do{
		        System.out.println("-----------------");
		        System.out.println(" Aplicacion de mensajes");
		        System.out.println(" 1. crear mensaje");
		        System.out.println(" 2. listar mensajes");
		        System.out.println(" 3. editar mensaje");
		        System.out.println(" 4. eliminar mensaje");
		        System.out.println(" 5. salir");
		        //leemos la opcion del usuario
		        opcion = sc.nextInt();
		        
		        switch (opcion){
		            case 1:
		                mensajesService.crearMensaje();
		                break;
		            case 2:
		                mensajesService.listarMensajes();
		                break;
		            case 3:
		                mensajesService.borrarMensaje();
		                break;
		            case 4:
		                mensajesService.editarMensaje();
		                break;
		            default:
		                break;
		        }
		       
		   }while(opcion != 5);
	}
        
       
    }
    
}
