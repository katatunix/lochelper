package com.nghiabui.lochelper;

import com.nghiabui.lochelper.adapter.AdDeviceList;
import com.nghiabui.lochelper.adapter.AdScreenCap;
import com.nghiabui.lochelper.usecase.UcDeviceList;
import com.nghiabui.lochelper.usecase.UcScreenCap;
import com.nghiabui.lochelper.view.UiDeviceList;
import com.nghiabui.lochelper.view.UiScreenCap;

import javax.swing.*;
import java.awt.*;

public class E2E_ScreenCapTest {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			final UcDeviceList ucDeviceList = new UcDeviceList();
			final AdDeviceList adDeviceList = new AdDeviceList(ucDeviceList);
			final UiDeviceList uiDeviceList = new UiDeviceList(adDeviceList);
			adDeviceList.setUi(uiDeviceList);
			
			final AdScreenCap adScreenCap = new AdScreenCap(new UcScreenCap(ucDeviceList));
			final UiScreenCap uiScreenCap = new UiScreenCap(adScreenCap);
			adScreenCap.setUi(uiScreenCap);
			
			final JFrame frame = new JFrame("E2E_ScreenCapTest");
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
			final Container container = frame.getContentPane();
			container.setLayout(new BorderLayout());
			container.add(uiDeviceList, BorderLayout.NORTH);
			container.add(uiScreenCap, BorderLayout.CENTER);
			
			frame.setBounds(10, 10, 1000, 720);
			frame.setVisible(true);
		});
	}
	
}
