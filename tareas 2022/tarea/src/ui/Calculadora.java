package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bll.OperacionesCalcu;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField var1;
	private JTextField var2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setBounds(153, 28, 104, 24);
		contentPane.add(lblNewLabel);
		
		var1 = new JTextField();
		var1.setBounds(53, 102, 86, 20);
		contentPane.add(var1);
		var1.setColumns(10);
		
		var2 = new JTextField();
		var2.setBounds(221, 102, 86, 20);
		contentPane.add(var2);
		var2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "^"}));
		comboBox.setBounds(153, 101, 58, 22);
		contentPane.add(comboBox);
		
		JLabel lblResultado = new JLabel("El Resultado es: ");
		lblResultado.setBounds(126, 208, 258, 24);
		contentPane.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a;
				double b;
				try {
					a=Double.parseDouble(var1.getText());
					b=Double.parseDouble(var2.getText());
					OperacionesCalcu cac= new OperacionesCalcu(a,b);
					if (comboBox.getSelectedItem().toString()=="+") {
						String rest="El resultado es:"+Double.toString(cac.suma());
						lblResultado.setText(rest);
					}
					else if(comboBox.getSelectedItem().toString()=="-") {
						String rest="El resultado es:"+Double.toString(cac.resta());
						lblResultado.setText(rest);
					}
					else if(comboBox.getSelectedItem().toString()=="/") {
						String rest="El resultado es:"+Double.toString(cac.division());
						lblResultado.setText(rest);
					}
					else if(comboBox.getSelectedItem().toString()=="*") {
						String rest="El resultado es:"+Double.toString(cac.multi());
						lblResultado.setText(rest);
					}
					else if(comboBox.getSelectedItem().toString()=="^") {
						String rest="El resultado es:"+Double.toString(cac.potencia());
						lblResultado.setText(rest);
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		btnCalcular.setBounds(135, 156, 89, 23);
		contentPane.add(btnCalcular);
		
		
	}
}
