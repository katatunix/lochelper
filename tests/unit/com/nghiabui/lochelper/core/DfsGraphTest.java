package com.nghiabui.lochelper.core;

import com.nghiabui.kommon.Point;
import com.nghiabui.lochelper.core.graph.DfsGraph;
import com.nghiabui.lochelper.core.graph.MatrixGraph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DfsGraphTest {
	
	@Test
	public void test() {
		final DfsGraph<Point> graph = new DfsGraph(new MatrixGraph(100, 100));
		assertEquals("", graph.vertices().toString());
	}
	
}
