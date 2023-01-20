import javax.swing.JFrame;

public class TreasureHunt{
	public static void main(String[] args){
		JFrame frame = new JFrame("Treasure Hunt");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TreasureHuntPanel());
		frame.pack();
		frame.setVisible(true);
	}
}