import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PickFourCards extends JFrame{
	private JButton jbtRefresh = new JButton("Refresh");
	private ImageIcon image1 = new ImageIcon("src/c1.png"); 
	private ImageIcon image2 = new ImageIcon("src/c2.png");
	private ImageIcon image3 = new ImageIcon("src/c3.png");
	private ImageIcon image4 = new ImageIcon("src/c4.png");
	private ImageIcon image5 = new ImageIcon("src/c5.png");
	private ImageIcon image6 = new ImageIcon("src/c6.png");
	private ImageIcon image7 = new ImageIcon("src/c7.png");
	private ImageIcon image8 = new ImageIcon("src/c8.png");
	private ImageIcon image9 = new ImageIcon("src/c9.png");
	private ImageIcon image10 = new ImageIcon("src/c10.png");
	private ImageIcon image11 = new ImageIcon("src/c11.png");
	private ImageIcon image12 = new ImageIcon("src/c12.png");
	private ImageIcon image13 = new ImageIcon("src/c13.png");
	private ImageIcon image14 = new ImageIcon("src/d1.png");
	private ImageIcon image15 = new ImageIcon("src/d2.png");
	private ImageIcon image16 = new ImageIcon("src/d3.png");
	private ImageIcon image17 = new ImageIcon("src/d4.png");
	private ImageIcon image18 = new ImageIcon("src/d5.png");
	private ImageIcon image19 = new ImageIcon("src/d6.png");
	private ImageIcon image20 = new ImageIcon("src/d7.png");
	private ImageIcon image21 = new ImageIcon("src/d8.png");
	private ImageIcon image22 = new ImageIcon("src/d9.png");
	private ImageIcon image23 = new ImageIcon("src/d10.png");
	private ImageIcon image24 = new ImageIcon("src/d11.png");
	private ImageIcon image25 = new ImageIcon("src/d12.png");
	private ImageIcon image26 = new ImageIcon("src/d13.png");
	private ImageIcon image27 = new ImageIcon("src/h1.png");
	private ImageIcon image28 = new ImageIcon("src/h2.png");
	private ImageIcon image29 = new ImageIcon("src/h3.png");
	private ImageIcon image30 = new ImageIcon("src/h4.png");
	private ImageIcon image31 = new ImageIcon("src/h5.png");
	private ImageIcon image32 = new ImageIcon("src/h6.png");
	private ImageIcon image33 = new ImageIcon("src/h7.png");
	private ImageIcon image34 = new ImageIcon("src/h8.png");
	private ImageIcon image35 = new ImageIcon("src/h9.png");
	private ImageIcon image36 = new ImageIcon("src/h10.png");
	private ImageIcon image37 = new ImageIcon("src/h11.png");
	private ImageIcon image38 = new ImageIcon("src/h12.png");
	private ImageIcon image39 = new ImageIcon("src/h13.png");
	private ImageIcon image40 = new ImageIcon("src/s1.png");
	private ImageIcon image41 = new ImageIcon("src/s2.png");
	private ImageIcon image42 = new ImageIcon("src/s3.png");
	private ImageIcon image43 = new ImageIcon("src/s4.png");
	private ImageIcon image44 = new ImageIcon("src/s5.png");
	private ImageIcon image45 = new ImageIcon("src/s6.png");
	private ImageIcon image46 = new ImageIcon("src/s7.png");
	private ImageIcon image47 = new ImageIcon("src/s8.png");
	private ImageIcon image48 = new ImageIcon("src/s9.png");
	private ImageIcon image49 = new ImageIcon("src/s10.png");
	private ImageIcon image50 = new ImageIcon("src/s11.png");
	private ImageIcon image51 = new ImageIcon("src/s12.png");
	private ImageIcon image52 = new ImageIcon("src/s13.png");
	
	ArrayList<ImageIcon> list = new ArrayList<ImageIcon>();
	

	public PickFourCards(){
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,4,1,1));
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
		
		
		
		
		this.add(jbtRefresh,BorderLayout.SOUTH);
		this.add(panel,BorderLayout.CENTER);
	}
	
	public static void main(String[] args){
		JFrame frame = new PickFourCards();
		frame.setTitle("Pick Four Cards");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
	}
	
}

class CardPanel extends JPanel{
	
}
