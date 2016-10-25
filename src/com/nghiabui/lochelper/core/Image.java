package com.nghiabui.lochelper.core;

public interface Image<Color> {
	
	int width();
	int height();
	Color color(int col, int row);
	
}
