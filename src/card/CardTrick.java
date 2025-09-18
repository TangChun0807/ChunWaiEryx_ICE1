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
 * Modifier Chun Wai Eryx Tang 
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        Scanner input = new Scanner(System.in); // import scanner for getting user input 
        boolean match = false; //create a boolean for tracking matches 
        
        //Draw 7 random cards
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
       
        
        
        
       
        
        
        
        
        
       
        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card(); // lucky card as new object 
        luckyCard.setValue(2); // set lucky card to 2
        luckyCard.setSuit("Clubs"); //set lucky card to clubs

        boolean luckyMatch = false; // tracking lack card 
            // check that lucky card's value and suit match the magic hand
            for(Card c : magicHand){
            if(c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())){
                luckyMatch = true;
                break;
            }
        }
            
        //output the result 
        if(luckyMatch){
            System.out.print("Lucky card found! You win a bonus!");
    }
        else{

    System.out.println("Lucky card not found. Better luck next time");
}
    }
}
