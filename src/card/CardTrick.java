package card;

import java.util.Random;


/**
 *Student Name : Viren Panchal
 * Student ID : 991742185
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        

       

        Card luckyCard = new Card();
        luckyCard.setValue(10); 
        luckyCard.setSuit("Hearts"); 

        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); 
            int suitIndex = rand.nextInt(4); 
            c.setSuit(Card.SUITS[suitIndex]);
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue()); 
        }

        
        

        

        
        boolean found = false;
        for (Card card : magicHand) {
        if (card.getValue() == luckyCard.getValue() && card.getSuit().equals(luckyCard.getSuit())) {
          found = true;
             break;
         }
       }
        if (found) {
           System.out.println("Congratulations, you found the lucky card!");
         } else {
           System.out.println("Sorry, the lucky card is not in the magic hand.");
         }
    }
}
