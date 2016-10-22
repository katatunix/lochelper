package com.nghiabui.lochelper;

import java.util.ArrayList;
import java.util.List;

public class MatrixGraph implements Graph<Vertex2D> {
	
	private final int width;
	private final int height;
	
	public MatrixGraph(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public List<Vertex2D> vertices() {
		final List<Vertex2D> list = new ArrayList<>();
		for (int x = 0; x < width; ++x) {
			for (int y = 0; y < height; ++y) {
				list.add(new Vertex2D(x, y));
			}
		}
		return list;
	}
	
	private static final int[] U = {-1, -1, -1,  0, 0,  1,  1, 1 };
	private static final int[] V = {-1,  0,  1, -1, 1, -1,  0, 1 };
	
	@Override
	public List<Vertex2D> adjVertices(Vertex2D vertex) {
		final List<Vertex2D> list = new ArrayList<>();
		final int x1 = vertex.x, y1 = vertex.y;
		for (int i = 0; i < U.length; ++i) {
			final int x2 = x1 + U[i];
			final int y2 = y1 + V[i];
			if (inside(x2, y2)) {
				list.add(new Vertex2D(x2, y2));
			}
		}
		return list;
	}
	
	private boolean inside(int x, int y) {
		return x >= 0 && x < width && y >= 0 && y < height;
	}
	
}
