package com.uarbekov.data_structure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Graph A = new Graph("A");
        Graph B = new Graph("B");
        Graph C = new Graph("C");
        Graph D = new Graph("D");
        Graph E = new Graph("E");
        Graph F = new Graph("F");
        Graph G = new Graph("G");
        A.neighborGraph = Arrays.asList(B, C, E);
        B.neighborGraph = Arrays.asList(A, D);
        C.neighborGraph = Arrays.asList(A);
        D.neighborGraph = Arrays.asList(B);
        E.neighborGraph = Arrays.asList(A, F);
        F.neighborGraph = Arrays.asList(E, G);
        G.neighborGraph = Arrays.asList(F);
        List<Graph> find = Graph.depthFirstSearch(A, G, new HashSet<>());
        System.out.println(find);
    }

}
