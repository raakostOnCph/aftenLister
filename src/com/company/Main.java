package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        Node node0 = new Node("palle");
//        Node node1 = new Node("ida");
//        Node node2 = new Node("lone");
//        Node node3 = new Node("henning");
//
////        node0.next = node1;
////        node1.previous = node0;
////
////        node1.next = node2;
////        node2.previous = node1;
////
////        node2.next = node3;
////        node3.previous = node2;
//
////        System.out.println(node0.next.next.next.data);
////        System.out.println(node0.next.next.next.previous.previous.previous.data);
//
//
//      Liste liste = new Liste();
//        System.out.println(liste.isEmpty());
//
//
//        liste.insertFromHead(node0);
//        liste.insertFromHead(node1);
//        liste.insertFromHead(node2);
//        liste.insertFromHead(node3);
//
//
//
//
//
//
//        liste.printFromHead();
//
//        System.out.println(liste.removeFromHead().data);
//
//        liste.printFromHead();
//
//        System.out.println(liste.changeData("ida", "chuck norris"));
//
//        liste.printFromHead();
//
//        System.out.println(liste.changeData("palle", "louise-maria-magdalenaZ"));
//
//        liste.printFromHead();
//
//        System.out.println(liste.changeData("nik", "jørgen-danger"));
//
//        System.out.println(liste.findKnude("Andreas").data);
//
//        System.out.println("\n\n\n");
//
//        liste.printFromHead();
//
//        liste.skiftNavn("loneZ", "bo");
//
//        liste.printFromHead();
//
//        // Opgaver til næste gang
//
//        //Se videoerne første
//
//        // lav insertFromTail
//        // lav printFromTail
//        // lav removeFromTail
//
//
//        System.out.println(liste.removeFromTail().data);
//
//        liste.printFromHead();
//
//
//
//        Liste liste1 = new Liste();
//
//        liste1.insertFromHead(new Node("bo"));
//        liste1.insertFromHead(new Node("ida"));
//        liste1.insertFromHead(new Node("ib"));
//        liste1.insertFromHead(new Node("ole"));
//
//        liste1.printFromHead();
//
//        liste1.insertFromTail(new Node("palle"));
//
//        liste1.printFromHead();
//
//        liste1.insertFromHead(new Node("martin"));
//
//        liste1.printFromHead();


        Liste liste = new Liste();

        Node node1 = new Node("1234", new Konto("nik", 50));
        Node node2 = new Node("1111", new Konto("peter", 59));
        Node node3 = new Node("2222", new Konto("Charlotte", 54));
        Node node4 = new Node("33333", new Konto("Andreas", 35));
        Node node5 = new Node("4444", new Konto("Daniel", 39));



        liste.insertFromHead(node1);
        liste.insertFromHead(node2);
        liste.insertFromHead(node3);
        liste.insertFromHead(node4);
        liste.insertFromHead(node5);

        liste.printFromHead();

        liste.indsætPåKonto("2222", 10000);

        liste.printFromHead();


        liste.printFromTail();



    }
}
