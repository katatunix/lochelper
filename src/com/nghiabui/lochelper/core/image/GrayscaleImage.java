package com.nghiabui.lochelper.core.image;

public class GrayscaleImage implements Image<Byte> {
	
	private final Image<Integer> origin;
	
	public GrayscaleImage(Image<Integer> origin) {
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
		final int b = c & 0xFF;
		final int g = (c >> 8) & 0xFF;
		final int r = (c >> 16) & 0xFF;
		return (byte) ((r + g + b) / 3);
	}
	
}
