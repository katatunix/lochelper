package com.nghiabui.lochelper.core.image;

import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.assertEquals;

public class GrayscaleImageTest {
	
	@Test
	public void test() {
		final GrayscaleImage image = new GrayscaleImage(new AwtImage(
			new BufferedImage(40, 40, BufferedImage.TYPE_3BYTE_BGR)));
		assertEquals(1, image.color(0, 0).byteValue());
	}
	
}
