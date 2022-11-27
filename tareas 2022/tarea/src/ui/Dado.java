package ui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Dado extends JFrame {
	public String path="src/dados/";
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dado frame = new Dado();
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
	public Dado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDad = new JLabel("");
		lblDad.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDad.setBounds(32, 31, 175, 179);
		contentPane.add(lblDad);
		
		JButton btnNewButton = new JButton("tirar Dado");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r= new Random();
				int tiro = r.nextInt(1,7);
				ImageIcon im= new ImageIcon(path+tiro+".png");
				ImageIcon i= new ImageIcon(im.getImage().getScaledInstance(lblDad.getWidth(), lblDad.getHeight(),Image.SCALE_DEFAULT));
				lblDad.setIcon(i);
				
			}
		});
		btnNewButton.setBounds(248, 83, 124, 77);
		contentPane.add(btnNewButton);
	}
}
