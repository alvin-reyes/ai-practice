package com.areyes.dfs;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		DFS dfs = new DFS();
		Vertex v1 = new Vertex("v1");
		Vertex v2 = new Vertex("v2");
		Vertex v3 = new Vertex("v3");
		Vertex v4 = new Vertex("v4");
		Vertex v5 = new Vertex("v5");
		
		List<Vertex> list = new ArrayList<>();
		v1.addNeighbour(v2);
		v1.addNeighbour(v3);
		v3.addNeighbour(v4);
		v4.addNeighbour(v5);
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		
		dfs.dfs(list);

	}
}
