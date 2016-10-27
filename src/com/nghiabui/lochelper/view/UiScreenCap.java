package com.nghiabui.lochelper.view;

import com.nghiabui.kommon.StringOperation;
import com.nghiabui.lochelper.adapter.AdScreenCap;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

public class UiScreenCap extends BaseUi {
	
	private AdScreenCap adapter;
	
	private JLabel label;
	private JFileChooser fileChooser;
	
	public UiScreenCap() {
		JPanel buttonPanel = buildButtonPanel();
		
		label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setOpaque(true);
		label.setBackground(Color.BLACK);
		
		JScrollPane scrollPane = Factory.createFastScrollPane(label);
		
		setLayout(new BorderLayout());
		add(buttonPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
		
		buildFileChooser();
	}
	
	public void setAdapter(AdScreenCap adapter) {
		this.adapter = adapter;
	}
	
	private JPanel buildButtonPanel() {
		JButton buttonCap = new JButton("Capture");
		buttonCap.addActionListener(e -> adapter.capture());
		
		JButton buttonLoad = new JButton("Load from file ...");
		buttonLoad.addActionListener(e -> {
			if (fileChooser.showOpenDialog(UiScreenCap.this) == JFileChooser.APPROVE_OPTION) {
				adapter.loadFromFile(fileChooser.getSelectedFile().getAbsolutePath());
			}
		});
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(buttonCap);
		panel.add(buttonLoad);
		
		return panel;
	}
	
	private void buildFileChooser() {
		fileChooser = new JFileChooser();
		final String[] EXTS = {"png", "jpg", "jpeg"};
		final String DESC = "Images (" + StringOperation.join(EXTS, ", ") + ")";
		fileChooser.setFileFilter(new FileNameExtensionFilter(DESC, EXTS));
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	}
	
	public void setImage(Image image) {
		label.setIcon(new ImageIcon(image));
	}
	
}
