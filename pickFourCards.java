import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pickFourCards extends JFrame{
	private JButton jbtRefresh = new JButton("Refresh");

	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	
	public pickFourCards(){
	
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1,4,1,1));
		add(panel1,BorderLayout.SOUTH);
		panel1.add(jbtRefresh, BorderLayout.SOUTH);
	
	}
	
	public static void main(String[] args){
		JFrame frame = new pickFourCards();
		frame.setTitle("Pick Four Cards");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}	
}
