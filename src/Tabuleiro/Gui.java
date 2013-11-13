package Tabuleiro;

import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ItemEvent;

public class Gui extends javax.swing.JFrame {
    final String table_back_img = "grid_final_back.png";
    final String table_front_img = "grid_final_front.png";
    final String pin_img = "pin"; //diferent for each pin 
    
    //Data to keep track
    public Player[] player = new Player[6+1];
    public Envelope envelope = new Envelope();
        
    final int originX = 12;
    final int originY = 12;
    
    final int side = 20;
    
    int[] lastX;
    int[] lastY;
    
    int numberOfPlayers;
    int currentPlayer;
    
    int diceValue;
    int movesLeft;
    
    int[] jumpPlayers;
    
    boolean gameFreezed; //to pause the game for players' actions
    
    public Gui() {
        initComponents();
        //setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        lastX = new int[6+1];
        lastY = new int[6+1];
        jumpPlayers = new int[6+1];
        
        for(int i=0; i<7; i++){
            lastX[i] = 0;
            lastY[i] = 0;
            jumpPlayers[i] = 0;//1-jump; 0-no jump
        }
        
        currentPlayer = 1;
        
        gameFreezed = false;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTable = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelMyCard1 = new javax.swing.JLabel();
        jLabelMyCard2 = new javax.swing.JLabel();
        jLabelMyCard3 = new javax.swing.JLabel();
        jLabelMyCard4 = new javax.swing.JLabel();
        jLabelMyCard5 = new javax.swing.JLabel();
        jLabelMyCard6 = new javax.swing.JLabel();
        jLabelMyCard7 = new javax.swing.JLabel();
        jLabelMyCard8 = new javax.swing.JLabel();
        jLabelMyCard9 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabelEnvSuspect = new javax.swing.JLabel();
        jLabelEnvWeapon = new javax.swing.JLabel();
        jLabelEnvRoom = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabelP1Suspect = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabelP1Weapon = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabelP1Room = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabelP2Suspect = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabelP2Weapon = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabelP2Room = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabelP3Suspect = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabelP3Weapon = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabelP3Room = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabelP4Suspect = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabelP4Weapon = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabelP4Room = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabelP5Suspect = new javax.swing.JLabel();
        jLabelP5Weapon = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabelP5Room = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabelP6Suspect = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabelP6Weapon = new javax.swing.JLabel();
        jLabelP6Room = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelMousePressedX = new javax.swing.JLabel();
        jLabelPin6 = new javax.swing.JLabel();
        jLabeelMousePressedY = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelMouseReleasedX = new javax.swing.JLabel();
        jLabelMouseReleasedY = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelSquareB = new javax.swing.JLabel();
        jLabelSquareG = new javax.swing.JLabel();
        jLabelSquareX = new javax.swing.JLabel();
        jLabelSquareR = new javax.swing.JLabel();
        jLabelSquareY = new javax.swing.JLabel();
        jLabelPin1 = new javax.swing.JLabel();
        jLabelPin2 = new javax.swing.JLabel();
        jLabelPin3 = new javax.swing.JLabel();
        jLabelPin4 = new javax.swing.JLabel();
        jLabelPin5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaLog = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxNumberOfPlayers = new javax.swing.JComboBox();
        jButtonStartGame = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButtonRollDices = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelDice1 = new javax.swing.JLabel();
        jLabelDice2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelDiceMoves = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabelCurrentPlayer = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabelMovesLeft = new javax.swing.JLabel();
        jLabelPinPlayer = new javax.swing.JLabel();
        jPanelGuess = new javax.swing.JPanel();
        jButtonPass = new javax.swing.JButton();
        jButtonGuess = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jComboBoxGuessSuspect = new javax.swing.JComboBox();
        jComboBoxGuessWeapon = new javax.swing.JComboBox();
        jLabel58 = new javax.swing.JLabel();
        jComboBoxGuessRoom = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButtonDoIt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clue");
        setForeground(new java.awt.Color(212, 208, 200));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelTable.setMaximumSize(new java.awt.Dimension(522, 522));
        jLabelTable.setMinimumSize(new java.awt.Dimension(522, 522));
        jLabelTable.setPreferredSize(new java.awt.Dimension(522, 522));
        jLabelTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelTableMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelTableMouseReleased(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("My Cards"));
        jPanel6.setMaximumSize(new java.awt.Dimension(522, 129));
        jPanel6.setMinimumSize(new java.awt.Dimension(522, 129));

        jLabelMyCard1.setText("jLabelMyCard1");

        jLabelMyCard2.setText("jLabelMyCard1");

        jLabelMyCard3.setText("jLabelMyCard1");

        jLabelMyCard4.setText("jLabelMyCard1");

        jLabelMyCard5.setText("jLabelMyCard1");

        jLabelMyCard6.setText("jLabelMyCard1");

        jLabelMyCard7.setText("jLabelMyCard1");

        jLabelMyCard8.setText("jLabelMyCard1");

        jLabelMyCard9.setText("jLabelMyCard1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMyCard1)
                    .addComponent(jLabelMyCard2)
                    .addComponent(jLabelMyCard3)
                    .addComponent(jLabelMyCard4)
                    .addComponent(jLabelMyCard5)
                    .addComponent(jLabelMyCard6)
                    .addComponent(jLabelMyCard7)
                    .addComponent(jLabelMyCard8)
                    .addComponent(jLabelMyCard9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMyCard1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMyCard2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMyCard3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMyCard4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMyCard5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMyCard6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMyCard7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMyCard8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMyCard9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Programmer's Info"));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setText("On Envelope");

        jLabel21.setText("Player 1");

        jLabel22.setText("Player 2");

        jLabel23.setText("Player 3");

        jLabel24.setText("Player 4");

        jLabel25.setText("Player 5");

        jLabel26.setText("Suspect:");

        jLabel27.setText("Weapon:");

        jLabel28.setText("Room:");

        jLabelEnvSuspect.setText("_suspects");

        jLabelEnvWeapon.setText("_weapons");

        jLabelEnvRoom.setText("_rooms");

        jLabel32.setText("Suspects:");

        jLabelP1Suspect.setText("_suspects");

        jLabel34.setText("Weapons:");

        jLabelP1Weapon.setText("_weapons");

        jLabel36.setText("Romms:");

        jLabelP1Room.setText("_rooms");

        jLabel38.setText("Suspects:");

        jLabelP2Suspect.setText("_suspects");

        jLabel40.setText("Weapons:");

        jLabelP2Weapon.setText("_weapons");

        jLabel42.setText("Rooms:");

        jLabelP2Room.setText("_rooms");

        jLabel44.setText("Suspects:");

        jLabelP3Suspect.setText("_suspects");

        jLabel46.setText("Weapons:");

        jLabelP3Weapon.setText("_weapons");

        jLabel48.setText("Rooms:");

        jLabelP3Room.setText("_rooms");

        jLabel50.setText("Suspects:");

        jLabelP4Suspect.setText("_suspects");

        jLabel52.setText("Weapons:");

        jLabelP4Weapon.setText("_weapons");

        jLabel54.setText("Rooms:");

        jLabelP4Room.setText("_rooms");

        jLabel56.setText("Suspects:");

        jLabelP5Suspect.setText("_suspects");

        jLabelP5Weapon.setText("_weapons");

        jLabel59.setText("Weapons:");

        jLabel60.setText("Rooms:");

        jLabelP5Room.setText("_rooms");

        jLabel62.setText("Player 6");

        jLabel63.setText("Suspects:");

        jLabelP6Suspect.setText("_suspects");

        jLabel65.setText("Weapons:");

        jLabelP6Weapon.setText("_weapons");

        jLabelP6Room.setText("_rooms");

        jLabel68.setText("Romms:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEnvSuspect))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEnvRoom)
                                    .addComponent(jLabelEnvWeapon)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelP1Suspect))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel36))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelP1Room)
                                            .addComponent(jLabelP1Weapon)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelP2Suspect))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel40)
                                            .addComponent(jLabel42))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelP2Room)
                                            .addComponent(jLabelP2Weapon)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelP3Suspect))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel48))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelP3Room)
                                            .addComponent(jLabelP3Weapon))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel62)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel50)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelP4Suspect))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel52)
                                                    .addComponent(jLabel54))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelP4Room)
                                                    .addComponent(jLabelP4Weapon)))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel56)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelP5Suspect))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel59)
                                                    .addComponent(jLabel60))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelP5Room)
                                                    .addComponent(jLabelP5Weapon)))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel63)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelP6Suspect))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel65)
                                                    .addComponent(jLabel68))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelP6Room)
                                                    .addComponent(jLabelP6Weapon))))))))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(jLabelP4Suspect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(jLabelP4Weapon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(jLabelP4Room))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(jLabelP5Suspect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(jLabelP5Weapon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(jLabelP5Room))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel62)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(jLabelP6Suspect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(jLabelP6Weapon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel68)
                            .addComponent(jLabelP6Room)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabelEnvSuspect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabelEnvWeapon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabelEnvRoom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jLabelP1Suspect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabelP1Weapon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jLabelP1Room))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(jLabelP2Suspect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jLabelP2Weapon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jLabelP2Room))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jLabelP3Suspect))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(jLabelP3Weapon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(jLabelP3Room))))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Cards Control", jPanel7);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("x");

        jLabel3.setText("y");

        jLabelMousePressedX.setText("_x");

        jLabelPin6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPin6MouseReleased(evt);
            }
        });
        jLabelPin6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelPin6MouseDragged(evt);
            }
        });

        jLabeelMousePressedY.setText("_y");

        jLabel6.setText("Pressed");

        jLabel7.setText("Released");

        jLabel8.setText("x");

        jLabel9.setText("y");

        jLabelMouseReleasedX.setText("_x");

        jLabelMouseReleasedY.setText("_y");

        jLabel12.setText("Mouse");

        jLabel1.setText("Square");

        jLabel13.setText("x");

        jLabel14.setText("y");

        jLabel15.setText("R");

        jLabel16.setText("G");

        jLabel17.setText("B");

        jLabelSquareB.setText("_B");

        jLabelSquareG.setText("_G");

        jLabelSquareX.setText("_x");

        jLabelSquareR.setText("_R");

        jLabelSquareY.setText("_y");

        jLabelPin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPin1MouseReleased(evt);
            }
        });
        jLabelPin1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelPin1MouseDragged(evt);
            }
        });

        jLabelPin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPin2MouseReleased(evt);
            }
        });
        jLabelPin2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelPin2MouseDragged(evt);
            }
        });

        jLabelPin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPin3MouseReleased(evt);
            }
        });
        jLabelPin3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelPin3MouseDragged(evt);
            }
        });

        jLabelPin4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPin4MouseReleased(evt);
            }
        });
        jLabelPin4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelPin4MouseDragged(evt);
            }
        });

        jLabelPin5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPin5MouseReleased(evt);
            }
        });
        jLabelPin5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelPin5MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelMousePressedX))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabeelMousePressedY))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelMouseReleasedX))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelMouseReleasedY)))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel13))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelSquareY)
                                            .addComponent(jLabelSquareR)
                                            .addComponent(jLabelSquareG)
                                            .addComponent(jLabelSquareB)
                                            .addComponent(jLabelSquareX)))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelPin1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelPin2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelPin3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelPin4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelPin5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelPin6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelMousePressedX))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabeelMousePressedY))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabelMouseReleasedX))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabelMouseReleasedY)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabelSquareX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSquareY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelSquareR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSquareG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSquareB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPin1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPin2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPin4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPin3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPin5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPin6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTabbedPane2.addTab("X Y info", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTextAreaLog.setColumns(20);
        jTextAreaLog.setRows(5);
        jScrollPane1.setViewportView(jTextAreaLog);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Log", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("New Game"));

        jLabel4.setText("Number of Players:");

        jComboBoxNumberOfPlayers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6" }));

        jButtonStartGame.setText("Start New Game");
        jButtonStartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNumberOfPlayers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jButtonStartGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxNumberOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonStartGame)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dice"));

        jButtonRollDices.setText("Roll Dices");
        jButtonRollDices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRollDicesActionPerformed(evt);
            }
        });

        jLabel10.setText("Dice 1:");

        jLabel11.setText("Dice 2:");

        jLabelDice1.setText("dice");

        jLabelDice2.setText("dice");

        jLabel18.setText("Moves:");

        jLabelDiceMoves.setText("dice");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDice1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDice2)))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRollDices, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDiceMoves)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabelDice1)
                    .addComponent(jLabel18)
                    .addComponent(jLabelDiceMoves))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabelDice2))
                    .addComponent(jButtonRollDices))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));

        jLabel5.setText("Player:");

        jLabelCurrentPlayer.setText("_Player");

        jLabel19.setText("movesLeft:");

        jLabelMovesLeft.setText("_moves");

        jLabelPinPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelPinPlayerMouseReleased(evt);
            }
        });
        jLabelPinPlayer.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabelPinPlayerMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCurrentPlayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelPinPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMovesLeft)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPinPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabelCurrentPlayer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabelMovesLeft))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanelGuess.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGuess.setBorder(javax.swing.BorderFactory.createTitledBorder("Guess"));

        jButtonPass.setText("Pass");
        jButtonPass.setEnabled(false);
        jButtonPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPassActionPerformed(evt);
            }
        });

        jButtonGuess.setText("Guess");
        jButtonGuess.setEnabled(false);
        jButtonGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuessActionPerformed(evt);
            }
        });

        jLabel29.setText("Want to make a guess?");

        jLabel55.setText("Suspect");

        jLabel57.setText("Weapon");

        jComboBoxGuessSuspect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxGuessWeapon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel58.setText("Room");

        jComboBoxGuessRoom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCheckBox1.setText("Take a hunch");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jButtonDoIt.setText("Do it");
        jButtonDoIt.setEnabled(false);
        jButtonDoIt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoItActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelGuessLayout = new javax.swing.GroupLayout(jPanelGuess);
        jPanelGuess.setLayout(jPanelGuessLayout);
        jPanelGuessLayout.setHorizontalGroup(
            jPanelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuessLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelGuessLayout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addGap(17, 17, 17)
                        .addComponent(jComboBoxGuessRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelGuessLayout.createSequentialGroup()
                            .addComponent(jCheckBox1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonDoIt, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addGroup(jPanelGuessLayout.createSequentialGroup()
                            .addComponent(jLabel57)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxGuessWeapon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel29)
                        .addGroup(jPanelGuessLayout.createSequentialGroup()
                            .addComponent(jLabel55)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxGuessSuspect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuessLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGuess)))
                .addContainerGap())
        );
        jPanelGuessLayout.setVerticalGroup(
            jPanelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuessLayout.createSequentialGroup()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jComboBoxGuessSuspect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jComboBoxGuessWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(jComboBoxGuessRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuess)
                    .addComponent(jButtonPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelGuessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jButtonDoIt))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelGuess, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGuess, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Programmers info
        ///HIDE RIGHT PANEL AND DECREASE FORM SIZE
        
        //load background
        try {
            BufferedImage table = ImageIO.read(new File(table_front_img));//Grid bonito
            ImageIcon table_icon = new ImageIcon(table);
            jLabelTable.setIcon(table_icon);
            
            for(int i=1; i<=6; i++){
                BufferedImage pin = ImageIO.read(new File(pin_img + Integer.toString(i) + ".png"));
                ImageIcon pin_icon = new ImageIcon(pin);
                getJLabelPin(i).setIcon(pin_icon);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //load guess cards
        jComboBoxGuessSuspect.removeAllItems();
        jComboBoxGuessWeapon.removeAllItems();
        jComboBoxGuessRoom.removeAllItems();
        
        for(int i=1; i<=6; i++)
            jComboBoxGuessSuspect.addItem((new Card(1, i)).toString());
        for(int i=1; i<=6; i++)
            jComboBoxGuessWeapon.addItem((new Card(2, i)).toString());
        for(int i=1; i<=9; i++)
            jComboBoxGuessRoom.addItem((new Card(3, i)).toString());
    }//GEN-LAST:event_formWindowOpened

    private void jLabelTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTableMousePressed
        //Get x y
        jLabelMousePressedX.setText(Integer.toString(evt.getX()));
        jLabeelMousePressedY.setText(Integer.toString(evt.getY()));
    }//GEN-LAST:event_jLabelTableMousePressed

    private void jLabelTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTableMouseReleased
        //Get x y
        jLabelMouseReleasedX.setText(Integer.toString(evt.getX()));
        jLabelMouseReleasedY.setText(Integer.toString(evt.getY()));
    }//GEN-LAST:event_jLabelTableMouseReleased

    public JLabel getJLabelMyCard(int i){
        switch(i){
            case 1: return jLabelMyCard1;
            case 2: return jLabelMyCard2;
            case 3: return jLabelMyCard3;
            case 4: return jLabelMyCard4;
            case 5: return jLabelMyCard5;
            case 6: return jLabelMyCard6;
            case 7: return jLabelMyCard7;
            case 8: return jLabelMyCard8;
            default: return jLabelMyCard9;
        }
    }
    
    public JLabel getJLabelSuspect(int i){
        switch(i){
            case 1: return jLabelP1Suspect;
            case 2: return jLabelP2Suspect;
            case 3: return jLabelP3Suspect;
            case 4: return jLabelP4Suspect;
            case 5: return jLabelP5Suspect;
            default: return jLabelP6Suspect;
        }
    }
    
    public JLabel getJLabelWeapon(int i){
        switch(i){
            case 1: return jLabelP1Weapon;
            case 2: return jLabelP2Weapon;
            case 3: return jLabelP3Weapon;
            case 4: return jLabelP4Weapon;
            case 5: return jLabelP5Weapon;
            default: return jLabelP6Weapon;
        }
    }
    
    public JLabel getJLabelRoom(int i){
        switch(i){
            case 1: return jLabelP1Room;
            case 2: return jLabelP2Room;
            case 3: return jLabelP3Room;
            case 4: return jLabelP4Room;
            case 5: return jLabelP5Room;
            default: return jLabelP6Room;
        }
    }
    
    public int[] shuffledArray(int n){//0 is 0, shuffle the rest
        boolean alreadyExists = false;
        boolean canEnd = false;
        
        int[] indexArray = new int[n];
        indexArray[0] = 0;
        
        for(int i=1; i< n; i++){
            alreadyExists = false;
            canEnd = false;
            while(canEnd == false){
                int randomNumber = (int) Math.ceil(Math.random()*(n-1));//1 to length-1
                alreadyExists = false;
                for(int j=1; j<i; j++){
                    if(indexArray[j] == randomNumber){
                        alreadyExists = true;
                    }
                }
                if(alreadyExists == false){
                    canEnd = true;
                    indexArray[i] = randomNumber;
                }
            }
        }
        return indexArray;
    }
    
    public JLabel getJLabelPin(int i){
        switch(i){
            case 1: return jLabelPin1;
            case 2: return jLabelPin2;
            case 3: return jLabelPin3;
            case 4: return jLabelPin4;
            case 5: return jLabelPin5;
            default: return jLabelPin6;
        }
    }
    
    public void jLabelPinMouseDragged(int i, java.awt.event.MouseEvent evt){
        //Check if it is his turn
        if((i != currentPlayer) || (movesLeft <= 0)){
            //jTextAreaLog.append("Pin " + Integer.toString(i) + ": Not your turn!\n");
            return;
        }
        
        //Get mouse location (center of square)
        int mouseX = getJLabelPin(i).getX() + evt.getX() - getJLabelPin(i).getWidth()/2;
        int mouseY = getJLabelPin(i).getY() + evt.getY() - getJLabelPin(i).getHeight()/2;
        getJLabelPin(i).setLocation(mouseX, mouseY);
    }
    
    public void jLabelPinMouseReleased(int i, java.awt.event.MouseEvent evt){ //almost all game playing is here
        //Check if it is his turn
        if((i != currentPlayer) || (movesLeft <= 0)){
            jTextAreaLog.append("Pin " + Integer.toString(i) + ": Not your turn!\n");
            return;
        }
        
        Tab tab = new Tab();
 
        //Get left top of square
        int mouseX = getJLabelPin(i).getX();
        int mouseY = getJLabelPin(i).getY();
               
        //Fit positon ON square case
        mouseX = (mouseX/side)*side; //Already gets integer part
        mouseY = (mouseY/side)*side;

        //Check if it is out of the table
        if(originX + mouseX + getJLabelPin(i).getWidth() > jLabelTable.getWidth())
            mouseX -= side;
        if(originY + mouseY + getJLabelPin(i).getHeight() > jLabelTable.getHeight())
            mouseY -= side;
        
        //Add origin
        mouseX += originX;
        mouseY += originY;
        
        //Check valid move
        if(tab.CheckValidMove(mouseX, mouseY, lastX[i], lastY[i])){ 
            System.out.println("ok");
            //See what happens in this square (check if it is a door)
            //check shortcuts
//            12, 52        492,52
//            12,472       492,472
            if(mouseX == 12 && mouseY == 52){
                mouseX = 492; 
                mouseY = 472;
            }
            else if(mouseX == 492 && mouseY == 472){
                mouseX = 12; 
                mouseY = 52;
            }
            else if(mouseX == 12 && mouseY == 472) {
                mouseX = 492; 
                mouseY = 52;
            }
            else if(mouseX == 492 && mouseY == 52){
                mouseX = 12; 
                mouseY = 472;
            }
            
            //check inside
            if(tab.CheckInsideRoom(mouseX, mouseY, lastX[i], lastY[i])){
                gameFreezed = true;
                jLabelMovesLeft.setText("Game freezed!");
                //get wich room
                int roomId = tab.getRoom(mouseX, mouseY);
                jComboBoxGuessRoom.setSelectedIndex(roomId - 1);
                jComboBoxGuessRoom.setEnabled(false);
            }
            
            //check entering
            if(tab.CheckEnteringRoom(mouseX, mouseY, lastX[i], lastY[i])){
                gameFreezed = true;
                jButtonGuess.setEnabled(true);
                jButtonPass.setEnabled(true);
                jLabelMovesLeft.setText("Game freezed!");
            }
                        
            //check leaving
            if(tab.CheckLeavingRoom(mouseX, mouseY, lastX[i], lastY[i])){
                gameFreezed = false;
                jButtonGuess.setEnabled(false);
                jButtonPass.setEnabled(false);
                movesLeft+=1;
                jLabelMovesLeft.setText("Game unfreezed!");
            }
            
            //move pin
            lastX[i] = mouseX;
            lastY[i] = mouseY;
            getJLabelPin(i).setLocation(mouseX, mouseY);
            
            //log
            jTextAreaLog.append("Pin " + Integer.toString(i) + 
                        ": Moved to (" + Integer.toString(mouseX) + ", " + 
                                         Integer.toString(mouseY)  +")\n");
            
            //preparing next play - only runs if game not freezed
            nextPlay();
        }
        else{
            getJLabelPin(i).setLocation(lastX[i], lastY[i]);
            jTextAreaLog.append("Pin " + Integer.toString(i) + ": Invalid Move!\n");
        }
        
        //Get color
        try {
            BufferedImage table_image = ImageIO.read(new File(table_back_img));//grid estrategico
            Color color = new Color(table_image.getRGB(mouseX, mouseY));
            jLabelSquareX.setText(Integer.toString(mouseX));
            jLabelSquareY.setText(Integer.toString(mouseY));
            jLabelSquareR.setText(Integer.toString(color.getRed()));
            jLabelSquareG.setText(Integer.toString(color.getGreen()));
            jLabelSquareB.setText(Integer.toString(color.getBlue()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
    public void nextPlay(){
        if(gameFreezed == false){
                //one move less
                movesLeft -= 1;
                jLabelMovesLeft.setText(Integer.toString(movesLeft));

                //Next player
                if(movesLeft == 0){                    
                    do{
                        currentPlayer = (currentPlayer%numberOfPlayers)+1;
                    }while(jumpPlayers[currentPlayer] == 1);
                                        
                    jLabelCurrentPlayer.setText(Integer.toString(currentPlayer));
                    jLabelPinPlayer.setIcon(getJLabelPin(currentPlayer).getIcon());
                    jLabelMovesLeft.setText("Roll the dices!");
                    jButtonRollDices.setEnabled(true);

                    //bring jlabel to front
                    jLabelTable.setComponentZOrder(getJLabelPin(currentPlayer), 0);
                    jLabelTable.repaint();
                    
                    //hide old player cards
                    for(int i=1; i<=9; i++)
                        getJLabelMyCard(i).setText("");
                    
                    //check if next player is insides room
                    Tab tab = new Tab();
                    if(tab.CheckInsideRoom(lastX[currentPlayer], lastY[currentPlayer])){
                        gameFreezed = true;
                        jLabelMovesLeft.setText("Game freezed!");
                    }
              }
        }
        else{
            
        }
    }
      
    private void jButtonRollDicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRollDicesActionPerformed
        // get random numbers
        jLabelDice1.setText(Integer.toString((int)Math.floor(Math.random()*6 + 1)));
        jLabelDice2.setText(Integer.toString((int)Math.floor(Math.random()*6 + 1)));
        
        diceValue = Integer.parseInt(jLabelDice1.getText()) + Integer.parseInt(jLabelDice2.getText());
        movesLeft = diceValue;
        jLabelMovesLeft.setText(Integer.toString(movesLeft));
        jLabelDiceMoves.setText(Integer.toString(diceValue));
        
        //disable button until next player
        jButtonRollDices.setEnabled(false);
        
        //show my cards
        setMyCards();
    }//GEN-LAST:event_jButtonRollDicesActionPerformed

    private void jButtonPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPassActionPerformed
        //pass code
        pass();
    }//GEN-LAST:event_jButtonPassActionPerformed

    public void pass(){
        movesLeft = 1; //end his turn
        gameFreezed = false;
        jButtonPass.setEnabled(false);
        jButtonGuess.setEnabled(false);
        nextPlay();
    }
    
    private void jButtonGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuessActionPerformed
        //guess code
        //check if somebody can deny his guess
        for(int i=1; i<=numberOfPlayers; i++){
            if(player[i].hasCard(new Card(1, jComboBoxGuessSuspect.getSelectedIndex() + 1))){
                JOptionPane.showMessageDialog(null, 
                        "Player " + Integer.toString(i) + " has " + jComboBoxGuessSuspect.getSelectedItem().toString());
                pass();
                System.out.println("1");
                return;
            }
            if(player[i].hasCard(new Card(2, jComboBoxGuessWeapon.getSelectedIndex() + 1))){
                JOptionPane.showMessageDialog(null, 
                        "Player " + Integer.toString(i) + " has " + jComboBoxGuessWeapon.getSelectedItem().toString());
                pass();
                System.out.println("2");
                return;
            }
            if(player[i].hasCard(new Card(3, jComboBoxGuessRoom.getSelectedIndex() + 1))){
                JOptionPane.showMessageDialog(null, 
                        "Player " + Integer.toString(i) + " has " + jComboBoxGuessRoom.getSelectedItem().toString());
                pass();
                System.out.println("3");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "You won!");
    }//GEN-LAST:event_jButtonGuessActionPerformed

    private void jButtonStartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartGameActionPerformed
        //disable button
        jButtonStartGame.setEnabled(false);
        
        //Set pin positions
        int x[] = {0, 192, 312, 492, 352, 172,  12};
        int y[] = {0,  12,  12, 392, 492, 492, 152};

        // Add players - Add pins to table
        numberOfPlayers = Integer.parseInt(jComboBoxNumberOfPlayers.getSelectedItem().toString());
        for(int i=1; i<= numberOfPlayers; i++){
            jLabelTable.add(getJLabelPin(i));
            lastX[i] = x[i];
            lastY[i] = y[i];
            getJLabelPin(i).setLocation(lastX[i], lastY[i]);
        }

        //Set player
        jLabelCurrentPlayer.setText(Integer.toString(currentPlayer));
        jLabelPinPlayer.setIcon(getJLabelPin(currentPlayer).getIcon());
        movesLeft = 0;
        jLabelMovesLeft.setText("Roll the Dices!");

        //create envelope and players
        envelope = new Envelope();
        player = new Player[numberOfPlayers + 1];
        for(int i=0; i<player.length; i++)
        player[i] = new Player();

        //shuffle deck of cards
        Card[] cards = (new Card(0, 0)).getAllCards();
        Card[] shuffCards = new Card[cards.length];
        int[] shuff = shuffledArray(cards.length);
        for(int i=1; i<cards.length; i++)
        shuffCards[i] = cards[shuff[i]];

        boolean gotEnvSuspect = false;
        boolean gotEnvWeapon = false;
        boolean gotEnvRoom = false;
        int j=1;
        for(int i=1; i<shuffCards.length; i++){
            if(gotEnvSuspect == false && shuffCards[i].getType() == 1){
                envelope.addCard(shuffCards[i]);
                gotEnvSuspect = true;
            }
            else if(gotEnvWeapon == false && shuffCards[i].getType() == 2){
                envelope.addCard(shuffCards[i]);
                gotEnvWeapon = true;
            }
            else if(gotEnvRoom == false && shuffCards[i].getType() == 3){
                envelope.addCard(shuffCards[i]);
                gotEnvRoom = true;
            }
            else{
                player[j].addCard(shuffCards[i]);
                if(j == numberOfPlayers)
                    j=1;
                else
                    j += 1;
            }
        }

        //Add images or labels
        jLabelEnvSuspect.setText(envelope.getSuspect().toStringIndex());
        jLabelEnvWeapon.setText(envelope.getWeapon().toStringIndex());
        jLabelEnvRoom.setText(envelope.getRoom().toStringIndex());

        for(int i=1; i<=numberOfPlayers; i++){
            getJLabelSuspect(i).setText("");
            for(int k=1; k<player[i].getSuspects().length; k++){
                try{
                    getJLabelSuspect(i).setText(
                        getJLabelSuspect(i).getText() + " " +
                        player[i].getSuspects()[k].toStringIndex());
                }
                catch(NullPointerException e) {
                    //e.printStackTrace();
                }
            }
            getJLabelWeapon(i).setText("");
            for(int k=1; k<player[i].getWeapons().length; k++){
                try{
                    getJLabelWeapon(i).setText(
                        getJLabelWeapon(i).getText() + " " +
                        player[i].getWeapons()[k].toStringIndex());
                }
                catch(NullPointerException e) {
                    //e.printStackTrace();
                }
            }
            getJLabelRoom(i).setText("");
            for(int k=1; k<player[i].getRooms().length; k++){
                try{
                    getJLabelRoom(i).setText(
                        getJLabelRoom(i).getText() + " " +
                        player[i].getRooms()[k].toStringIndex());
                }
                catch(NullPointerException e) {
                    //e.printStackTrace();
                }
            }
        }

        //set my cards
        setMyCards();
    }//GEN-LAST:event_jButtonStartGameActionPerformed

    private void jButtonDoItActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoItActionPerformed
        // check comboboxes and envelope
        String message = "";
        
        if(envelope.getRoom().toString().equals(jComboBoxGuessRoom.getSelectedItem().toString()) &&
           envelope.getWeapon().toString().equals(jComboBoxGuessWeapon.getSelectedItem().toString()) &&
           envelope.getSuspect().toString().equals(jComboBoxGuessSuspect.getSelectedItem().toString())){
            message = "Player " + Integer.toString(currentPlayer) + " won!";
            JOptionPane.showMessageDialog(null, message);
        }
        else{
            message = "Player " + Integer.toString(currentPlayer) + " lost!";
            JOptionPane.showMessageDialog(null, message);
            jumpPlayers[currentPlayer] = 1; //start jumping him on count    
            checkEndOfGame();
            movesLeft = 1;
            nextPlay();
        }        
    }//GEN-LAST:event_jButtonDoItActionPerformed

    public void checkEndOfGame(){
        //check if theres only one player
        int countZeros = 0;
        for(int i=1; i<=numberOfPlayers; i++)
           if(jumpPlayers[i] == 0)
               countZeros += 1;
        
        if(countZeros == 1)//end of game
            JOptionPane.showMessageDialog(null, "GAME OVER");
    }
    
    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED){
            jComboBoxGuessSuspect.setEnabled(true);
            jComboBoxGuessWeapon.setEnabled(true);
            jComboBoxGuessRoom.setEnabled(true);

            jButtonGuess.setEnabled(true);
            jButtonPass.setEnabled(true);
            
            jButtonDoIt.setEnabled(true);
        }
        
        if (evt.getStateChange() == ItemEvent.DESELECTED){
            //jComboBoxGuessSuspect.setEnabled(false);
            //jComboBoxGuessWeapon.setEnabled(false);
            jComboBoxGuessRoom.setEnabled(false);

            jButtonGuess.setEnabled(false);
            jButtonPass.setEnabled(false);
            
            jButtonDoIt.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jLabelPin5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin5MouseDragged
        jLabelPinMouseDragged(5, evt);
    }//GEN-LAST:event_jLabelPin5MouseDragged

    private void jLabelPin5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin5MouseReleased
        jLabelPinMouseReleased(5, evt);
    }//GEN-LAST:event_jLabelPin5MouseReleased

    private void jLabelPin4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin4MouseDragged
        jLabelPinMouseDragged(4, evt);
    }//GEN-LAST:event_jLabelPin4MouseDragged

    private void jLabelPin4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin4MouseReleased
        jLabelPinMouseReleased(4, evt);
    }//GEN-LAST:event_jLabelPin4MouseReleased

    private void jLabelPin3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin3MouseDragged
        jLabelPinMouseDragged(3, evt);
    }//GEN-LAST:event_jLabelPin3MouseDragged

    private void jLabelPin3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin3MouseReleased
        jLabelPinMouseReleased(3, evt);
    }//GEN-LAST:event_jLabelPin3MouseReleased

    private void jLabelPin2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin2MouseDragged
        jLabelPinMouseDragged(2, evt);
    }//GEN-LAST:event_jLabelPin2MouseDragged

    private void jLabelPin2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin2MouseReleased
        jLabelPinMouseReleased(2, evt);
    }//GEN-LAST:event_jLabelPin2MouseReleased

    private void jLabelPin1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin1MouseDragged
        jLabelPinMouseDragged(1, evt);
    }//GEN-LAST:event_jLabelPin1MouseDragged

    private void jLabelPin1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin1MouseReleased
        jLabelPinMouseReleased(1, evt);
    }//GEN-LAST:event_jLabelPin1MouseReleased

    private void jLabelPin6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin6MouseDragged
        jLabelPinMouseDragged(6, evt);
    }//GEN-LAST:event_jLabelPin6MouseDragged

    private void jLabelPin6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPin6MouseReleased
        jLabelPinMouseReleased(6, evt);
    }//GEN-LAST:event_jLabelPin6MouseReleased

    private void jLabelPinPlayerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPinPlayerMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPinPlayerMouseReleased

    private void jLabelPinPlayerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPinPlayerMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelPinPlayerMouseDragged
    
    public void setMyCards(){
        int k=1;
            for(int i=1; i< player[currentPlayer].getSuspects().length; i++){
                try{
                    getJLabelMyCard(k).setText(
                            player[currentPlayer].getSuspects()[i].toString());
                    //getJLabelMyCard(k).setIcon(
                    //        player[currentPlayer].getSuspects()[i].getImage());
                    k++;
                }
                catch(NullPointerException e) {
                    //e.printStackTrace();
                }
            }
            for(int i=1; i< player[currentPlayer].getWeapons().length; i++){
                try{
                    getJLabelMyCard(k).setText(
                            player[currentPlayer].getWeapons()[i].toString());
                    //getJLabelMyCard(k).setIcon(
                    //        player[currentPlayer].getWeapons()[i].getImage());
                    k++;
                }
                catch(NullPointerException e) {
                    //e.printStackTrace();
                }
            }
            for(int i=1; i< player[currentPlayer].getRooms().length; i++){
                try{
                    getJLabelMyCard(k).setText(
                            player[currentPlayer].getRooms()[i].toString());
                    //getJLabelMyCard(k).setIcon(
                    //        player[currentPlayer].getRooms()[i].getImage());
                    k++;
                }
                catch(NullPointerException e) {
                    //e.printStackTrace();
                }
            }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Gui myGui = new Gui();
                myGui.getContentPane().setBackground(Color.WHITE);
                
                myGui.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDoIt;
    private javax.swing.JButton jButtonGuess;
    private javax.swing.JButton jButtonPass;
    private javax.swing.JButton jButtonRollDices;
    private javax.swing.JButton jButtonStartGame;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBoxGuessRoom;
    private javax.swing.JComboBox jComboBoxGuessSuspect;
    private javax.swing.JComboBox jComboBoxGuessWeapon;
    private javax.swing.JComboBox jComboBoxNumberOfPlayers;
    private javax.swing.JLabel jLabeelMousePressedY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCurrentPlayer;
    private javax.swing.JLabel jLabelDice1;
    private javax.swing.JLabel jLabelDice2;
    private javax.swing.JLabel jLabelDiceMoves;
    private javax.swing.JLabel jLabelEnvRoom;
    private javax.swing.JLabel jLabelEnvSuspect;
    private javax.swing.JLabel jLabelEnvWeapon;
    private javax.swing.JLabel jLabelMousePressedX;
    private javax.swing.JLabel jLabelMouseReleasedX;
    private javax.swing.JLabel jLabelMouseReleasedY;
    private javax.swing.JLabel jLabelMovesLeft;
    private javax.swing.JLabel jLabelMyCard1;
    private javax.swing.JLabel jLabelMyCard2;
    private javax.swing.JLabel jLabelMyCard3;
    private javax.swing.JLabel jLabelMyCard4;
    private javax.swing.JLabel jLabelMyCard5;
    private javax.swing.JLabel jLabelMyCard6;
    private javax.swing.JLabel jLabelMyCard7;
    private javax.swing.JLabel jLabelMyCard8;
    private javax.swing.JLabel jLabelMyCard9;
    private javax.swing.JLabel jLabelP1Room;
    private javax.swing.JLabel jLabelP1Suspect;
    private javax.swing.JLabel jLabelP1Weapon;
    private javax.swing.JLabel jLabelP2Room;
    private javax.swing.JLabel jLabelP2Suspect;
    private javax.swing.JLabel jLabelP2Weapon;
    private javax.swing.JLabel jLabelP3Room;
    private javax.swing.JLabel jLabelP3Suspect;
    private javax.swing.JLabel jLabelP3Weapon;
    private javax.swing.JLabel jLabelP4Room;
    private javax.swing.JLabel jLabelP4Suspect;
    private javax.swing.JLabel jLabelP4Weapon;
    private javax.swing.JLabel jLabelP5Room;
    private javax.swing.JLabel jLabelP5Suspect;
    private javax.swing.JLabel jLabelP5Weapon;
    private javax.swing.JLabel jLabelP6Room;
    private javax.swing.JLabel jLabelP6Suspect;
    private javax.swing.JLabel jLabelP6Weapon;
    private javax.swing.JLabel jLabelPin1;
    private javax.swing.JLabel jLabelPin2;
    private javax.swing.JLabel jLabelPin3;
    private javax.swing.JLabel jLabelPin4;
    private javax.swing.JLabel jLabelPin5;
    private javax.swing.JLabel jLabelPin6;
    private javax.swing.JLabel jLabelPinPlayer;
    private javax.swing.JLabel jLabelSquareB;
    private javax.swing.JLabel jLabelSquareG;
    private javax.swing.JLabel jLabelSquareR;
    private javax.swing.JLabel jLabelSquareX;
    private javax.swing.JLabel jLabelSquareY;
    private javax.swing.JLabel jLabelTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelGuess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextAreaLog;
    // End of variables declaration//GEN-END:variables
}
