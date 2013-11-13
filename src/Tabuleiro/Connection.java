package Tabuleiro;

import java.io.*;
import java.awt.*;

public class Connection {
    String file;
    
    public Connection(String ip){       
        file = "\\\\" + ip + "\\Users\\Clue\\Clue.txt";
    }
    
    public void Update(int numberOfPlayers, int currentPlayer, 
            Point[] p, Envelope envelope, Player[] player){
        //create the file
        String content = "";
        content += "numberOfPlayers=" + Integer.toString(numberOfPlayers) + ";";
        content += "currentPlayer=" + Integer.toString(currentPlayer) + ";";
                       
        for(int i=1; i<=numberOfPlayers; i++){
            content += (Integer.toString(i) + "=" + 
                        Integer.toString((int)p[i].getX()) + "," + 
                        Integer.toString((int)p[i].getY()) + ";");
        }
        
        content += "envelope=" + 
                    envelope.getSuspect().toString() + "," +
                    envelope.getWeapon().toString() + "," +
                    envelope.getRoom().toString() + ";";
        
        for(int i=1; i<player.length; i++){
            content += "player[" + Integer.toString(i) + "]=";
            
            for(int j=0; j<player[i].getSuspects().length; j++)
                content += player[i].getSuspects()[j] + ",";
            
            for(int j=0; j<player[i].getWeapons().length; j++)
                content += player[i].getWeapons()[j] + ",";
            
            for(int j=0; j<player[i].getRooms().length; j++)
                content += player[i].getRooms()[j] + ",";
                
            content += ";";
        }
        
        try{
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("Wrote: " + content);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void Read(int[] numbers, Point[] p, Envelope envelope, Player[] player){
        String content = "";
        int count = 0;
        
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            content = br.readLine();
                       
            String[] parts = content.split(";");
            numbers[0] = Integer.parseInt(parts[0].split("=")[1]);//numberOfPlayers
            numbers[1] = Integer.parseInt(parts[1].split("=")[1]);//currentPlayer
            
            count = 2;
            
            for(int i=1; i<=numbers[0]; i++){
                p[i].setLocation(Integer.parseInt(parts[i+1].split("=")[1].split(",")[0]),
                                 Integer.parseInt(parts[i+1].split("=")[1].split(",")[1]));
                count += 1;
            }
            
            String[] env = parts[count].split("=")[1].split(",");
            for(int i=0; i<env.length; i++){ 
                if(env[i].equals("null") == false)
                    envelope.addCard(new Card(
                            (Integer.parseInt(env[i].split("\\.")[0])),
                            (Integer.parseInt(env[i].split("\\.")[1]))));
            }
            
            for(int i=1; i<=numbers[0]; i++){
                String[] play = parts[count+i].split("=")[1].split(",");
                for(int j=0; j<play.length; j++){
                    
                    if(play[j].equals("null") == false){    
                        player[i].addCard(new Card(
                                (Integer.parseInt(play[j].split("\\.")[0])),
                                (Integer.parseInt(play[j].split("\\.")[1]))));
                    }
                }       
            }            
            br.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}