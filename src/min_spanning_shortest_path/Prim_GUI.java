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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prim_GUI {

	private JFrame frame;
	Prim_Min_Span_Tree mst1 = new Prim_Min_Span_Tree();
	int[][] standard = mst1.getMatrix();
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
		btnFixedMatrix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prim_Min_Span_Tree mst3 = new Prim_Min_Span_Tree(standard); //For some reason it wouldn't be able to use the normal one
		        															//So to the fixed matrix from above and made it into a new variable to be reused.
		        String str3 = mst3.primMST(mst3.getMatrix());
				textArea.setText(str3);
			}
		});
		btnFixedMatrix.setBounds(277, 392, 103, 37);
		frame.getContentPane().add(btnFixedMatrix);
		
		
		JTextArea txtrFixedMatrix = new JTextArea(mst1.toString(mst1.getMatrix()));
		txtrFixedMatrix.setEditable(false);
		txtrFixedMatrix.setBounds(26, 50, 208, 271);
		frame.getContentPane().add(txtrFixedMatrix);
		
		
		JTextArea txtrRandomMatrix = new JTextArea();
		txtrRandomMatrix.setEditable(false);
		txtrRandomMatrix.setBounds(536, 50, 208, 271);
		frame.getContentPane().add(txtrRandomMatrix);
		
		
		JButton btnRandomMatrix = new JButton("Random Matrix");
		btnRandomMatrix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int [][] m = Prim_Min_Span_Tree.randMatrix();
		        Prim_Min_Span_Tree mst2 = new Prim_Min_Span_Tree(m);
		        txtrRandomMatrix.setText(mst2.toString(mst2.getMatrix()));
		        
		        String str2 = mst2.primMST(mst2.getMatrix());
				textArea.setText(str2);
			}
		});
		btnRandomMatrix.setBounds(405, 392, 127, 37);
		frame.getContentPane().add(btnRandomMatrix);
		
		
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
