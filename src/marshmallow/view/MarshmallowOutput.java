package marshmallow.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.print("My monster info is: " + info);
		
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, " My monter information is" + info);
		JOptionPane.showMessageDialog(null, " This is a pop up ") ;
		JOptionPane.showMessageDialog(null, "You will see a lot of me =)");
		JOptionPane.showMessageDialog(null, "You think that if you just press ok you can get rid of me");
		JOptionPane.showMessageDialog(null, "You think this is a game");
		JOptionPane.showMessageDialog(null, "Ok lets play a game. If you press ok agen I will turn off the computer");
		
	}
}
