package view.frame.menubar.driver.adddriver.googledrive;

import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class GoogleDrive extends JMenuItem {

	public GoogleDrive() {
		this.setText("Google Drive");
		
		this.addActionListener(new OnClick());
	}
}
