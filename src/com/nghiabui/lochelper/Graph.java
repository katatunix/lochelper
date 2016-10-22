package com.nghiabui.lochelper;

import java.util.Set;

public interface Graph<V> {
	
	Set<V> vertices();
	Set<V> adjVertices(V v);
	
}
