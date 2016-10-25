package com.nghiabui.lochelper.core;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubImageTest {
	
	@Test
	public void test() {
		final SubImage<Integer> image = new SubImage<>(new RawImage(), 10, 10, 20, 20);
		assertEquals(0, image.width());
	}
	
}
