package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Node node0 = new Node("palle");
        Node node1 = new Node("ida");
        Node node2 = new Node("lone");
        Node node3 = new Node("henning");

//        node0.next = node1;
//        node1.previous = node0;
//
//        node1.next = node2;
//        node2.previous = node1;
//
//        node2.next = node3;
//        node3.previous = node2;

//        System.out.println(node0.next.next.next.data);
//        System.out.println(node0.next.next.next.previous.previous.previous.data);


      Liste liste = new Liste();
        System.out.println(liste.isEmpty());


        liste.insertFromHead(node0);
        liste.insertFromHead(node1);
        liste.insertFromHead(node2);
        liste.insertFromHead(node3);






        liste.printFromHead();

        System.out.println(liste.removeFromHead().data);

        liste.printFromHead();

        System.out.println(liste.changeData("ida", "chuck norris"));

        liste.printFromHead();

        System.out.println(liste.changeData("palle", "louise-maria-magdalenaZ"));

        liste.printFromHead();

        System.out.println(liste.changeData("nik", "jørgen-danger"));

        System.out.println(liste.findKnude("Andreas").data);

        System.out.println("\n\n\n");

        liste.printFromHead();

        liste.skiftNavn("loneZ", "bo");

        liste.printFromHead();

        // Opgaver til næste gang

        //Se videoerne første

        // lav insertFromTail
        // lav printFromTail
        // lav removeFromTail



    }
}
