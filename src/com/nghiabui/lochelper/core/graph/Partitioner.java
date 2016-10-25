package com.nghiabui.lochelper.core.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Partitioner<Vertex> {
	
	public List<Set<Vertex>> partition(Graph<Vertex> graph) {
		final Set<Vertex> visited = new HashSet<>();
		final List<Set<Vertex>> result = new ArrayList<>();
		
		for (Vertex vertex : graph.vertices()) {
			if (!visited.contains(vertex)) {
				final Set<Vertex> connected = graph.connected(vertex);
				visited.addAll(connected);
				result.add(connected);
			}
		}
		
		return result;
	}
	
}
