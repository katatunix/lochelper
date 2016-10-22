package com.nghiabui.lochelper;

import javax.swing.*;

public class Main {
	
	public static void main(String[] args) {
		Nghia nghia = new Nghia();
		
		JFrame frame = new JFrame("Nghia");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(nghia.panel);
		frame.setBounds(400, 100, 500, 300);
		frame.setVisible(true);
	}
	
}
