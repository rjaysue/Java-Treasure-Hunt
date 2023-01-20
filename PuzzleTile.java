import java.awt.*;
import javax.swing.JButton;
public abstract class PuzzleTile extends JButton{

	private Color color;

	public PuzzleTile(Color c,String s){
		super(s);
		this.color = c;
	}

	public Color getColor(){
		return color;
	}
	
	public void setColor(Color c){
		this.color = c;
		this.setBackground(c);
	}

	public void clicked(){
		this.setColor(color);
		this.setText("");
	}


	

	public String toString(){
		return("");
	}
}