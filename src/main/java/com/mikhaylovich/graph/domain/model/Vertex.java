package com.mikhaylovich.graph.domain.model;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author dmitry.mikhaylovich@bostongene.com
 */
public class Vertex<T> {

    private final T value;
    private Set<Edge<T>> input = new HashSet<>();
    private Set<Edge<T>> output = new HashSet<>();

    public Vertex(T value) {
        this.value = value;
    }

    void addInput(Edge<T> edge) {
        this.input.add(edge);
    }

    void addOutput(Edge<T> edge) {
        this.output.add(edge);
    }

    void addInput(Vertex<T> vertex) {
        this.input.add(new Edge<>(vertex, this));
    }

    void addOutput(Vertex<T> vertex) {
        this.output.add(new Edge<>(this, vertex));
    }

    Set<Vertex<T>> stepsTo() {
        return this.output.stream().map(Edge::to).collect(Collectors.toSet());
    }

    Set<Vertex<T>> stepsFrom() {
        return this.input.stream().map(Edge::from).collect(Collectors.toSet());
    }
}
