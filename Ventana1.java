import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(60, 103, 46, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.setBounds(60, 137, 46, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1");
		btnNewButton_2.setBounds(60, 171, 46, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("0");
		btnNewButton_3.setBounds(60, 205, 46, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("=");
		btnNewButton_4.setBounds(116, 205, 98, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("2");
		btnNewButton_5.setBounds(116, 171, 46, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3");
		btnNewButton_6.setBounds(168, 171, 46, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("*");
		btnNewButton_7.setBounds(224, 171, 46, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("/");
		btnNewButton_8.setBounds(224, 205, 46, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("-");
		btnNewButton_9.setBounds(224, 137, 46, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.setBounds(224, 103, 46, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("8");
		btnNewButton_11.setBounds(116, 103, 46, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("9");
		btnNewButton_12.setBounds(168, 103, 46, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("6");
		btnNewButton_13.setBounds(168, 137, 46, 23);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("5");
		btnNewButton_14.setBounds(116, 137, 46, 23);
		contentPane.add(btnNewButton_14);
	}

}
