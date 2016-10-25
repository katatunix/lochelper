package com.nghiabui.lochelper.core;

public class RawImage implements Image<Integer> {
	
	public boolean hasAlpha() {
		return false;
	}
	
	@Override
	public int width() {
		return 0;
	}
	
	@Override
	public int height() {
		return 0;
	}
	
	@Override
	public Integer color(int col, int row) {
		return null;
	}
	
}
