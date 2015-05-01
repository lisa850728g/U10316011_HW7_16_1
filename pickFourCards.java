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
	
	private ImageIcon image1 = new ImageIcon("card/1.png");
	private ImageIcon image2 = new ImageIcon("card/2.png");
	private ImageIcon image3 = new ImageIcon("card/3.png");
	private ImageIcon image4 = new ImageIcon("card/4.png");
	private ImageIcon image5 = new ImageIcon("card/5.png");
	private ImageIcon image6 = new ImageIcon("card/6.png");
	private ImageIcon image7 = new ImageIcon("card/7.png");
	private ImageIcon image8 = new ImageIcon("card/8.png");
	private ImageIcon image9 = new ImageIcon("card/9.png");
	private ImageIcon image10 = new ImageIcon("card/10.png");
	private ImageIcon image11 = new ImageIcon("card/11.png");
	private ImageIcon image12 = new ImageIcon("card/12.png");
	private ImageIcon image13 = new ImageIcon("card/13.png");
	private ImageIcon image14 = new ImageIcon("card/14.png");
	private ImageIcon image15 = new ImageIcon("card/15.png");
	private ImageIcon image16 = new ImageIcon("card/16.png");
	private ImageIcon image17 = new ImageIcon("card/17.png");
	private ImageIcon image18 = new ImageIcon("card/18.png");
	private ImageIcon image19 = new ImageIcon("card/19.png");
	private ImageIcon image20 = new ImageIcon("card/20.png");
	private ImageIcon image21 = new ImageIcon("card/21.png");
	private ImageIcon image22 = new ImageIcon("card/22.png");
	private ImageIcon image23 = new ImageIcon("card/23.png");
	private ImageIcon image24 = new ImageIcon("card/24.png");
	private ImageIcon image25 = new ImageIcon("card/25.png");
	private ImageIcon image26 = new ImageIcon("card/26.png");
	private ImageIcon image27 = new ImageIcon("card/27.png");
	private ImageIcon image28 = new ImageIcon("card/28.png");
	private ImageIcon image29 = new ImageIcon("card/29.png");
	private ImageIcon image30 = new ImageIcon("card/30.png");
	private ImageIcon image31 = new ImageIcon("card/31.png");
	private ImageIcon image32 = new ImageIcon("card/32.png");
	private ImageIcon image33 = new ImageIcon("card/33.png");
	private ImageIcon image34 = new ImageIcon("card/34.png");
	private ImageIcon image35 = new ImageIcon("card/35.png");
	private ImageIcon image36 = new ImageIcon("card/36.png");
	private ImageIcon image37 = new ImageIcon("card/37.png");
	private ImageIcon image38 = new ImageIcon("card/38.png");
	private ImageIcon image39 = new ImageIcon("card/39.png");
	private ImageIcon image40 = new ImageIcon("card/40.png");
	private ImageIcon image41 = new ImageIcon("card/41.png");
	private ImageIcon image42 = new ImageIcon("card/42.png");
	private ImageIcon image43 = new ImageIcon("card/43.png");
	private ImageIcon image44 = new ImageIcon("card/44.png");
	private ImageIcon image45 = new ImageIcon("card/45.png");
	private ImageIcon image46 = new ImageIcon("card/46.png");
	private ImageIcon image47 = new ImageIcon("card/47.png");
	private ImageIcon image48 = new ImageIcon("card/48.png");
	private ImageIcon image49 = new ImageIcon("card/49.png");
	private ImageIcon image50 = new ImageIcon("card/50.png");
	private ImageIcon image51 = new ImageIcon("card/51.png");
	private ImageIcon image52 = new ImageIcon("card/52.png");
	
	public pickFourCards(){
	
		ArrayList<ImageIcon> list = new ArrayList<ImageIcon>();
		list.add(image1);
		list.add(image2);
		list.add(image3);
		list.add(image4);
		list.add(image5);
		list.add(image6);
		list.add(image7);
		list.add(image8);
		list.add(image9);
		list.add(image10);
		list.add(image11);
		list.add(image12);
		list.add(image13);
		list.add(image14);
		list.add(image15);
		list.add(image16);
		list.add(image17);
		list.add(image18);
		list.add(image19);
		list.add(image20);
		list.add(image21);
		list.add(image22);
		list.add(image23);
		list.add(image24);
		list.add(image25);
		list.add(image26);
		list.add(image27);
		list.add(image28);
		list.add(image29);
		list.add(image30);
		list.add(image31);
		list.add(image32);
		list.add(image33);
		list.add(image34);
		list.add(image35);
		list.add(image36);
		list.add(image37);
		list.add(image38);
		list.add(image39);
		list.add(image40);
		list.add(image41);
		list.add(image42);
		list.add(image43);
		list.add(image44);
		list.add(image45);
		list.add(image46);
		list.add(image47);
		list.add(image48);
		list.add(image49);
		list.add(image50);
		list.add(image51);
		list.add(image52);
		
		Collections.shuffle(list);
		card1 = new JLabel(list.get(1));
		card2 = new JLabel(list.get(2));
		card3 = new JLabel(list.get(3));
		card4 = new JLabel(list.get(4));
	
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1,4,1,1));
		panel.add(card1);
		panel.add(card2);
		panel.add(card3);
		panel.add(card4);
		
		add(panel1,BorderLayout.SOUTH);
		panel1.add(jbtRefresh, BorderLayout.SOUTH);
	
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
