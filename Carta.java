/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package briscola;

/**
 *
 * @author Mirko
 */
class Carta implements Comparable{


    @Override
    public int compareTo(Object o) {
       Carta c=(Carta)o;
       if(this.seme == c.seme)
       {
           return this.valore-c.valore;
       }
       else 
       {
           return this.seme.getValue()-c.seme.getValue();
       }
     }
    
 public enum Seme {
    SPADE(0), BASTONI(2), COPPE(1),DENARI(3);

    private final int value;
    private Seme(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
   
 public Seme seme;
    public int valore; //da 1 a 10
    public Carta(Seme seme,int valore)
    {
        //TODO: implementare controlli
        this.seme=seme;
        this.valore=valore;
    }
    @Override
    public String toString()
    {
       String temp=seme.name()+"-"+valore;
       return temp;
    }
}
