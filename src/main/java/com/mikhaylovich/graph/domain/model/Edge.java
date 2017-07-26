package com.mikhaylovich.graph.domain.model;

/**
 * @author dmitry.mikhaylovich@bostongene.com
 */
public class Edge<T> {

    private Vertex<T> from;

    private Vertex<T> to;

    Edge(Vertex<T> from, Vertex<T> to) {
        this.from = from;
        this.to = to;
        this.from.addOutput(this);
        this.to.addInput(this);
    }

    Vertex<T> to() {
        return this.to;
    }

    Vertex<T> from() {
        return this.from;
    }
}
