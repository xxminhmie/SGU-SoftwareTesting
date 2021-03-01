import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tuan4TH {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(new Dimension(200,200));
		frame.setLayout(new GridLayout(2,2));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLACK);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.YELLOW);
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.BLUE);


		
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);
		
		
		panel1.add(tf1);
		panel1.add(tf2);

		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
