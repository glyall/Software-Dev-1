class Card {
	protected int value = 0; 
	protected int suit = 0; //C=1 D=2 H3 = S4
	
	Card(){
	value = 0; 
	suit = 0;
	}
	void setValue(int newVal){
		value=newVal;
	}
	void setSuit(int newSuit){
		value=newSuit;
	}
	int getValue(){
		return value;
	}
	int getSuit(){
		return suit;
	}
}

class Player {
	int cLength = 2;
	ArrayList<Card> c =new ArrayList<>();	
Player(){
	for (int k= 0; k<cLength; k++){
		c.add(new Card());
	}	
}
void hitMe(){
	c.add(new Card());
	c.get(cLength).setValue((int)((12*Math.random())+1));
	c.get(cLength).setSuit((int)((3*Math.random())+1));
	cLength++;
	for(int k= 0 ; k<40 ;k++){
		System.out.print("");
	}
}
