package com.nghiabui.lochelper.core.graph;

import com.nghiabui.kommon.Point;
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
