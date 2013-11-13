package Tabuleiro;

public class Envelope {
    Card suspect;
    Card weapon;
    Card room;
    
    public Envelope(){
        
    }
    
    public void addCard(Card card){
        if(card.getType() == 1) suspect = card;
        if(card.getType() == 2) weapon = card;
        if(card.getType() == 3) room = card;
    }
    
    public Card getSuspect(){
        return suspect;
    }
    
    public Card getWeapon(){
        return weapon;
    }
    
    public Card getRoom(){
        return room;
    }    
}
