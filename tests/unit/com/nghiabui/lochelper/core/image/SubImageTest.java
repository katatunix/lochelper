package com.nghiabui.lochelper.core.image;

import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.assertEquals;

public class SubImageTest {
	
	@Test
	public void test() {
		final SubImage<Integer> image = new SubImage<>(
			new AwtImage(new BufferedImage(50, 50, BufferedImage.TYPE_3BYTE_BGR)),
			10, 10, 20, 20
		);
		assertEquals(0, image.width());
	}
	
}
