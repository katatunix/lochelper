package com.nghiabui.lochelper;

import java.util.List;

public interface Graph<V> {
	
	List<V> vertices();
	List<V> adjVertices(V v);
	
}
