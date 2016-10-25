package com.nghiabui.lochelper.core.image;

public class SubImage<Color> implements Image<Color> {
	
	private final Image<Color> origin;
	private final int colOffset, rowOffset, width, height;
	
	public SubImage(Image<Color> origin, int colOffset, int rowOffset, int width, int height) {
		this.origin = origin;
		this.colOffset = colOffset;
		this.rowOffset = rowOffset;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public int width() {
		return width;
	}
	
	@Override
	public int height() {
		return height;
	}
	
	@Override
	public Color color(int col, int row) {
		return origin.color(colOffset + col, rowOffset + row);
	}
	
}
