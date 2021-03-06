package com.nghiabui.lochelper.core.graph;

import java.util.Set;

public interface Graph<Vertex> {
	
	Set<Vertex> vertices();
	Set<Vertex> connected(Vertex vertex);
	
}
