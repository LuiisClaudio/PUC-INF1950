package view.frame.panel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JPanel;

import view.frame.panel.buttonspanel.ButtonsPanel;
import view.frame.panel.drivepanel.DrivePanel;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	
	public DrivePanel firstDrivePanel = new DrivePanel();
	public DrivePanel secondDrivePanel = new DrivePanel();
	public ButtonsPanel buttonsPanel = new ButtonsPanel(firstDrivePanel, secondDrivePanel);
	
	public Panel() {		
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints constraints;
		
		constraints = new GridBagConstraints();
		constraints.gridx = this.getComponentCount();
		constraints.weightx = 1;
		constraints.weighty = 1;
		constraints.insets = new Insets(10, 10, 10, 0);
		constraints.fill = GridBagConstraints.BOTH;
		
		this.add(firstDrivePanel, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = this.getComponentCount();
		
		this.add(buttonsPanel, constraints);
		
		constraints = new GridBagConstraints();
		constraints.gridx = this.getComponentCount();
		constraints.weightx = 1;
		constraints.weighty = 1;
		constraints.insets = new Insets(10, 0, 10, 10);
		constraints.fill = GridBagConstraints.BOTH;
		
		this.add(secondDrivePanel, constraints);
	}
}
