package com.nghiabui.lochelper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GrayscaleImageTest {
	
	@Test
	public void test() {
		final GrayscaleImage image = new GrayscaleImage(new RawImage());
		assertEquals(1, image.color(0, 0).byteValue());
	}
	
}
