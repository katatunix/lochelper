package com.nghiabui.lochelper;

public interface Image<C> {
	
	int width();
	int height();
	C color(int col, int row);
	
}
