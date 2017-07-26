package com.mikhaylovich.graph.domain.model;

import java.util.Set;

/**
 * @author dmitry.mikhaylovich@bostongene.com
 */
public class Graph<T> {
    Set<Edge<T>> edges;

    Set<Vertex<T>> vertices;
}
