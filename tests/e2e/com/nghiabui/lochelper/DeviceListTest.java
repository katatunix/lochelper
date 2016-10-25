package com.nghiabui.lochelper;

import com.nghiabui.lochelper.adapter.AdDeviceList;
import com.nghiabui.lochelper.usecase.UcDeviceList;
import com.nghiabui.lochelper.view.UiDeviceList;

import javax.swing.*;

public class DeviceListTest {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			final AdDeviceList adapter = new AdDeviceList(new UcDeviceList());
			final UiDeviceList ui = new UiDeviceList(adapter);
			adapter.setUi(ui);
			final JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setContentPane(ui);
			frame.setSize(400, 100);
			frame.setVisible(true);
		});
	}
	
}
