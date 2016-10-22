package com.nghiabui.lochelper;

import java.util.ArrayList;
import java.util.List;

public class Partitioner<V> {
	
	private final Traveller<V> traveller;
	
	public Partitioner(Traveller<V> traveller) {
		this.traveller = traveller;
	}
	
	public List<List<V>> partition(Graph<V> graph) {
		final List<V> visited = new ArrayList<>();
		final List<List<V>> result = new ArrayList<>();
		
		for (V vertex : graph.vertices()) {
			if (!visited.contains(vertex)) {
				final List<V> vs = traveller.travel(graph, vertex);
				visited.addAll(vs);
				result.add(vs);
			}
		}
		
		return result;
	}
	
}
