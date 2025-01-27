package teoria;


/*
 *Saludar al usuario y pedir que ingrese su nota 
 * indicar si esta desaprobado con un warning
 * si esta aprobado con menos de 16 un question message
 * si esta aprobado con mas de 16 con un mensaje de felicitacion information message
 *si esta fiera de rango un error message
 */

import javax.swing.JOptionPane;

public class Ejercicio01AvanceClase {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hola Usuario, Bienvenido al sistema de Notas", "Bienvenida", JOptionPane.CLOSED_OPTION);
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Bienvenido, ingresa tu edad: "));
		if (nota < 0 && nota > 20) {
			JOptionPane.showMessageDialog(null, "Usted ingreso una nota fuera del rango", "Nota fuera del rango", JOptionPane.ERROR_MESSAGE);
		}else if (nota <= 16) {
			JOptionPane.showMessageDialog(null, "Usted está aprobado con menos o igual a 16", "Nota aprobatoria", JOptionPane.QUESTION_MESSAGE);
		}else if (nota > 16){
			JOptionPane.showMessageDialog(null, "Usted está aprobado con más de 16", "Nota satisfactoria", JOptionPane.INFORMATION_MESSAGE);
		}else if (nota < 11.5) {
			JOptionPane.showMessageDialog(null, "Usted está desaprobado", "Nota desaprobatoria", JOptionPane.WARNING_MESSAGE);
		} 
	}
}
