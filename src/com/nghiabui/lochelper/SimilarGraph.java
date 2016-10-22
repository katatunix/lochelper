package com.nghiabui.lochelper;

import java.util.Set;
import java.util.stream.Collectors;

public class SimilarGraph implements Graph<Vertex2D> {
	
	private final GrayImage image;
	private final Graph<Vertex2D> origin;
	
	public SimilarGraph(GrayImage image, Graph<Vertex2D> origin) {
		this.image = image;
		this.origin = origin;
	}
	
	@Override
	public Set<Vertex2D> vertices() {
		return origin.vertices();
	}
	
	@Override
	public Set<Vertex2D> adjVertices(Vertex2D v1) {
		final byte color1 = image.color(v1.x, v1.y);
		
		return origin.adjVertices(v1).stream().filter(v2 -> {
			byte color2 = image.color(v2.x, v2.y);
			return Math.abs(color1 - color2) <= 10;
		}).collect(Collectors.toSet());
	}
	
}
