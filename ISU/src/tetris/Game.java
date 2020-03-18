
package tetris;

import javax.swing.JFrame;

public class Game {
	
	public static void main(String[] args) {
		Introduction menu=new Introduction();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		menu.setSize(400,400);
		menu.setVisible(true);		
	}		
}
