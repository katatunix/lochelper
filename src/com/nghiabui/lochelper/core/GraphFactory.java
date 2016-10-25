package com.nghiabui.lochelper.core;

import com.nghiabui.kommon.Point;
import com.nghiabui.lochelper.core.graph.Graph;
import com.nghiabui.lochelper.core.graph.MatrixGraph;
import com.nghiabui.lochelper.core.graph.RefinedGraph;
import com.nghiabui.lochelper.core.image.GrayscaleImage;

public class GraphFactory {
	
	public static Graph<Point> createSimilarGrayscaleGraph(GrayscaleImage image) {
		return new RefinedGraph<>(
			new MatrixGraph(image.width(), image.height()),
			(point1, point2) ->
				Math.abs(image.color(point1.x, point1.y) - image.color(point2.x, point2.y)) <= 10
		);
	}
	
}
