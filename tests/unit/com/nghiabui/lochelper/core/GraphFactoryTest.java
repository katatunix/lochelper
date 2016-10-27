package com.nghiabui.lochelper.core;

import com.nghiabui.kommon.Point;
import com.nghiabui.lochelper.core.graph.Graph;
import com.nghiabui.lochelper.core.image.GrayscaleImage;
import com.nghiabui.lochelper.core.image.RawImage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphFactoryTest {
	
	@Test
	public void createSimilarGrayscaleGraph() {
		final Graph<Point> graph = GraphFactory.createSimilarGrayscaleGraph(new GrayscaleImage(new RawImage<>()));
		assertEquals("", graph.vertices().toString());
	}
	
}
