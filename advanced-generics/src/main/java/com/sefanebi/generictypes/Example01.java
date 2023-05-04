package com.sefanebi.generictypes;

public class Example01 {

    public static void main(String[] args) {
        var three = new LeafNode<Integer>(3);
        var five = new LeafNode<>(5);

        var tree = new MaxValueInnerNode<>(new LeafNode<>(2), new MaxValueInnerNode<>(three, five));
        System.out.println(tree );
    }
}
