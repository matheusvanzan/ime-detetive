package Tabuleiro;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card {
    final String suspect[] = {"",// "1.1", "1.2", "1.3", "1.4", "1.5", "1.6"
                              "1.1 - Miss Scarlett",
                              "1.2 - Colonel Mustard",
                              "1.3 - Mrs White",
                              "1.4 - Reverend Green",
                              "1.5 - Mrs Peacock",
                              "1.6 - Professor Plum"
                             };
    final String weapon[] = {"", //"2.1", "2.2", "2.3", "2.4", "2.5", "2.6"
                             "2.1 - Candlestick",
                             "2.2 - Dagger",
                             "2.3 - Lead pipe",
                             "2.4 - Revolver",
                             "2.5 - Rope",
                             "2.6 - Spanner"
                            };
    
    final String room[] = {"", //"3.1", "3.2", "3.3", "3.4", "3.5", "3.6", "3.7", "3.8", "3.9"
                            //"Cellar",
                           "3.1 - Ballroom",
                           "3.2 - Conservatory",
                           "3.3 - Biliard Room",
                           "3.4 - Library",
                           "3.5 - Study Room",
                           "3.6 - Hall",
                           "3.7 - Lounge",
                           "3.8 - Dining Room",
                           "3.9 - Kitchen"
                          };
    
    final String suspectIndex[] = {"", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6"};
    final String weaponIndex[] = {"", "2.1", "2.2", "2.3", "2.4", "2.5", "2.6"};
    final String roomIndex[] = {"", "3.1", "3.2", "3.3", "3.4", "3.5", "3.6", "3.7", "3.8", "3.9"};
    
    int type;
    int id;
    
    public Card(int type, int id){
        this.type = type;
        this.id = id;
    }
    
    public int getType(){
        return type;
    }
    
    public int getId(){
        return id;
    }
    
    public Card[] getAllCards(){
        Card[] cards = new Card[6+6+9+1];
        cards[0] = new Card(0, 0);
        for(int i=1; i<=6; i++) cards[i] = new Card(1, i);
        for(int i=1; i<=6; i++) cards[i+6] = new Card(2, i);
        for(int i=1; i<=9; i++) cards[i+12] = new Card(3, i);
        return cards;
    }
    
    @Override
    public String toString(){ //return the name
        if(type == 1) return suspect[id];
        else if(type == 2) return weapon[id];
        else if(type == 3) return room[id];
        else return "";
    }
    
    public String toStringIndex(){ //returns the index as string
        if(type == 1) return suspectIndex[id];
        else if(type == 2) return weaponIndex[id];
        else if(type == 3) return roomIndex[id];
        else return "";
    }
        
    public boolean equals(Card card){
        if(this.getId() == card.getId() && this.getType() == card.getType())
            return true;
        else
            return false;
    }
    
    public ImageIcon getImage(){try{
            BufferedImage card = ImageIO.read(
                    new File("cards\\card "+ toStringIndex() + ".png"));
            card = scaleImage(card, 0.4f);
            ImageIcon card_icon = new ImageIcon(card);
            return card_icon;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ImageIcon();
    }
    
    private BufferedImage scaleImage(BufferedImage img, float factor){        
        int scaleX = (int) (img.getWidth() * factor);
        int scaleY = (int) (img.getHeight() * factor);
        
        Image image = img.getScaledInstance(scaleX, scaleY, Image.SCALE_SMOOTH);
        BufferedImage buffered = new BufferedImage(scaleX, scaleY, BufferedImage.TYPE_INT_ARGB);
        buffered.getGraphics().drawImage(image, 0, 0 , null);
        
        return buffered;
    }
}
