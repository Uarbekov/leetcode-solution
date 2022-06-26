package com.uarbekov.data_structure;

import java.util.*;

public class Graph {
    public String name;
    public List<Graph> neighborGraph = new ArrayList<>();

    public Graph(String name) {
        this.name = name;
    }


    public static List<Graph> depthFirstSearch(Graph startGraph, Graph searchingGraph, Set<Graph> searchedGraph) {
        for (Graph graph : startGraph.neighborGraph) {
            if (graph.equals(searchingGraph)) {
                return new ArrayList<>(Collections.singleton(graph));
            }
        }
        for (Graph graph : startGraph.neighborGraph) {
            if (!searchedGraph.contains(graph)) {
                searchedGraph.add(graph);
                List<Graph> result = depthFirstSearch(graph, searchingGraph, searchedGraph);
                if (!result.isEmpty()) {
                    result.add(0, graph);
                    return result;
                }
            }
        }
        return new ArrayList<>();
    }

}
