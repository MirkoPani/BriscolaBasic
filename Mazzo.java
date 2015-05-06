/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package briscola;

import java.util.Random;

/**
 *
 * @author Mirko
 */

public class Mazzo {
   private Carta[] mazzo;
  private  int cartePescate;
    
    public Mazzo()
    {
        mazzo=new Carta[40];
        riempiMazzo();
        shuffleMazzo();
        cartePescate=0;
    }
    public void riempiMazzo()
    {
        int indice=0;
        for (Carta.Seme value : Carta.Seme.values()) {
            for(int j=1; j<=10;j++)
            {
                mazzo[indice]=new Carta(value,j);
                indice++;
            }
        }
        System.out.println("Indicecartamazzo: "+indice);
        if(indice!=40)
            System.out.println("ERRORE di indice carte");
        
    }
    private void shuffleMazzo() {
        int index;
        Carta temp;
        Random random = new Random();
        for (int i = mazzo.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = mazzo[index];
            mazzo[index] = mazzo[i];
            mazzo[i] = temp;
        }
    }

    public Carta estraiCarta() {
        if(cartePescate<39)
        return mazzo[cartePescate++];
        else return null;
    }

    public void stampaStato() {
        System.out.println("Carte pescate in totale:"+cartePescate);
        
    }
}
