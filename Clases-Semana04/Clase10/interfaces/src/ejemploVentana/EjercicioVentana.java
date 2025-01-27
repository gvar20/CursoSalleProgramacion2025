package ejemploVentana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjercicioVentana extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtNota;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioVentana frame = new EjercicioVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EjercicioVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Edad");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(66, 8, 225, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(66, 33, 46, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtNota = new JTextField();
		txtNota.setBounds(66, 58, 46, 20);
		contentPane.add(txtNota);
		txtNota.setColumns(10);
		
		JLabel lblMensaje = new JLabel("");
		lblMensaje.setBounds(89, 121, 284, 14);
		contentPane.add(lblMensaje);
		
		JButton btnEnviar = new JButton("Enviar Datos");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nombre = txtNombre.getText();
					int edad = Integer.parseInt(txtEdad.getText());
					float nota = Float.parseFloat(txtNota.getText());
					
					if(edad < 18) {
						lblMensaje.setText(nombre + " usted es menor de edad.");
					}else {
						lblMensaje.setText(nombre + " usted es mayor de edad.");
					}
					
					if (nota < 11.5) {
						JOptionPane.showMessageDialog(null, "Usted desaprobó", "Desaprobado " + nota, JOptionPane.ERROR_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Usted aprobó", "Aprobado " + nota, JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (Exception e2) {
					lblMensaje.setText(e2.getMessage());
				}
				
				
			}
		});
		btnEnviar.setBounds(10, 86, 123, 23);
		contentPane.add(btnEnviar);
		
		
	}

	@SuppressWarnings("unused")
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
