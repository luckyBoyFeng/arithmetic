package com.dafeng.lib;


import com.dafeng.lib.array.DeleteArrayRepetition;
import com.dafeng.lib.bean.Node;
import com.dafeng.lib.sort.XSort;

import java.util.HashMap;

public class MyClass {

    public static void main(String[] args) {


//        System.out.println(Sushutongji.bf(100));
//        System.out.println(Sushutongji.eratosthenes(100));
//
//        int[] ints= new int[]{1,2,3,3,4,5,5,6};
//        System.out.println(DeleteArrayRepetition.removeDuplicates(ints));
        System.out.println(XSort.mySqrt(25));
        System.out.println(XSort.mySqrt(15));
        System.out.println(XSort.mySqrt(80));

        HashMap hashMap=new HashMap();
    }


    public Node getNode(){
        Node node5=new Node(5,null);
        Node node4=new Node(4,node5);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node node1=new Node(1,node2);
        return node1;
    }


}