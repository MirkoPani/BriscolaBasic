/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package briscola;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Mirko
 */
class Giocatore {
    private String nome;
    private String cognome;
    private ArrayList<Carta> mano;
    
    public Giocatore()
    {
        this("null","null");
    }
    public Giocatore(String nome,String cognome)
    {
        this.nome=nome;
        this.cognome=cognome;
        mano=new ArrayList<Carta>();
    }
    public void pescaCarta(Mazzo m) 
    {    
        if(mano.size()<3)   
        {      
        Carta temp= m.estraiCarta();
        if(temp!=null)
        mano.add(temp);
        System.out.println("Aggiunta carta,mano.size"+ mano.size());
        }
        else
            throw new Error("test");
    }

    void stampaStato() {
    System.out.println("Nome:"+nome+" "+cognome+"");
    for(Carta c: mano)
        System.out.println(c.toString());
    System.out.println("----------------");
    }

    void ordinaMano() {
        Collections.sort(mano);
    }
}
