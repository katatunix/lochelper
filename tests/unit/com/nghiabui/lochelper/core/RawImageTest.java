package com.nghiabui.lochelper.core;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class RawImageTest {
	
	@Test
	public void test() {
		final RawImage image = new RawImage();
		assertFalse(image.hasAlpha());
	}
	
}
