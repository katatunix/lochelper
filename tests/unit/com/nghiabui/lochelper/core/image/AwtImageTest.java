package com.nghiabui.lochelper.core.image;

import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.*;

public class AwtImageTest {
	
	@Test
	public void test() {
		final AwtImage image = new AwtImage(new BufferedImage(128, 128, BufferedImage.TYPE_3BYTE_BGR));
		assertEquals(0, image.width());
	}
	
}
