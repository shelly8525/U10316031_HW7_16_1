import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class PickFourCards extends JFrame{
	private JButton jbtRefresh = new JButton("Refresh");
	private ImageIcon image1 = new ImageIcon(""); 
	private ImageIcon image2 = new ImageIcon("");
	private ImageIcon image3 = new ImageIcon("");
	private ImageIcon image4 = new ImageIcon("");
	private ImageIcon image5 = new ImageIcon("");
	private ImageIcon image6 = new ImageIcon("");
	private ImageIcon image7 = new ImageIcon("");
	private ImageIcon image8 = new ImageIcon("");
	private ImageIcon image9 = new ImageIcon("");
	private ImageIcon image10 = new ImageIcon("");
	private ImageIcon image11 = new ImageIcon("");
	private ImageIcon image12 = new ImageIcon("");
	private ImageIcon image13 = new ImageIcon("");
	private ImageIcon image14 = new ImageIcon("");
	private ImageIcon image15 = new ImageIcon("");
	private ImageIcon image16 = new ImageIcon("");
	private ImageIcon image17 = new ImageIcon("");
	private ImageIcon image18 = new ImageIcon("");
	private ImageIcon image19 = new ImageIcon("");
	private ImageIcon image20 = new ImageIcon("");
	private ImageIcon image21 = new ImageIcon("");
	private ImageIcon image22 = new ImageIcon("");
	private ImageIcon image23 = new ImageIcon("");
	private ImageIcon image24 = new ImageIcon("");
	private ImageIcon image25 = new ImageIcon("");
	private ImageIcon image26 = new ImageIcon("");
	private ImageIcon image27 = new ImageIcon("");
	private ImageIcon image28 = new ImageIcon("");
	private ImageIcon image29 = new ImageIcon("");
	private ImageIcon image30 = new ImageIcon("");
	private ImageIcon image31 = new ImageIcon("");
	private ImageIcon image32 = new ImageIcon("");
	private ImageIcon image33 = new ImageIcon("");
	private ImageIcon image34 = new ImageIcon("");
	private ImageIcon image35 = new ImageIcon("");
	private ImageIcon image36 = new ImageIcon("");
	private ImageIcon image37 = new ImageIcon("");
	private ImageIcon image38 = new ImageIcon("");
	private ImageIcon image39 = new ImageIcon("");
	private ImageIcon image40 = new ImageIcon("");
	private ImageIcon image41 = new ImageIcon("");
	private ImageIcon image42 = new ImageIcon("");
	private ImageIcon image43 = new ImageIcon("");
	private ImageIcon image44 = new ImageIcon("");
	private ImageIcon image45 = new ImageIcon("");
	private ImageIcon image46 = new ImageIcon("");
	private ImageIcon image47 = new ImageIcon("");
	private ImageIcon image48 = new ImageIcon("");
	private ImageIcon image49 = new ImageIcon("");
	private ImageIcon image50 = new ImageIcon("");
	private ImageIcon image51 = new ImageIcon("");
	private ImageIcon image52 = new ImageIcon("");
	
	ArrayList<ImageIcon> list = new ArrayList<ImageIcon>();
	
	
	public PickFourCards(){
		JPanel panel = new JPanel();
		panel.add(jbtRefresh);
		
		this.add(panel,BorderLayout.SOUTH);
		
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
