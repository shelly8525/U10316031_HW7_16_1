import javax.swing.*;
import java.awt.*;

public class PickFourCards extends JFrame{
	private JButton jbtRefresh = new JButton("Refresh");
	
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
