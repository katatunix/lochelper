package com.nghiabui.lochelper.core.graph;

import java.util.HashSet;
import java.util.Set;

public class DfsGraph<Vertex> implements Graph<Vertex> {
	
	private final Graph<Vertex> origin;
	
	public DfsGraph(Graph<Vertex> origin) {
		this.origin = origin;
	}
	
	@Override
	public Set<Vertex> vertices() {
		return origin.vertices();
	}
	
	@Override
	public Set<Vertex> connected(Vertex vertex) {
		final Set<Vertex> visited = new HashSet<>();
		visit(vertex, visited);
		return visited;
	}
	
	private void visit(Vertex vertex, Set<Vertex> visited) {
		visited.add(vertex);
		for (Vertex other : origin.connected(vertex)) {
			if (!visited.contains(other)) {
				visit(other, visited);
			}
		}
	}
	
}
