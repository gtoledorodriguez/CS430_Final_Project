package min_spanning_shortest_path;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Prim_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prim_GUI window = new Prim_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prim_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 805, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(255, 50, 259, 271);
		frame.getContentPane().add(textArea);
		
		JButton btnFixedMatrix = new JButton("Fixed Matrix");
		btnFixedMatrix.setBounds(277, 392, 103, 37);
		frame.getContentPane().add(btnFixedMatrix);
		
		JButton btnRandomMatrix = new JButton("Random Matrix");
		btnRandomMatrix.setBounds(405, 392, 127, 37);
		frame.getContentPane().add(btnRandomMatrix);
		
		JTextArea txtrFixedMatrix = new JTextArea();
		txtrFixedMatrix.setEditable(false);
		txtrFixedMatrix.setBounds(26, 50, 208, 271);
		frame.getContentPane().add(txtrFixedMatrix);
		
		JTextArea txtrRandomMatrix = new JTextArea();
		txtrRandomMatrix.setEditable(false);
		txtrRandomMatrix.setBounds(536, 50, 208, 271);
		frame.getContentPane().add(txtrRandomMatrix);
		
		JLabel lblFixedMatrix = new JLabel("Fixed Matrix");
		lblFixedMatrix.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFixedMatrix.setHorizontalAlignment(SwingConstants.CENTER);
		lblFixedMatrix.setBounds(26, 10, 208, 30);
		frame.getContentPane().add(lblFixedMatrix);
		
		JLabel lblRandomMatrix = new JLabel("Random Matrix");
		lblRandomMatrix.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblRandomMatrix.setHorizontalAlignment(SwingConstants.CENTER);
		lblRandomMatrix.setBounds(536, 10, 208, 30);
		frame.getContentPane().add(lblRandomMatrix);
		
		JLabel lblEdge = new JLabel("Edge - Weight");
		lblEdge.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblEdge.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdge.setBounds(285, 10, 208, 30);
		frame.getContentPane().add(lblEdge);
		
		JLabel lblToRunThe = new JLabel("To run the MST, choose a matrix");
		lblToRunThe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblToRunThe.setBounds(301, 343, 192, 39);
		frame.getContentPane().add(lblToRunThe);
	}
}
