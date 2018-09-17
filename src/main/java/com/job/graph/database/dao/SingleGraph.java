package com.job.graph.database.dao;

import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.impls.tg.TinkerGraph;

/**
 * @author : toryzhou
 * @date: 9/13/18 19:45
 */
public class SingleGraph {

    private static SingleGraph singleGraph = new SingleGraph();

    private Graph graph;

    private SingleGraph() {
        graph = new TinkerGraph();
    }

    public static SingleGraph getInstance() {
        return singleGraph;
    }

    public Graph getGraph() {
        return graph;
    }
}
