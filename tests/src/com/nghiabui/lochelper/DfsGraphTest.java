package com.nghiabui.lochelper;

import com.nghiabui.kommon.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class DfsGraphTest {
	
	@Test
	public void test() {
		final DfsGraph<Point> graph = new DfsGraph(new ImageGraph(100, 100));
		assertEquals("", graph.vertices().toString());
	}
	
}
