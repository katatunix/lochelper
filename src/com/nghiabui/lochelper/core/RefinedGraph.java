package com.nghiabui.lochelper.core;

import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class RefinedGraph<Vertex> implements Graph<Vertex> {
	
	private final Graph<Vertex> origin;
	private final BiPredicate<Vertex, Vertex> filter;
	
	public RefinedGraph(Graph<Vertex> origin, BiPredicate<Vertex, Vertex> filter) {
		this.origin = origin;
		this.filter = filter;
	}
	
	@Override
	public Set<Vertex> vertices() {
		return origin.vertices();
	}
	
	@Override
	public Set<Vertex> connected(Vertex vertex1) {
		return origin.connected(vertex1).stream()
			.filter(vertex2 -> filter.test(vertex1, vertex2))
			.collect(Collectors.toSet());
	}
	
}
