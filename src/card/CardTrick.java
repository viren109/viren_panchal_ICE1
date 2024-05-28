package card;

import java.util.Random;
import java.util.Scanner;

/**
 *Student Name : Viren Panchal
 * Student ID : 991742185
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); 
            int suitIndex = rand.nextInt(4); 
            c.setSuit(Card.SUITS[suitIndex]);
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " + c.getValue()); 
        }

        
        System.out.println("Enter a card value (1-13):");
        int userValue = scanner.nextInt();

        System.out.println("Enter a suit (0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades):");
        int userSuitIndex = scanner.nextInt();
        String userSuit = Card.SUITS[userSuitIndex];

        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equals(userSuit)) {
                found = true;
                break;
            }
        }

       
        if (found) {
            System.out.println("Congratulations, your card is in the magic hand!");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }

        scanner.close();
    }
}