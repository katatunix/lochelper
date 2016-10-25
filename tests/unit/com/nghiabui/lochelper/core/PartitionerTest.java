package com.nghiabui.lochelper.core;

import com.nghiabui.kommon.Point;
import com.nghiabui.lochelper.core.graph.DfsGraph;
import com.nghiabui.lochelper.core.graph.Graph;
import com.nghiabui.lochelper.core.graph.MatrixGraph;
import com.nghiabui.lochelper.core.graph.Partitioner;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class PartitionerTest {
	
	@Test
	public void test() {
		final Partitioner<Point> partitioner = new Partitioner<>();
		final Graph<Point> graph = new DfsGraph<>(new MatrixGraph(100, 100));
		final List<Set<Point>> parts = partitioner.partition(graph);
		assertEquals("", parts.toString());
	}
	
}
