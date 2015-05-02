import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**以圖形介面顯示出四張撲克牌和一個按鈕
 * 而這四張撲克牌是從52張撲克牌中亂數選取的
 * 下面的rRefresh按鈕，會重新抽四張撲克牌，再顯示在介面上
 */
public class pickFourCards extends JFrame{
	//建立一個叫做Refresh的按鈕
	private JButton jbtRefresh = new JButton("Refresh");

	//建立兩個畫布
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	
	//設四個標籤型態的變數
	private JLabel card1;
	private JLabel card2;
	private JLabel card3;
	private JLabel card4;
	
	//建立一個ImageIcon的陣列，傳入52張撲克牌的圖片
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
	
	//Constructor
	public pickFourCards(){

		//An array named deck in int type
		int[] deck = new int[52];
		
		//Initialize the array
		for(int i = 0 ; i < deck.length ; i++)
			deck[i] = i;
		
		//Shuffle tha array	
		for(int i = 0 ; i < deck.length ; i ++){
			int random = (int)(Math.random() * deck.length);
			int tempt = deck[i];
			deck[i] = deck[random];
			deck[random] = tempt;
		}
		
		//使用deck陣列的前四個數字，當作取得image陣列的四個數字
		//取得陣列中的四張撲克牌，存入四個變數
		card1 = new JLabel(image[deck[0]]);
		card2 = new JLabel(image[deck[1]]);
		card3 = new JLabel(image[deck[2]]);
		card4 = new JLabel(image[deck[3]]);
		
		//在JFrame中加入第一個畫布，放在中間
		add(panel, BorderLayout.CENTER);
		//將第一個畫布分成一列四行，每行間隔1
		panel.setLayout(new GridLayout(1,4,1,1));
		/*將四張撲克牌加到第一個畫布*/
		panel.add(card1);
		panel.add(card2);
		panel.add(card3);
		panel.add(card4);
		
		//在JFrame中加入第二個畫布，放在南邊
		add(panel1,BorderLayout.SOUTH);
		//將按鈕加到第二個畫布，並且放在畫布的南邊
		panel1.add(jbtRefresh, BorderLayout.SOUTH);
	
		//使用匿名內部類別，使按鈕有功能
		jbtRefresh.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				//重新繪製第一個畫布
				panel.repaint();
				
				//Shuffle the array
				for(int i = 0 ; i < deck.length ; i ++){
					int random = (int)(Math.random() * deck.length);
					int tempt = deck[i];
					deck[i] = deck[random];
					deck[random] = tempt;
				}
		
				//顯示出重新洗牌後被選擇的四張撲克牌
				card1.setIcon(image[deck[0]]);
				card2.setIcon(image[deck[1]]);
				card3.setIcon(image[deck[2]]);
				card4.setIcon(image[deck[3]]);
			}
		});
	}
	
	/*Main method*/
	public static void main(String[] args){
		//New an object
		JFrame frame = new pickFourCards();
		//設定顯示在視窗的名稱
		frame.setTitle("Pick Four Cards");
		//會依照視窗的 size 與螢幕的大小來計算出視窗的位置，使得他出現在螢幕中央
		//這行以前還未設定視窗的大小(size(0,0))，所以視窗的左上角會被放在螢幕中央
		frame.setLocationRelativeTo(null);
		//按下視窗關閉鈕時，程式結束
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//視窗大小依照顯示內容而定
		frame.pack();
		//確定視窗中的內容可被看見
		frame.setVisible(true);
	}	
}
