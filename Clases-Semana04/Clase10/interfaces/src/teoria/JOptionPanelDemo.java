package teoria;

import javax.swing.JOptionPane;

public class JOptionPanelDemo {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "HOOOLL", "VENTANA", JOptionPane.ERROR_MESSAGE);
    	String edad_str = JOptionPane.showInputDialog("Bienvenido, ingresa tu edad: ");
    	int edad_int = Integer.parseInt(edad_str);
    	if(edad_int<18) {
    		JOptionPane.showMessageDialog(null, "Usted es menor de edad", "Precaución", JOptionPane.ERROR_MESSAGE);
    	}else {
    		JOptionPane.showMessageDialog(null, "Usted tiene acceso", "Acceso completo", JOptionPane.INFORMATION_MESSAGE);
    	}
    }
}


