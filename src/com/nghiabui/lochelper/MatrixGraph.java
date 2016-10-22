package com.nghiabui.lochelper;

import java.util.HashSet;
import java.util.Set;

public class MatrixGraph implements Graph<Vertex2D> {
	
	private final int width;
	private final int height;
	
	public MatrixGraph(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public Set<Vertex2D> vertices() {
		final Set<Vertex2D> result = new HashSet<>();
		for (int x = 0; x < width; ++x) {
			for (int y = 0; y < height; ++y) {
				result.add(new Vertex2D(x, y));
			}
		}
		return result;
	}
	
	private static final int[] U = {-1, -1, -1,  0, 0,  1,  1, 1 };
	private static final int[] V = {-1,  0,  1, -1, 1, -1,  0, 1 };
	
	@Override
	public Set<Vertex2D> adjVertices(Vertex2D vertex) {
		final Set<Vertex2D> result = new HashSet<>();
		final int x1 = vertex.x, y1 = vertex.y;
		for (int i = 0; i < U.length; ++i) {
			final int x2 = x1 + U[i];
			final int y2 = y1 + V[i];
			if (inside(x2, y2)) {
				result.add(new Vertex2D(x2, y2));
			}
		}
		return result;
	}
	
	private boolean inside(int x, int y) {
		return x >= 0 && x < width && y >= 0 && y < height;
	}
	
}
