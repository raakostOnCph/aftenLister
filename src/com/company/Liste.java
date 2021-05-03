package com.company;

public class Liste
{
    Node head = null;   // en refferance til det først element i listen
    Node tail = null;   // en refferance til det sidste element i listen



    public boolean isEmpty () {

        if (head == null) {
            return true;
        }
        return false;
    }

    public void insertFromHead(Node node ) {

        if (isEmpty() ) {
            head = node;
            tail = node;

        }
        else {
        node.next = head;
        head.previous = node;

        head = node;
        }

    }

    public void printFromHead() {

        System.out.println("\n");

        Node n = head;

        while (n != null) {


            System.out.println(n.data);
            n = n.next;
        }

        System.out.println("\n");
    }

    public Node removeFromHead()
    {

        Node n = null;

        if (isEmpty()) {   // her er listen tom
            return n;  // her stopper metoden
        }

        if (head == tail) {   // der er kun et element i listen og både h og t peger på det.

            n = head;

            head = null;
            tail = null;
            return n;  // her stoppe metoder
        }

        // listen er hverken tom eller rummer kun et element.
        n = head;

        head = head.next;
        n.next.previous = null;

        return n;
    }

    public boolean changeData(String gammel, String ny ) {

        Node n;
        n = head;

        while (n != null ) {

            if (n.data.equals(gammel)) {
                n.data = ny;
                return true;
            }
            n = n.next;

        }
        return false;

    }


    public Node findKnude(String s) {

        Node n = head;

        while (n != null ) {

            if (n.data.equals(s)) {
                return n;
            }
            n = n.next;
        }
        return new Node("en knude med navn fandtes ikke i listen");
    }

    public boolean skiftNavn(String gammel, String ny) {

        Node n = findKnude(gammel);

        if (n.data.equals("en knude med navn fandtes ikke i listen") ) {
            return false;
        }
        n.data = ny;
        return true;


    }
}
