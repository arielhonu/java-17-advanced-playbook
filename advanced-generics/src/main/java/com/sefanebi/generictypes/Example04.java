package com.sefanebi.generictypes;

public class Example04 {

    public static void main(String[] args) {
        var tree = new MaxValueInnerNode<>(new LeafNode<>(2), new MaxValueInnerNode<>(new LeafNode<>(3), new LeafNode<>(5)));
        System.out.println(tree.getValue());
    }
}
