package com.company;


public class Node
{
    Node next = null;
    Node previous = null;

    String data;

    Konto konto;

    public Node(String data, Konto konto)
    {
        this.data = data;
        this.konto = konto;
    }



}
