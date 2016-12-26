package com.vaibhavsahu.Dijkastra;

import java.util.*;

/**
 * Created by vaibhavsahu on 12/26/16.
 */
public class Algorithm {

    public void ComputePaths(Vertex vertex){
        vertex.setMinDistance(0);
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(vertex);

        while(!priorityQueue.isEmpty()){
            Vertex actualVertex = priorityQueue.poll();

            for (Edge edge : actualVertex.getAdjList()){
                double weight = edge.getWeight();
                Vertex v = edge.getEndVertex();
                double minDistanceViaV = v.getMinDistance()+ weight;

                if(minDistanceViaV < v.getMinDistance()){
                    priorityQueue.remove(v);
                    v.setPredecessor(actualVertex);
                    v.setMinDistance(minDistanceViaV);
                    priorityQueue.add(v);
                }
            }
        }

    }

    public List<Vertex> getShortestPath(Vertex targetVertex) {

        List<Vertex> path = new ArrayList<Vertex>();
        for (Vertex vertex=targetVertex; vertex != null; vertex=vertex.getPredecessor()){
            path.add(vertex);
        }

        Collections.reverse(path);


        return path;
    }


}
