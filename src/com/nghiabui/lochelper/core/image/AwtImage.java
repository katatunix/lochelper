package com.nghiabui.lochelper.core.image;

import java.awt.image.BufferedImage;

public class AwtImage implements Image<Integer> {
	
	private final BufferedImage origin;
	
	public AwtImage(BufferedImage origin) {
		this.origin = origin;
	}
	
	@Override
	public int width() {
		return origin.getWidth();
	}
	
	@Override
	public int height() {
		return origin.getHeight();
	}
	
	@Override
	public Integer color(int col, int row) {
		return origin.getRGB(col, row);
	}
	
	public java.awt.Image awt() {
		return origin;
	}
	
}
