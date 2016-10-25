package com.nghiabui.lochelper.core.graph;

import com.nghiabui.kommon.Point;

import java.util.HashSet;
import java.util.Set;

public class MatrixGraph implements Graph<Point> {
	
	private final int width, height;
	
	public MatrixGraph(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	private Set<Point> cached = null;
	@Override
	public Set<Point> vertices() {
		if (cached == null) {
			cached = new HashSet<>();
			for (int x = 0; x < width; ++x) {
				for (int y = 0; y < height; ++y) {
					cached.add(new Point(x, y));
				}
			}
		}
		return cached;
	}
	
	private static final int[] U = { -1, -1, -1,  0, 0,  1,  1, 1 };
	private static final int[] V = { -1,  0,  1, -1, 1, -1,  0, 1 };
	
	@Override
	public Set<Point> connected(Point vertex) {
		final Set<Point> result = new HashSet<>();
		final int x1 = vertex.x, y1 = vertex.y;
		for (int i = 0; i < U.length; ++i) {
			final int x2 = x1 + U[i];
			final int y2 = y1 + V[i];
			if (inside(x2, y2)) {
				result.add(new Point(x2, y2));
			}
		}
		return result;
	}
	
	private boolean inside(int x, int y) {
		return x >= 0 && x < width && y >= 0 && y < height;
	}
	
}
