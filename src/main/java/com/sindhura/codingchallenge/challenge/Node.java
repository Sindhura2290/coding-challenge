package com.sindhura.codingchallenge.challenge;
import java.util.TreeSet;

public class Node implements Comparable<Node> {
    Integer nodeId;
    Integer parentId;
    String nodeName;
    TreeSet<Node> childrens;

    public Node(Integer parentId, Integer nodeId, String nodeName) {
        super();
        this.nodeId = nodeId;
        this.parentId = parentId;
        this.nodeName = nodeName;
        childrens = new TreeSet<>();

    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public TreeSet<Node> getChildrens() {
        return childrens;
    }

    public void setChildrens(TreeSet<Node> childrens) {
        this.childrens = childrens;
    }

    @Override
    public int compareTo(Node o) {
        return this.nodeId.compareTo(o.nodeId);
    }
}