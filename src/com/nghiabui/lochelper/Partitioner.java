package com.nghiabui.lochelper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Partitioner<V> {
	
	private final Traveller<V> traveller;
	
	public Partitioner(Traveller<V> traveller) {
		this.traveller = traveller;
	}
	
	public List<Set<V>> partition(Graph<V> graph) {
		final Set<V> visited = new HashSet<>();
		final List<Set<V>> result = new ArrayList<>();
		
		for (V vertex : graph.vertices()) {
			if (!visited.contains(vertex)) {
				final Set<V> vs = traveller.travel(graph, vertex);
				visited.addAll(vs);
				result.add(vs);
			}
		}
		
		return result;
	}
	
}
