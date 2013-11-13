package Tabuleiro;

public class Player {
    int suspectsCount;
    int weaponsCount;
    int roomsCount;
    
    public Card[] suspects;
    public Card[] weapons;
    public Card[] rooms;
    
    public Player(){
        suspectsCount = 0;
        weaponsCount = 0;
        roomsCount = 0;
        
        suspects = new Card[6+1];
        weapons = new Card[6+1];
        rooms = new Card[9+1];
    }
    
    public void addCard(Card card){
        if(card.getType() == 1){
            suspectsCount++;
            suspects[suspectsCount] = card;
        }
        if(card.getType() == 2){
            weaponsCount++;
            weapons[weaponsCount] = card;
        }
        if(card.getType() == 3){
            roomsCount++;
            rooms[roomsCount] = card;
        }
    }
    
    public boolean hasCard(Card card){

        for(int i=1; i<=suspectsCount; i++)
            if(getSuspects()[i].equals(card))
                return true;

        for(int i=1; i<=weaponsCount; i++)
            if(getWeapons()[i].equals(card))
                return true;
       
        for(int i=1; i<=roomsCount; i++)
            if(getRooms()[i].equals(card))
                return true;
        
        return false;
    }
        
    public Card[] getSuspects(){
        return suspects;
    }
    
    public Card[] getWeapons(){
        return weapons;
    }
    
    public Card[] getRooms(){
        return rooms;
    }
}
