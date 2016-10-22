package com.nghiabui.lochelper;

import java.util.List;

public interface Traveller<V> {
	
	List<V> travel(Graph<V> graph, V start);
	
}
