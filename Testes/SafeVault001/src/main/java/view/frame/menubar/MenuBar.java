package view.frame.menubar;

import javax.swing.JMenuBar;

import view.frame.menubar.drive.Drive;
import view.frame.menubar.help.Help;

@SuppressWarnings("serial")
public class MenuBar extends JMenuBar {
	
	public Drive driver = new Drive();
	public Help help = new Help();

	public MenuBar() {		

		this.add(driver);
		this.add(help);
		
		this.setVisible(true);
	}
}
