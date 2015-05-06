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
class Gioco {
    
    Mazzo mazzo;
    Giocatore[] giocatori;
    public Gioco()
    {
        //inizializzazione dei componenti
        mazzo=new Mazzo();
        giocatori=new Giocatore[3];
        giocatori[0]=new Giocatore("Marco","Rossi");
        giocatori[1]=new Giocatore("Matteo","Neri");
        giocatori[2]=new Giocatore("Nicola","Verdi");
        pescaIniziale();
        mazzo.stampaStato();
        //ora dobbiamo ordinare la mano
        for(Giocatore g:giocatori)
        {
            g.ordinaMano();
            g.stampaStato();
        }
        
    }
    public void pescaIniziale()
    {
         //pesca iniziale
        for(Giocatore c : giocatori)
        {
            for(int i=0;i<3;i++)
            {
                c.pescaCarta(mazzo); 
            }
            c.stampaStato();
        }
    }
  
}
