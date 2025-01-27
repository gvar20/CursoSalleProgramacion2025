package ejemploVentana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JTree;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

public class MiVentana extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentana frame = new MiVentana();
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
	public MiVentana() {
		setBackground(new Color(0, 255, 128));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Haga clic en uno de los 4 botones");
		lblNewLabel.setBounds(33, 14, 160, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Bot\u00F3n 1");
		btnNewButton_1.setBounds(198, 10, 69, 23);
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Apretó el botón 1");
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Bot\u00F3n 2");
		btnNewButton.setBounds(272, 10, 69, 23);
		btnNewButton.setBackground(new Color(255, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Apretó el botón 2");
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Bot\u00F3n 3");
		btnNewButton_2.setBounds(346, 10, 69, 23);
		btnNewButton_2.setBackground(new Color(0, 0, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Apretó el botón 3");
			}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Bot\u00F3n 4");
		btnNewButton_3.setBounds(420, 10, 69, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Apretó el botón 4");
			}
		});
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(32, 107, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(33, 125, 197, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblSaludo = new JLabel("");
		lblSaludo.setBounds(200, 213, 176, 14);
		contentPane.add(lblSaludo);
		
		JButton btnNombre = new JButton("Enviar Nombre");
		btnNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombretxt = txtNombre.getText();
				lblSaludo.setText("Bienvenido " + nombretxt);
			}
		});
		btnNombre.setBounds(272, 124, 160, 23);
		contentPane.add(btnNombre);
		
		
	}
}
