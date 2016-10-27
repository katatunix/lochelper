package com.nghiabui.lochelper.core.image;

public class RawImage<Color> implements Image<Color> {
	@Override
	public int width() {
		return 0;
	}
	
	@Override
	public int height() {
		return 0;
	}
	
	@Override
	public Color color(int col, int row) {
		return null;
	}
}
