package creacion;

public class UsoMultiplo {
	public static void main(String[] args) {
		Multiplo2 obj1 = new Multiplo2();
		Multiplo2 obj2 = new Multiplo2();
		
		Thread h1 = new Thread(obj1);
		Thread h2 = new Thread(obj2);
		
		h1.start();
		h2.start();
	}
}
