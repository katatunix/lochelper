package com.nghiabui.lochelper.view;

import com.nghiabui.lochelper.adapter.AdDeviceList;

import javax.swing.*;
import java.util.List;

public class UiDeviceList extends BaseUi {
	
	private AdDeviceList adapter;
	private JComboBox<String> comboBox;
	
	public UiDeviceList() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		add(buildButton());
		add(new JLabel("Devices:"));
		add(buildComboBox());
	}
	
	public void setAdapter(AdDeviceList adapter) {
		this.adapter = adapter;
	}
	
	private JComboBox<String> buildComboBox() {
		comboBox = new JComboBox<>();
		comboBox.addActionListener(e -> adapter.select(comboBox.getSelectedIndex()));
		return comboBox;
	}
	
	private JButton buildButton() {
		final JButton button = new JButton("Refresh");
		button.addActionListener(e -> adapter.refresh());
		return button;
	}
	
	public void apply(List<String> devices) {
		comboBox.removeAllItems();
		devices.forEach(dev -> comboBox.addItem(dev));
	}
	
}
