package com.nghiabui.lochelper;

import java.util.HashSet;
import java.util.Set;

public class DfsTraveller<V> implements Traveller<V> {
	
	@Override
	public Set<V> travel(Graph<V> graph, V start) {
		final Set<V> visited = new HashSet<>();
		travel(graph, start, visited);
		return visited;
	}
	
	private void travel(Graph<V> graph, V vertex, Set<V> visited) {
		visited.add(vertex);
		for (V adj : graph.adjVertices(vertex)) {
			if (!visited.contains(adj)) {
				travel(graph, adj, visited);
			}
		}
	}
	
}
