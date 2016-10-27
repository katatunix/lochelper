package com.nghiabui.lochelper.view;

import javax.swing.*;
import java.awt.*;

public class Factory {
	
	public static JScrollPane createFastScrollPane(Component view) {
		final JScrollPane scrollPane = new JScrollPane(view);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		scrollPane.getHorizontalScrollBar().setUnitIncrement(16);
		return scrollPane;
	}
	
}
