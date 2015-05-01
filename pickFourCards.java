import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class pickFourCards extends JFrame{
	private JButton jbtRefresh = new JButton("Refresh");

	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	
	private JLabel card1;
	private JLabel card2;
	private JLabel card3;
	private JLabel card4;
	
	private ImageIcon[] image = {new ImageIcon("card/1.png"),new ImageIcon("card/2.png"),
		new ImageIcon("card/3.png"),new ImageIcon("card/4.png"),new ImageIcon("card/5.png"),
		new ImageIcon("card/6.png"),new ImageIcon("card/7.png"),new ImageIcon("card/8.png"),
		new ImageIcon("card/9.png"),new ImageIcon("card/10.png"),new ImageIcon("card/11.png"),
		new ImageIcon("card/12.png"),new ImageIcon("card/13.png"),new ImageIcon("card/14.png"),
		new ImageIcon("card/15.png"),new ImageIcon("card/16.png"),new ImageIcon("card/17.png"),
		new ImageIcon("card/18.png"),new ImageIcon("card/19.png"),new ImageIcon("card/20.png"),
		new ImageIcon("card/21.png"),new ImageIcon("card/22.png"),new ImageIcon("card/23.png"),
		new ImageIcon("card/24.png"),new ImageIcon("card/25.png"),new ImageIcon("card/26.png"),
		new ImageIcon("card/27.png"),new ImageIcon("card/28.png"),new ImageIcon("card/29.png"),
		new ImageIcon("card/30.png"),new ImageIcon("card/31.png"),new ImageIcon("card/32.png"),
		new ImageIcon("card/33.png"),new ImageIcon("card/34.png"),new ImageIcon("card/35.png"),
		new ImageIcon("card/36.png"),new ImageIcon("card/37.png"),new ImageIcon("card/38.png"),
		new ImageIcon("card/39.png"),new ImageIcon("card/40.png"),new ImageIcon("card/41.png"),
		new ImageIcon("card/42.png"),new ImageIcon("card/43.png"),new ImageIcon("card/44.png"),
		new ImageIcon("card/45.png"),new ImageIcon("card/46.png"),new ImageIcon("card/47.png"),
		new ImageIcon("card/48.png"),new ImageIcon("card/49.png"),new ImageIcon("card/50.png"),
		new ImageIcon("card/51.png"),new ImageIcon("card/52.png")};
	
	public pickFourCards(){

		int first = (int)(Math.random() * 52);
		int second = (int)(Math.random() * 52);
		int third = (int)(Math.random() * 52);
		int forth = (int)(Math.random() * 52);
		
		card1 = new JLabel(image[first]);
		card2 = new JLabel(image[second]);
		card3 = new JLabel(image[third]);
		card4 = new JLabel(image[forth]);
	
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1,4,1,1));
		panel.add(card1);
		panel.add(card2);
		panel.add(card3);
		panel.add(card4);
		
		add(panel1,BorderLayout.SOUTH);
		panel1.add(jbtRefresh, BorderLayout.SOUTH);
	
		jbtRefresh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int first1 = (int)(Math.random() * 52);
				int second1 = (int)(Math.random() * 52);
				int third1 = (int)(Math.random() * 52);
				int forth1 = (int)(Math.random() * 52);
		
				card1.setIcon(image[first1]);
				card2.setIcon(image[second1]);
				card3.setIcon(image[third1]);
				card4.setIcon(image[forth1]);
		
				panel.repaint();
			}
		});
	}
	
	public static void main(String[] args){
		JFrame frame = new pickFourCards();
		frame.setTitle("Pick Four Cards");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}	
}
