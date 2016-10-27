package com.nghiabui.lochelper.view;

import javax.swing.*;

public class BaseUi extends JPanel {
	
	public void error(String message) {
		JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
	}
	
}
