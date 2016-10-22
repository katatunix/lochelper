package com.nghiabui.lochelper;

public class GrayImage implements Image<Byte> {
	
	private final Image<Integer> origin;
	
	public GrayImage(Image<Integer> origin) {
		this.origin = origin;
	}
	
	@Override
	public int width() {
		return origin.width();
	}
	
	@Override
	public int height() {
		return origin.height();
	}
	
	@Override
	public Byte color(int col, int row) {
		final int c = origin.color(col, row);
		final int b = (c >> 8) & 0xFF;
		final int g = (c >> 16) & 0xFF;
		final int r = c >> 24;
		return (byte) ((r + g + b) / 3);
	}
	
}
