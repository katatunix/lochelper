package com.nghiabui.lochelper;

public interface Image<Color> {
	
	int width();
	int height();
	Color color(int col, int row);
	
}
