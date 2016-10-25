package com.nghiabui.lochelper.core.image;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrayscaleImageTest {
	
	@Test
	public void test() {
		final GrayscaleImage image = new GrayscaleImage(new RawImage());
		assertEquals(1, image.color(0, 0).byteValue());
	}
	
}
