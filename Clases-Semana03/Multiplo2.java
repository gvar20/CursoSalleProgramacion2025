package creacion;

public class Multiplo2 implements Runnable {

	public void run() {
		int contador = 0;
		for (int i = 1; contador < 20; i++) {
            if(i%2==0){
            	System.out.println("M�ltiplo: " + i + " Hilo: " + Thread.currentThread().getName());
            	contador++;
            }
        }	
	}
	
}
