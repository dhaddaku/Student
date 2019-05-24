
package ice1;
import java.util.*;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
//Modifier name = kulvir kaur dhadda
//student number = 991539865
public class CardTrick {
    
    public static void main(String[] args)
    {  
        Random rand = new Random();
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i] = new Card();
            Card c = new Card();
            c.setValue(rand.nextInt(13)*1); //(insert call to random number generator here)
            c.setSuit(Card.SUITS[rand.nextInt(4)]);   //(Card.SUITS[insert call to random number between 0-3 here])
        }
        
         Scanner input = new Scanner(System.in);//insert code to ask the user for Card value and suit, create their card
          //for (int i=0; i<magicHand.length; i++){
         
         
          Card c1=new Card();
          System.out.println("please enter the number of card from 1 to 13");
         
           c1.setValue(input.nextInt());
          System.out.println("please enter the name of card suit from 0 to 3");
          c1.setSuit(Card.SUITS[input.nextInt()]);
                 // }
          
         
         for (int i=0; i<magicHand.length; i++){
             if(magicHand[i].getValue() == c1.getValue() && magicHand[i].getSuit()== c1.getSuit()){
                 System.out.println("Card fount");
             }
             else{
                 System.out.println("card not found");
             }
         }
         
        // and search magicHand here
        //Then report the result here
    }
    
}
