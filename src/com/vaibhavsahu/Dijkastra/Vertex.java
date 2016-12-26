package com.vaibhavsahu.Dijkastra;

//import java.util.DoubleSummaryStatistics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * Created by vaibhavsahu on 12/26/16.
 */
public class Vertex implements Comparable<Vertex>{
    private String data;
    private boolean visited;
    private Vertex predecessor;
    private List<Edge> adjList;
    private double minDistance = Double.MAX_VALUE;


    public Vertex(String data){
        this.data = data;
        this.adjList = new ArrayList<>();
    }

    public void addNeighbor(Edge edge){
        this.adjList.add(edge);
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Edge> getAdjList() {
        return adjList;
    }

    public void setAdjList(List<Edge> adjList) {
        this.adjList = adjList;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.minDistance, otherVertex.getMinDistance());
    }
}
