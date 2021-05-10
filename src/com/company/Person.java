package com.company;

public class Person
{

    private String navn;
    private int alder;

    public Person(String navn, int alder)
    {
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn()
    {
        return navn;
    }

    public int getAlder()
    {
        return alder;
    }

    public String udskrivPerson() {

        return "navnet er : " + navn + " og alderen er : " + alder;

    }
}
