package Tabuleiro;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Tab {
    Color green = new Color(34, 177, 76);
    Color red = new Color(237, 28, 36);
    Color blue = new Color(63, 72, 204);
    Color yellow = new Color(255, 242, 0);
    Color white = new Color(255, 255, 255);
    Color orange = new Color(255, 127, 39);
    
    final String table_back_img = "grid_final_back.png";
    final String table_front_img = "grid_final_front.png";
    final String pin_img = "pin.jpg";
    
    final int originX = 12;
    final int originY = 12;
    
    final int side = 20;
    
    public boolean CheckValidMove(int mouseX, int mouseY, int lastX, int lastY){    
        //Prohibed colors
        try {
            //Prohibed colors
            BufferedImage table_image = ImageIO.read(new File(table_back_img));//grid estrategico
            Color color = new Color(table_image.getRGB(mouseX, mouseY));
            if(color.equals(red)) return false;
            if(color.equals(green)) return false;
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Can olnly move one square at a time
        if((Math.abs(mouseX - lastX) == side && Math.abs(mouseY - lastY) == 0   ) || //left right
           //(Math.abs(mouseX - lastX) == side && Math.abs(mouseY - lastY) == side) || //diagonals
           (Math.abs(mouseX - lastX) == 0    && Math.abs(mouseY - lastY) == side) //|| //up down
           //(Math.abs(mouseX - lastX) == 0    && Math.abs(mouseY - lastY) == 0)   //same  place
           ){ 
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean CheckEnteringRoom(int mouseX, int mouseY, int lastX, int lastY){    
        //from blue to orange
        try {
            BufferedImage table_image = ImageIO.read(new File(table_back_img));//grid estrategico
            Color mouseColor = new Color(table_image.getRGB(mouseX, mouseY));
            Color lastColor = new Color(table_image.getRGB(lastX, lastY));
            
            return (lastColor.equals(white) && mouseColor.equals(blue));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean CheckLeavingRoom(int mouseX, int mouseY, int lastX, int lastY){    
        //from orange to blue
        try {
            BufferedImage table_image = ImageIO.read(new File(table_back_img));//grid estrategico
            Color mouseColor = new Color(table_image.getRGB(mouseX, mouseY));
            Color lastColor = new Color(table_image.getRGB(lastX, lastY));
            
            return (lastColor.equals(orange) && mouseColor.equals(blue));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean CheckInsideRoom(int mouseX, int mouseY, int lastX, int lastY){ //moving   
        //from blue to orange
        try {
            BufferedImage table_image = ImageIO.read(new File(table_back_img));//grid estrategico
            Color mouseColor = new Color(table_image.getRGB(mouseX, mouseY));
            Color lastColor = new Color(table_image.getRGB(lastX, lastY));
            
            return (lastColor.equals(orange) && mouseColor.equals(orange));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean CheckInsideRoom(int mouseX, int mouseY){ //stopped 
        //from blue to orange
        try {
            BufferedImage table_image = ImageIO.read(new File(table_back_img));//grid estrategico
            Color mouseColor = new Color(table_image.getRGB(mouseX, mouseY));
            
            return (mouseColor.equals(orange));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int getRoom(int mouseX, int mouseY){
        Point[] r1 = new Point[9+1];
        r1[0] = new Point(0  ,  0);
        r1[1] = new Point(192, 32);
        r1[2] = new Point(412, 52);
        r1[3] = new Point(412,192);
        r1[4] = new Point(392,312);
        r1[5] = new Point(392,452);
        r1[6] = new Point(232,392);
        r1[7] = new Point( 12,412);
        r1[8] = new Point( 32,212);
        r1[9] = new Point( 12, 52);
        
        Point[] r2 = new Point[9+1];
        r2[0] = new Point(0  ,  0);
        r2[1] = new Point(292,132);
        r2[2] = new Point(492, 92);
        r2[3] = new Point(472,232);
        r2[4] = new Point(472,352);
        r2[5] = new Point(492,472);
        r2[6] = new Point(292,472);
        r2[7] = new Point(132,472);
        r2[8] = new Point(132,292);
        r2[9] = new Point( 92,112);
        
        //must be orange
        try {
            BufferedImage table_image = ImageIO.read(new File(table_back_img));//grid estrategico
            Color mouseColor = new Color(table_image.getRGB(mouseX, mouseY));
            
            if(mouseColor.equals(orange) == false)
                return 0;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Point p = new Point(mouseX, mouseY);
        
        for(int i=1; i<=9; i++)
            if(checkInside(p, r1[i], r2[i]))
                return i;
                
        return 0;
    }
    
    boolean checkInside(Point p, Point r1, Point r2){
        if(p.getX() >= r1.getX() && p.getX() <= r2.getX() &&
           p.getY() >= r1.getY() && p.getY() <= r2.getY())
            return true;
        else
            return false;
        
    }
}
