# Directed Weighted Graph Algorithms:                                                                
## Dor Harizi
---
In formal terms, a directed graph is an ordered pair G = (V, A) where 
* V is a set whose elements are called vertices, nodes, or points;
* A is a set of ordered pairs of vertices, called arcs, directed edges, arrows, or directed lines.

It differs from an ordinary or undirected graph, in that the latter is defined in terms of unordered pairs of vertices, which are usually called edges, links or lines.

The aforementioned definition does not allow a directed graph to have multiple arrows with the same source and target nodes, but some authors consider a broader definition that allows directed graphs to have such multiple arcs (namely, they allow the arc set to be a multiset). More specifically, these entities are addressed as directed multigraphs (or multidigraphs).
On the other hand, the aforementioned definition allows a directed graph to have loops (that is, arcs that directly connect nodes with themselves), but some authors consider a narrower definition that doesn't allow directed graphs to have loops.[2] More specifically, directed graphs without loops are addressed as simple directed graphs, while directed graphs with loops are addressed as loop-digraphs (see section Types of directed graphs).

Reference to the UML: [ click here](#Smart-Elevator-UML) 

---

## Algorithm features
#### **init()**
Inits the graph on which this set of algorithms operates on.

#### **DirectedWeightedGraph()**
Returns the underlying graph of which this class works.

#### **Copy()**
Computes a deep copy of this weighted graph.

#### **isConnected()** 
Returns true if and only if (iff) there is a valid path from each node to each
other node. 
NOTE: assume directional graph (all n*(n-1) ordered pairs).

#### **shortestPathDist()**
return the min wight of the shortest path between two points in the graph.

#### **shortestPath()**
In graph theory, the shortest path problem is the problem of finding a path between two vertices (or nodes) in a graph such that the sum of the weights of its constituent edges is minimized.
The problem of finding the shortest path between two intersections on a road map may be modeled as a special case of the shortest path problem in graphs, where the vertices correspond to intersections and the edges correspond to road segments, each weighted by the length of the segment.
#### **center()**
 Return the Node the represnt the center of mass of the graph.

#### **tsp()**
TSP can be modelled as an undirected weighted graph, such that cities are the graph's vertices, paths are the graph's edges, and a path's distance is the edge's weight. It is a minimization problem starting and finishing at a specified vertex after having visited each other vertex exactly once. Often, the model is a complete graph. If no path exists between two cities, adding a sufficiently long edge will complete the graph without affecting the optimal tour.

#### **save()**
 Saves this weighted directed graph to the given
 file name - in JSON format.
#### **load()**
This method loads a graph to this graph algorithm.
param file - file name of JSON file

---
## Smart Elevator UML:

<p align="center">
    <img width="800" height="900" src="https://github.com/DorHarizi/Dor_Harizi_2_Year_Ex2_java/blob/master/src/Graph/UML.png">
   </p>
 ---
