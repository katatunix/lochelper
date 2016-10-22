package com.nghiabui.lochelper;

import java.util.ArrayList;
import java.util.List;

public class DfsTraveller<V> implements Traveller<V> {
	
	@Override
	public List<V> travel(Graph<V> graph, V start) {
		final List<V> visited = new ArrayList<>();
		travel(graph, start, visited);
		return visited;
	}
	
	private void travel(Graph<V> graph, V vertex, List<V> visited) {
		visited.add(vertex);
		for (V adj : graph.adjVertices(vertex)) {
			if (!visited.contains(adj)) {
				travel(graph, adj, visited);
			}
		}
	}
	
}
