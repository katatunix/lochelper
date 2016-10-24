package com.nghiabui.lochelper;

import com.nghiabui.kommon.Point;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphFactoryTest {
	
	@Test
	public void createSimilarGrayscaleGraph() {
		final Graph<Point> graph = GraphFactory.createSimilarGrayscaleGraph(new GrayscaleImage(new RawImage()));
		assertEquals("", graph.vertices().toString());
	}
	
}
