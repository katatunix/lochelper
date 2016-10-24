package com.nghiabui.lochelper;

import org.junit.Test;

import static org.junit.Assert.*;

public class RawImageTest {
	
	@Test
	public void test() {
		final RawImage image = new RawImage();
		assertFalse(image.hasAlpha());
	}
	
}
