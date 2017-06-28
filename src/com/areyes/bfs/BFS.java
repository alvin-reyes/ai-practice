package com.areyes.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public void bfs(Vertex root) {
		
		// set the root. and set it to visited.
		// use queue for FIFO
		Queue<Vertex> queue = new LinkedList<>();
		root.setVisited(true);
		queue.add(root);
		
		// loop thru the queue (remember the root was added).
		while(!queue.isEmpty()) {
			// remove it....
			Vertex actualVertex = queue.remove();
			System.out.println(actualVertex);
			
			//	but loop thru the neighbour of the vertex
			for(Vertex v: actualVertex.getNeighbourList()) {
				//	set if visited.
				if(!v.isVisited()) {
					// add to queue.
					v.setVisited(true);
					queue.add(v);
				}
			}
		}
		
	}
}
