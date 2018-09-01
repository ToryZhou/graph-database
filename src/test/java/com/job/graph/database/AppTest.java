package com.job.graph.database;

import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.impls.tg.TinkerGraph;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

    @Test
    public void test() {
        //todo to test the query language
        Graph graph = new TinkerGraph();
        Vertex a = graph.addVertex("a");
        Vertex b = graph.addVertex("b");

        Edge like = a.addEdge("like", b);
        Assert.assertEquals("like", like.getLabel());



    }
}
