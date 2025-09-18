/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        boolean match = false;
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
            System.out.println(c.getSuit() + " " +c.getValue() );
            
            
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        System.out.print("Please pick a card 1 to 13: ");
        int userInput = input.nextInt();
        input.nextLine();
        System.out.print("0 - 3 where 0 = Hearts  , 1 = Diamonds , 2 = Spades , 3 = Clubs: ");
        int userSuit = input.nextInt();
        
        
        
       
        
        
        
        
        
        //Then report the result here
          for(Card c : magicHand){
            if(c.getValue() == userInput && c.getSuit().equals(Card.SUITS[userSuit])){
                match = true;
                break;
            }
        }
        if(match){
            System.out.println("Your card was in the magic hand");
        }
        else{
            System.out.println("Your card was not in the magic hand");
        }
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        boolean luckyMatch = false;
            for(Card c : magicHand){
            if(c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())){
                match = true;
                break;
            }
        }

        if(luckyMatch){
            System.out.print("Lucky card found! You win a bonus!");
    }
        else{

    System.out.println("Lucky card not found. Better luck next time");
}
    }
}
