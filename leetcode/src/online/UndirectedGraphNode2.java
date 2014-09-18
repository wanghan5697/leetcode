package online;

import java.util.HashMap;
import java.util.LinkedList;

public class UndirectedGraphNode2 {
	
	//bfs
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
		if(node==null){
			return null;
		}
		LinkedList<UndirectedGraphNode> queue= new LinkedList<UndirectedGraphNode>();
		HashMap<UndirectedGraphNode,UndirectedGraphNode> map= new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
		UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
		map.put(node, copy);
		queue.offer(node);
		
		while(!queue.isEmpty()){
			UndirectedGraphNode cur = queue.poll();
			for(int i=0;i<cur.neighbors.size();i++){
				if(!map.containsKey(cur.neighbors.get(i))){
					copy=new UndirectedGraphNode(cur.neighbors.get(i).label);
					map.put(cur.neighbors.get(i), copy);
					queue.offer(cur.neighbors.get(i));
				}
				map.get(cur).neighbors.add(map.get(cur.neighbors.get(i)));
			}
		}
		return map.get(node);	
	}

	// dfs 
	/*public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
		if(node==null){
			return null;
		}
		
		LinkedList<UndirectedGraphNode> stack = new LinkedList<UndirectedGraphNode>();
		HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();	
		stack.push(node);
		UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
		map.put(node, copy);
		
		while(!stack.isEmpty()){
			UndirectedGraphNode cur = stack.pop();
			for(int i=0;i<cur.neighbors.size();i++){
				if(!map.containsKey(cur.neighbors.get(i)))
				{
					copy=new UndirectedGraphNode(cur.neighbors.get(i).label);
					map.put(cur.neighbors.get(i),copy);
					stack.push(cur.neighbors.get(i));	
				}
				map.get(cur).neighbors.add(map.get(cur.neighbors.get(i)));
				
			}
		}
	    return map.get(node);
	}
    */
}
