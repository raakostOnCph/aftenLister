package com.company;

public class Konto
{

public Person personObl;

private int saldo;

    public Konto(Person personObl, int saldo)
    {
        this.personObl = personObl;
        this.saldo = saldo;
    }

    public Konto(String navn, int alder, int saldo)
    {
        this.personObl = new Person(navn, alder);
        this.saldo = saldo;
    }


    public Konto(String navn, int alder)
    {
        this.personObl = new Person(navn, alder);
        this.saldo = 0;
    }



    public Konto()
    {
        this.personObl = new Person("fandt ikke kontoen", 0);
        this.saldo = 0;
    }



    public int getSaldo()
    {
        return saldo;
    }

    public int indsæt (int i) {

        if (i > 0 ) {
            saldo = saldo + i;
        }


        return saldo;

    }


    public void hæv(int i)
    {
        if (saldo > i  && i > 0)  {

            saldo = saldo - i;

        }


    }

    public String udskrivKonto() {

        String res = personObl.udskrivPerson() + " saldo " + saldo ;

        return res;

    }

}
