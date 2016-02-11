package labs;

import java.util.*;
import java.lang.*;
import java.io.*;
public class BlackJack {
	public static void main(String[] args) { 
    theHouse dealer = new theHouse();
    dealer.printCard();	
	
 class theHouse{
	 private Card card = new Card(); 
	//constructor for theHouse 
	theHouse(){
	card.value = (int) ((12*Math.random())+1);	
	card.suit =  (int)(12*Math.random()+1);
	}
	void printCard(Card c){
		
	}
	
	switch (card.value){
	 case 1:System.out.println("A");  
		break;
	 case 2:System.out.println("J"); 
		break;
	 case 3:System.out.println("Q"); 
		break;
	 case 4:System.out.println("K"); 
		break;
	default: System.out.prinf("%d",card.value);
		break;
	 }
 
 class Card{
	 int value =0;
	 int suit = 0; 
	 // C=clubs, H=hearts, D=diamonds, S=Spades 
	 Card(){	 
}	
}

class Player{
	Card [] c = new Card [2];

  void hit(Card newCard){
	  Card[] p = new Card[cLength + 1 ];
	  for (int k =0; k< cLength; k++){ 
		  p[k]= c[k]
		  p[cLength] = newCard;
		  cLength ++;
		  c =p;
	  }		  
	  }
	 
	 }
 Card Stay(){
	return c ;
 }
 


}
}
	}
}


