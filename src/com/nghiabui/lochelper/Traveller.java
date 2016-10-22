package com.nghiabui.lochelper;

import java.util.Set;

public interface Traveller<V> {
	
	Set<V> travel(Graph<V> graph, V start);
	
}
