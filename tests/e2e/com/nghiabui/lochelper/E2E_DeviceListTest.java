package com.nghiabui.lochelper;

import com.nghiabui.lochelper.adapter.AdDeviceList;
import com.nghiabui.lochelper.usecase.UcDeviceList;
import com.nghiabui.lochelper.view.UiDeviceList;

import javax.swing.*;

public class E2E_DeviceListTest {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			final AdDeviceList ad = new AdDeviceList(new UcDeviceList());
			final UiDeviceList ui = new UiDeviceList(ad);
			ad.setUi(ui);
			
			final JFrame frame = new JFrame("E2E_DeviceListTest");
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setContentPane(ui);
			frame.setBounds(400, 200, 400, 100);
			frame.setVisible(true);
		});
	}
	
}
