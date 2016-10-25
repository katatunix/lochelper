package com.nghiabui.lochelper.core;

import com.nghiabui.kommon.Point;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DfsGraphTest {
	
	@Test
	public void test() {
		final DfsGraph<Point> graph = new DfsGraph(new ImageGraph(100, 100));
		assertEquals("", graph.vertices().toString());
	}
	
}
