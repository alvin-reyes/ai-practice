package com.areyes.dfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFS {
	
	private Stack<Vertex> stack;
	
	public DFS() {
		this.stack = new Stack<>();
	}
	
	public void dfs(List<Vertex> vertexList) {
		for(Vertex v:vertexList) {
			if(! v.isVisited()) {
				v.setVisited(true);
				dfsWithStack(v);
			}
		}
	}
	
	public void dfsWithStack(Vertex vertex) {
		
		this.stack.add(vertex);
		vertex.setVisited(true);
		
		while(!stack.isEmpty()) {
			Vertex actualVertex = this.stack.pop();
			System.out.println(actualVertex);
			
			for(Vertex v:actualVertex.getNeighbourList()) {
				if(!v.isVisited()) {
					v.setVisited(true);
					this.stack.push(v);
				}
			}
		}
	}
	
}
