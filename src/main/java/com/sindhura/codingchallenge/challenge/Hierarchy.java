package com.sindhura.codingchallenge.challenge;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

@Component
public class Hierarchy {
    private static Map<Integer, Node> nodeMap = new HashMap<>();

    public static String display(Node node) {
        Queue<Node> queue = new LinkedList<>();

        String result = "";
        if (node == null)
            return result;
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            result += current.parentId + "," + current.nodeId + "," + current.nodeName + "\n";
            queue.addAll(current.childrens);

        }
        return result;

    }

    public static Node hierarchy(String input) {
        Node root = null;

        List<String[]> valueList = getInputList(input);
        for (String[] value : valueList) {
            Integer parentId = null;
            if (value[0] != "null") {
                try {
                    parentId = Integer.parseInt(value[0].trim());
                } catch (Exception e) {
                    parentId = null;
                }
            }
            Integer nodeId = Integer.parseInt(value[1].trim());
            String nodeName = value[2].trim();

            Node node = new Node(parentId, nodeId, nodeName);
            nodeMap.put(nodeId, node);

            if (root == null)
                root = node;
            Node parent = nodeMap.get(parentId);

            if (parentId != null && parent == null)
                return null;
            if (parentId != null)
                parent.getChildrens().add(node);
        }

        return root;

    }

    private static List<String[]> getInputList(String input) {
        List<String[]> result = new ArrayList<>();

        String[] inputArray = input.split("\\|");

        String[] record = null;
        for (String value : inputArray) {
            record = value.split(",");
            result.add(record);
        }
        return result;
    }

}

