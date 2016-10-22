package com.nghiabui.lochelper;

public class SubImage<C> implements Image<C> {
	
	private final Image<C> origin;
	private final int colOffset, rowOffset, width, height;
	
	public SubImage(Image<C> origin, int colOffset, int rowOffset, int width, int height) {
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
	public C color(int col, int row) {
		return origin.color(colOffset + col, rowOffset + row);
	}
	
}
