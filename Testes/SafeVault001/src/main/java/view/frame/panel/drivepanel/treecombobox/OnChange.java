package view.frame.panel.drivepanel.treecombobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import engine.drive.Drive;
import engine.drive.file.File;
import view.View;
import view.frame.panel.drivepanel.DrivePanel;
import view.frame.panel.drivepanel.treescrollpane.tree.Tree;

public class OnChange implements ActionListener {
	
	private TreeComboBox treeComboBox;
	
	public OnChange(TreeComboBox treeComboBox) {
		this.treeComboBox = treeComboBox;
	}
	
	private DrivePanel getDrivePanel() {
		if(View.frame.panel.firstDrivePanel.treeComboBox == treeComboBox)
			return View.frame.panel.firstDrivePanel;
		
		return View.frame.panel.secondDrivePanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Tree tree = getDrivePanel().treeScrollPane.tree;
		Drive drive = (Drive)treeComboBox.getSelectedItem();
		
		tree.setDrive(drive);
		tree.newRoot(new File("", "folder"));
	}

}
