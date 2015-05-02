import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class PickFourCards extends JFrame{
	//add a button to the frame
	private JButton jbtRefresh = new JButton("Refresh");
	//create four label
	private JLabel a; 
	private JLabel b; 
	private JLabel c; 
	private JLabel d; 
	//add a panel to the frame
	JPanel panel = new JPanel();
	//add 52 pictures address
	private ImageIcon image1 = new ImageIcon("src/1.png"); 
	private ImageIcon image2 = new ImageIcon("src/2.png");
	private ImageIcon image3 = new ImageIcon("src/3.png");
	private ImageIcon image4 = new ImageIcon("src/4.png");
	private ImageIcon image5 = new ImageIcon("src/5.png");
	private ImageIcon image6 = new ImageIcon("src/6.png");
	private ImageIcon image7 = new ImageIcon("src/7.png");
	private ImageIcon image8 = new ImageIcon("src/8.png");
	private ImageIcon image9 = new ImageIcon("src/9.png");
	private ImageIcon image10 = new ImageIcon("src/10.png");
	private ImageIcon image11 = new ImageIcon("src/11.png");
	private ImageIcon image12 = new ImageIcon("src/12.png");
	private ImageIcon image13 = new ImageIcon("src/13.png");
	private ImageIcon image14 = new ImageIcon("src/14.png");
	private ImageIcon image15 = new ImageIcon("src/15.png");
	private ImageIcon image16 = new ImageIcon("src/16.png");
	private ImageIcon image17 = new ImageIcon("src/17.png");
	private ImageIcon image18 = new ImageIcon("src/18.png");
	private ImageIcon image19 = new ImageIcon("src/19.png");
	private ImageIcon image20 = new ImageIcon("src/20.png");
	private ImageIcon image21 = new ImageIcon("src/21.png");
	private ImageIcon image22 = new ImageIcon("src/22.png");
	private ImageIcon image23 = new ImageIcon("src/23.png");
	private ImageIcon image24 = new ImageIcon("src/24.png");
	private ImageIcon image25 = new ImageIcon("src/25.png");
	private ImageIcon image26 = new ImageIcon("src/26.png");
	private ImageIcon image27 = new ImageIcon("src/27.png");
	private ImageIcon image28 = new ImageIcon("src/28.png");
	private ImageIcon image29 = new ImageIcon("src/29.png");
	private ImageIcon image30 = new ImageIcon("src/30.png");
	private ImageIcon image31 = new ImageIcon("src/31.png");
	private ImageIcon image32 = new ImageIcon("src/32.png");
	private ImageIcon image33 = new ImageIcon("src/33.png");
	private ImageIcon image34 = new ImageIcon("src/34.png");
	private ImageIcon image35 = new ImageIcon("src/35.png");
	private ImageIcon image36 = new ImageIcon("src/36.png");
	private ImageIcon image37 = new ImageIcon("src/37.png");
	private ImageIcon image38 = new ImageIcon("src/38.png");
	private ImageIcon image39 = new ImageIcon("src/39.png");
	private ImageIcon image40 = new ImageIcon("src/40.png");
	private ImageIcon image41 = new ImageIcon("src/41.png");
	private ImageIcon image42 = new ImageIcon("src/42.png");
	private ImageIcon image43 = new ImageIcon("src/43.png");
	private ImageIcon image44 = new ImageIcon("src/44.png");
	private ImageIcon image45 = new ImageIcon("src/45.png");
	private ImageIcon image46 = new ImageIcon("src/46.png");
	private ImageIcon image47 = new ImageIcon("src/47.png");
	private ImageIcon image48 = new ImageIcon("src/48.png");
	private ImageIcon image49 = new ImageIcon("src/49.png");
	private ImageIcon image50 = new ImageIcon("src/50.png");
	private ImageIcon image51 = new ImageIcon("src/51.png");
	private ImageIcon image52 = new ImageIcon("src/52.png");
	
	ArrayList<ImageIcon> list = new ArrayList<ImageIcon>();
	
	//the constructor 
	public PickFourCards(){
		//add a gridLayout to the panel
		panel.setLayout(new GridLayout(1,4,1,1));
		//add 52 images to list 
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
		//pick 4 cards
		Collections.shuffle(list);
		//get 4 cards to label
		a = new JLabel(list.get(1));
		b = new JLabel(list.get(2));
		c = new JLabel(list.get(3));
		d = new JLabel(list.get(4));
		//add 4 cards to panel
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		
		//add jbtRefresh to south and panel to center
		this.add(jbtRefresh,BorderLayout.SOUTH);
		this.add(panel,BorderLayout.CENTER);
		//create and register anonymous inner-class listener
		jbtRefresh.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				//pick 4 cards
				Collections.shuffle(list);
				a.setIcon(list.get(1));
				b.setIcon(list.get(2));
				c.setIcon(list.get(3));
				d.setIcon(list.get(4));
				//repaint the panel
				panel.repaint();
			}
		}
		);
	
	}
	//main method 
	public static void main(String[] args){
		//create a frame
		JFrame frame = new PickFourCards();
		frame.setTitle("Pick Four Cards");
		//center the frame
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set the frame size
		frame.setSize(300, 180);
		//display the frame
		frame.setVisible(true);
	}

}




