package com.nghiabui.lochelper;

import java.util.Set;

public interface Graph<Vertex> {
	
	Set<Vertex> vertices();
	Set<Vertex> connected(Vertex vertex);
	
}
