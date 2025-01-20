package creacion;

public class MostrarCeroUno {
	public static void mostrarCero() {
		for (int i=0; i<100; i++) {
			System.out.print("0");
		}
	}
	public static void mostrarUno() {
		for (int i=0; i<100; i++) {
			System.out.print("1");
		}
	}
	public static void main(String[] args) {
		mostrarCero();
		mostrarUno();
	}
}
