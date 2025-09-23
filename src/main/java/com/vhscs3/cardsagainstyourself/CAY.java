/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.vhscs3.cardsagainstyourself;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author sophi
 */
public class CAY extends javax.swing.JFrame {

    /**
     * Creates new form CAY
     */
    
    //MAKE THE THING SEARCH
    
    private JComponent[]                playGroup;      // Array of enabled/disabled form elements on the play tab
    private JComponent[]                playCardGroup;      // Array of enabled/disabled form elements on the play tab
    private JComponent[]                judgeGroup;     // Array of enabled/disabled form elements on the judge tab
    private JComponent[]                editGroup;      // Array of enabled/disabled form elements on the edit tab
    private int                         numPlayers;     //number of players
    private Stack<String>               answers = new Stack<String>();        //discarded answer cards
    private ArrayList<String>           player1 = new ArrayList<String>();        //player1 cards
    private ArrayList<String>           player2 = new ArrayList<String>();        //player2 cards
    private ArrayList<String>           player3= new ArrayList<String>();       //player3 cards
    private ArrayList<String>           player4= new ArrayList<String>();       //player4 cards
    private ArrayList<String>           player5= new ArrayList<String>();      //player5 cards
    private ArrayList<String>           player6= new ArrayList<String>();        //player6 cards
    private ArrayList<String>           pplayer1= new ArrayList<String>();       //player1 PROMPT cards
    private ArrayList<String>           pplayer2= new ArrayList<String>();       //player2 PROMPT cards
    private ArrayList<String>           pplayer3= new ArrayList<String>();       //player3 PROMPT cards
    private ArrayList<String>           pplayer4= new ArrayList<String>();       //player4 PROMPT cards
    private ArrayList<String>           pplayer5= new ArrayList<String>();       //player5 PROMPT cards
    private ArrayList<String>           pplayer6= new ArrayList<String>();      //player6 PROMPT cards
    private CardStack                   cards = new CardStack();          //card things
    private String                      prompt;         //current prompt
    private int                         currentPlayer;                              //current player
    private String                      player1card = "";                                //player 1 card
    private String                      player2card = "";                                //player 2 card
    private String                      player3card = "";                                //player 3 card
    private String                      player4card = "";                                //player 4 card
    private String                      player5card = "";                                //player 5 card
    private String                      player6card = "";                                //player 6 card
    private ArrayList<Boolean>          finalized = new ArrayList<Boolean>();                                  //stores false for unfinalized, index = player
    private String[]                    finalCards;                             //submitted cards
    private ArrayList<String>           searchedPrompt = new ArrayList<String>();                           //list of prompts that have the searched keyword
    private ArrayList<String>           searchedAnswer = new ArrayList<String>();                           //list of answers that have the searched keyword
    private int                         searchedPromptInd = 0;
    private int                         searchedAnswerInd = 0;
    private boolean                     poa = true; //true = prompt, false = answer
    private String                      editing = ""; //line being edited
    
    public CAY() {
        initComponents();
        
        //sets beginning of what the game would look like
        buildPlayGroup();
        buildCardGroup();
        buildEditGroup();
        buildJudgeGroup();
        setGroupVisible(false, playGroup);
        cards.buildPrompts();
        cards.buildAnswers();
        cards.shuffle();
        edit_textField_keyword.setEnabled(false);
        edit_button_cancel.setEnabled(false);
        edit_button_edit.setEnabled(false);
        edit_button_save.setEnabled(false);
        edit_button_delete.setEnabled(false);
        edit_button_next.setEnabled(false);
        edit_button_back.setEnabled(false);
        
        //play_textArea_prompt.setLineWrap(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedPane = new javax.swing.JTabbedPane();
        play_panel = new javax.swing.JPanel();
        play_button_start = new javax.swing.JButton();
        play_button_end = new javax.swing.JButton();
        play_scrollpane = new javax.swing.JScrollPane();
        play_textArea_prompt = new javax.swing.JTextArea();
        play_button_card1 = new javax.swing.JButton();
        play_button_card2 = new javax.swing.JButton();
        play_button_card3 = new javax.swing.JButton();
        play_button_card4 = new javax.swing.JButton();
        play_button_card5 = new javax.swing.JButton();
        play_button_card6 = new javax.swing.JButton();
        play_button_card7 = new javax.swing.JButton();
        play_button_player1 = new javax.swing.JButton();
        play_button_player2 = new javax.swing.JButton();
        play_button_player3 = new javax.swing.JButton();
        play_button_player4 = new javax.swing.JButton();
        play_button_player5 = new javax.swing.JButton();
        play_button_player6 = new javax.swing.JButton();
        play_button_finalize = new javax.swing.JButton();
        play_label_players = new javax.swing.JLabel();
        play_textField_players = new javax.swing.JTextField();
        play_button_players = new javax.swing.JButton();
        play_scrollpane1 = new javax.swing.JScrollPane();
        play_textArea_card1 = new javax.swing.JTextArea();
        play_scrollpane2 = new javax.swing.JScrollPane();
        play_textArea_card2 = new javax.swing.JTextArea();
        play_scrollpane3 = new javax.swing.JScrollPane();
        play_textArea_card3 = new javax.swing.JTextArea();
        play_scrollpane4 = new javax.swing.JScrollPane();
        play_textArea_card4 = new javax.swing.JTextArea();
        play_scrollpane5 = new javax.swing.JScrollPane();
        play_textArea_card5 = new javax.swing.JTextArea();
        play_scrollpane6 = new javax.swing.JScrollPane();
        play_textArea_card6 = new javax.swing.JTextArea();
        play_scrollpane7 = new javax.swing.JScrollPane();
        play_textArea_card7 = new javax.swing.JTextArea();
        judge_panel = new javax.swing.JPanel();
        judge_textField_prompt = new javax.swing.JTextField();
        judge_comboBox_answers = new javax.swing.JComboBox<>();
        judge_button_submit = new javax.swing.JButton();
        judge_label_winningCard = new javax.swing.JLabel();
        judge_label_WINNER = new javax.swing.JLabel();
        judge_label_winner = new javax.swing.JLabel();
        judge_label_player1ct = new javax.swing.JLabel();
        judge_label_player2ct = new javax.swing.JLabel();
        judge_label_player3ct = new javax.swing.JLabel();
        judge_label_player4ct = new javax.swing.JLabel();
        judge_label_player5ct = new javax.swing.JLabel();
        judge_label_player6ct = new javax.swing.JLabel();
        judge_label_p1ct = new javax.swing.JLabel();
        judge_label_p2ct = new javax.swing.JLabel();
        judge_label_p3ct = new javax.swing.JLabel();
        judge_label_p4ct = new javax.swing.JLabel();
        judge_label_p5ct = new javax.swing.JLabel();
        judge_label_p6ct = new javax.swing.JLabel();
        judge_scrollpane1 = new javax.swing.JScrollPane();
        judge_textArea_answer1 = new javax.swing.JTextArea();
        judge_scrollpane2 = new javax.swing.JScrollPane();
        judge_textArea_answer2 = new javax.swing.JTextArea();
        judge_scrollpane3 = new javax.swing.JScrollPane();
        judge_textArea_answer3 = new javax.swing.JTextArea();
        judge_scrollpane4 = new javax.swing.JScrollPane();
        judge_textArea_answer5 = new javax.swing.JTextArea();
        judge_scrollpane5 = new javax.swing.JScrollPane();
        judge_textArea_answer4 = new javax.swing.JTextArea();
        judge_scrollpane6 = new javax.swing.JScrollPane();
        judge_textArea_answer6 = new javax.swing.JTextArea();
        edit_panel = new javax.swing.JPanel();
        edit_label_search = new javax.swing.JLabel();
        edit_textField_search = new javax.swing.JTextField();
        edit_button_prompt = new javax.swing.JButton();
        edit_button_answer = new javax.swing.JButton();
        edit_textField_new = new javax.swing.JTextField();
        edit_button_edit = new javax.swing.JButton();
        edit_button_back = new javax.swing.JButton();
        edit_button_next = new javax.swing.JButton();
        edit_button_showAllPrompts = new javax.swing.JButton();
        edit_button_save = new javax.swing.JButton();
        edit_button_showAllAnswers = new javax.swing.JButton();
        edit_button_delete = new javax.swing.JButton();
        edit_textField_keyword = new javax.swing.JTextField();
        edit_button_addPrompt = new javax.swing.JButton();
        edit_button_addAnswer = new javax.swing.JButton();
        edit_scrollpane1 = new javax.swing.JScrollPane();
        edit_textArea_all = new javax.swing.JTextArea();
        edit_button_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        play_button_start.setText("START NEW GAME");
        play_button_start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_startActionPerformed(evt);
            }
        });

        play_button_end.setText("END GAME");
        play_button_end.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_endActionPerformed(evt);
            }
        });

        play_textArea_prompt.setColumns(20);
        play_textArea_prompt.setRows(5);
        play_textArea_prompt.setText("Prompt text here");
        play_scrollpane.setViewportView(play_textArea_prompt);

        play_button_card1.setText("Card 1");
        play_button_card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_card1ActionPerformed(evt);
            }
        });

        play_button_card2.setText("Card 2");
        play_button_card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_card2ActionPerformed(evt);
            }
        });

        play_button_card3.setText("Card 3");
        play_button_card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_card3ActionPerformed(evt);
            }
        });

        play_button_card4.setText("Card 4");
        play_button_card4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_card4ActionPerformed(evt);
            }
        });

        play_button_card5.setText("Card 5");
        play_button_card5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_card5ActionPerformed(evt);
            }
        });

        play_button_card6.setText("Card 6");
        play_button_card6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_card6ActionPerformed(evt);
            }
        });

        play_button_card7.setText("Card 7");
        play_button_card7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_card7ActionPerformed(evt);
            }
        });

        play_button_player1.setText("Player 1");
        play_button_player1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_player1ActionPerformed(evt);
            }
        });

        play_button_player2.setText("Player 2");
        play_button_player2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_player2ActionPerformed(evt);
            }
        });

        play_button_player3.setText("Player 3");
        play_button_player3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_player3ActionPerformed(evt);
            }
        });

        play_button_player4.setText("Player 4");
        play_button_player4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_player4ActionPerformed(evt);
            }
        });

        play_button_player5.setText("Player 5");
        play_button_player5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_player5ActionPerformed(evt);
            }
        });

        play_button_player6.setText("Player 6");
        play_button_player6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_player6ActionPerformed(evt);
            }
        });

        play_button_finalize.setText("FINALIZE ANSWER");
        play_button_finalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_finalizeActionPerformed(evt);
            }
        });

        play_label_players.setText("No. of Players (up to 6):");

        play_textField_players.setText("Player number");

        play_button_players.setText("SUBMIT");
        play_button_players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                play_button_playersActionPerformed(evt);
            }
        });

        play_textArea_card1.setColumns(20);
        play_textArea_card1.setLineWrap(true);
        play_textArea_card1.setRows(5);
        play_textArea_card1.setWrapStyleWord(true);
        play_scrollpane1.setViewportView(play_textArea_card1);

        play_textArea_card2.setColumns(20);
        play_textArea_card2.setLineWrap(true);
        play_textArea_card2.setRows(5);
        play_textArea_card2.setWrapStyleWord(true);
        play_scrollpane2.setViewportView(play_textArea_card2);

        play_textArea_card3.setColumns(20);
        play_textArea_card3.setLineWrap(true);
        play_textArea_card3.setRows(5);
        play_textArea_card3.setWrapStyleWord(true);
        play_scrollpane3.setViewportView(play_textArea_card3);

        play_textArea_card4.setColumns(20);
        play_textArea_card4.setLineWrap(true);
        play_textArea_card4.setRows(5);
        play_textArea_card4.setWrapStyleWord(true);
        play_scrollpane4.setViewportView(play_textArea_card4);

        play_textArea_card5.setColumns(20);
        play_textArea_card5.setLineWrap(true);
        play_textArea_card5.setRows(5);
        play_textArea_card5.setWrapStyleWord(true);
        play_scrollpane5.setViewportView(play_textArea_card5);

        play_textArea_card6.setColumns(20);
        play_textArea_card6.setLineWrap(true);
        play_textArea_card6.setRows(5);
        play_textArea_card6.setWrapStyleWord(true);
        play_scrollpane6.setViewportView(play_textArea_card6);

        play_textArea_card7.setColumns(20);
        play_textArea_card7.setLineWrap(true);
        play_textArea_card7.setRows(5);
        play_textArea_card7.setWrapStyleWord(true);
        play_scrollpane7.setViewportView(play_textArea_card7);

        javax.swing.GroupLayout play_panelLayout = new javax.swing.GroupLayout(play_panel);
        play_panel.setLayout(play_panelLayout);
        play_panelLayout.setHorizontalGroup(
            play_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(play_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(play_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(play_panelLayout.createSequentialGroup()
                        .addGroup(play_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(play_button_finalize)
                            .addGroup(play_panelLayout.createSequentialGroup()
                                .addComponent(play_button_start)
                                .addGap(18, 18, 18)
                                .addComponent(play_button_end)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(play_label_players)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(play_textField_players, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(play_button_players)
                                .addGap(30, 30, 30)
                                .addComponent(play_button_player1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(play_button_player2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(play_button_player3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(play_button_player4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(play_button_player5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(play_button_player6))
                            .addGroup(play_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(play_scrollpane, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, play_panelLayout.createSequentialGroup()
                                    .addComponent(play_scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(play_scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(play_scrollpane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(play_scrollpane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(play_scrollpane5, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(play_scrollpane6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(play_scrollpane7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(48, Short.MAX_VALUE))
                    .addGroup(play_panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(play_button_card1)
                        .addGap(96, 96, 96)
                        .addComponent(play_button_card2)
                        .addGap(99, 99, 99)
                        .addComponent(play_button_card3)
                        .addGap(85, 85, 85)
                        .addComponent(play_button_card4)
                        .addGap(98, 98, 98)
                        .addComponent(play_button_card5)
                        .addGap(97, 97, 97)
                        .addComponent(play_button_card6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(play_button_card7)
                        .addGap(81, 81, 81))))
        );
        play_panelLayout.setVerticalGroup(
            play_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(play_panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(play_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(play_button_start)
                    .addComponent(play_button_end)
                    .addComponent(play_button_player1)
                    .addComponent(play_button_player2)
                    .addComponent(play_button_player3)
                    .addComponent(play_button_player4)
                    .addComponent(play_button_player5)
                    .addComponent(play_button_player6)
                    .addComponent(play_label_players)
                    .addComponent(play_textField_players, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(play_button_players))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(play_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(play_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(play_button_card1)
                    .addComponent(play_button_card2)
                    .addComponent(play_button_card3)
                    .addComponent(play_button_card4)
                    .addComponent(play_button_card5)
                    .addComponent(play_button_card6)
                    .addComponent(play_button_card7))
                .addGap(18, 18, 18)
                .addGroup(play_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(play_scrollpane1)
                    .addComponent(play_scrollpane7, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(play_scrollpane2)
                    .addComponent(play_scrollpane3)
                    .addComponent(play_scrollpane4)
                    .addComponent(play_scrollpane5)
                    .addComponent(play_scrollpane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(play_button_finalize)
                .addGap(72, 72, 72))
        );

        tabbedPane.addTab("Play", play_panel);

        judge_comboBox_answers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F" }));

        judge_button_submit.setText("SUBMIT");
        judge_button_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judge_button_submitActionPerformed(evt);
            }
        });

        judge_label_winningCard.setText("Winning Card: ");

        judge_label_WINNER.setText("WINNER:");

        judge_label_player1ct.setText("Player 1 count:");

        judge_label_player2ct.setText("Player 2 count:");

        judge_label_player3ct.setText("Player 3 count:");

        judge_label_player4ct.setText("Player 4 count:");

        judge_label_player5ct.setText("Player 5 count:");

        judge_label_player6ct.setText("Player 6 count:");

        judge_textArea_answer1.setColumns(20);
        judge_textArea_answer1.setLineWrap(true);
        judge_textArea_answer1.setRows(5);
        judge_textArea_answer1.setWrapStyleWord(true);
        judge_scrollpane1.setViewportView(judge_textArea_answer1);

        judge_textArea_answer2.setColumns(20);
        judge_textArea_answer2.setLineWrap(true);
        judge_textArea_answer2.setRows(5);
        judge_textArea_answer2.setWrapStyleWord(true);
        judge_scrollpane2.setViewportView(judge_textArea_answer2);

        judge_textArea_answer3.setColumns(20);
        judge_textArea_answer3.setLineWrap(true);
        judge_textArea_answer3.setRows(5);
        judge_textArea_answer3.setWrapStyleWord(true);
        judge_scrollpane3.setViewportView(judge_textArea_answer3);

        judge_textArea_answer5.setColumns(20);
        judge_textArea_answer5.setLineWrap(true);
        judge_textArea_answer5.setRows(5);
        judge_textArea_answer5.setWrapStyleWord(true);
        judge_scrollpane4.setViewportView(judge_textArea_answer5);

        judge_textArea_answer4.setColumns(20);
        judge_textArea_answer4.setLineWrap(true);
        judge_textArea_answer4.setRows(5);
        judge_textArea_answer4.setWrapStyleWord(true);
        judge_scrollpane5.setViewportView(judge_textArea_answer4);

        judge_textArea_answer6.setColumns(20);
        judge_textArea_answer6.setLineWrap(true);
        judge_textArea_answer6.setRows(5);
        judge_textArea_answer6.setWrapStyleWord(true);
        judge_scrollpane6.setViewportView(judge_textArea_answer6);

        javax.swing.GroupLayout judge_panelLayout = new javax.swing.GroupLayout(judge_panel);
        judge_panel.setLayout(judge_panelLayout);
        judge_panelLayout.setHorizontalGroup(
            judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judge_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(judge_panelLayout.createSequentialGroup()
                        .addComponent(judge_scrollpane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(judge_scrollpane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(judge_scrollpane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(judge_panelLayout.createSequentialGroup()
                        .addComponent(judge_scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(judge_scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(judge_scrollpane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(judge_textField_prompt))
                .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(judge_panelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(judge_label_player1ct)
                            .addComponent(judge_label_WINNER)
                            .addComponent(judge_label_player2ct)
                            .addComponent(judge_label_player3ct)
                            .addComponent(judge_label_player4ct)
                            .addComponent(judge_label_player5ct)
                            .addComponent(judge_label_player6ct))
                        .addGap(18, 18, 18)
                        .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judge_label_winner)
                            .addComponent(judge_label_p1ct)
                            .addComponent(judge_label_p2ct)
                            .addComponent(judge_label_p3ct)
                            .addComponent(judge_label_p4ct)
                            .addComponent(judge_label_p5ct)
                            .addComponent(judge_label_p6ct)))
                    .addGroup(judge_panelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(judge_label_winningCard)
                        .addGap(18, 18, 18)
                        .addComponent(judge_comboBox_answers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(judge_button_submit)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        judge_panelLayout.setVerticalGroup(
            judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(judge_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judge_label_WINNER)
                    .addComponent(judge_label_winner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(judge_label_player1ct)
                    .addComponent(judge_label_p1ct))
                .addGap(11, 11, 11)
                .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judge_label_player2ct)
                    .addComponent(judge_label_p2ct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judge_label_player3ct)
                    .addComponent(judge_label_p3ct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judge_label_player4ct)
                    .addComponent(judge_label_p4ct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judge_label_player5ct)
                    .addComponent(judge_label_p5ct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judge_label_p6ct)
                    .addComponent(judge_label_player6ct))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(judge_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(judge_textField_prompt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(judge_panelLayout.createSequentialGroup()
                        .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judge_scrollpane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(judge_scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(judge_scrollpane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judge_scrollpane4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(judge_scrollpane5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(judge_scrollpane6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, judge_panelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(judge_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(judge_label_winningCard)
                            .addComponent(judge_comboBox_answers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(judge_button_submit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabbedPane.addTab("Judge", judge_panel);

        edit_label_search.setText("Search:");

        edit_button_prompt.setText("PROMPT");
        edit_button_prompt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_promptActionPerformed(evt);
            }
        });

        edit_button_answer.setText("ANSWER");
        edit_button_answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_answerActionPerformed(evt);
            }
        });

        edit_button_edit.setText("EDIT");
        edit_button_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_editActionPerformed(evt);
            }
        });

        edit_button_back.setText("BACK");
        edit_button_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_backActionPerformed(evt);
            }
        });

        edit_button_next.setText("NEXT");
        edit_button_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_nextActionPerformed(evt);
            }
        });

        edit_button_showAllPrompts.setText("SHOW ALL PROMPTS");
        edit_button_showAllPrompts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_showAllPromptsActionPerformed(evt);
            }
        });

        edit_button_save.setText("SAVE");
        edit_button_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_saveActionPerformed(evt);
            }
        });

        edit_button_showAllAnswers.setText("SHOW ALL ANSWERS");
        edit_button_showAllAnswers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_showAllAnswersActionPerformed(evt);
            }
        });

        edit_button_delete.setText("DELETE");
        edit_button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_deleteActionPerformed(evt);
            }
        });

        edit_button_addPrompt.setText("ADD PROMPT");
        edit_button_addPrompt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_addPromptActionPerformed(evt);
            }
        });

        edit_button_addAnswer.setText("ADD ANSWER");
        edit_button_addAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_addAnswerActionPerformed(evt);
            }
        });

        edit_textArea_all.setColumns(20);
        edit_textArea_all.setRows(5);
        edit_scrollpane1.setViewportView(edit_textArea_all);

        edit_button_cancel.setText("CANCEL");
        edit_button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_button_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout edit_panelLayout = new javax.swing.GroupLayout(edit_panel);
        edit_panel.setLayout(edit_panelLayout);
        edit_panelLayout.setHorizontalGroup(
            edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_panelLayout.createSequentialGroup()
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(edit_panelLayout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(edit_label_search))
                        .addComponent(edit_button_addAnswer, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(edit_button_delete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addComponent(edit_textField_new, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(edit_button_addPrompt))
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addComponent(edit_button_showAllPrompts)
                        .addGap(18, 18, 18)
                        .addComponent(edit_button_showAllAnswers))
                    .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(edit_panelLayout.createSequentialGroup()
                            .addComponent(edit_button_prompt)
                            .addGap(24, 24, 24)
                            .addComponent(edit_button_answer))
                        .addComponent(edit_textField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edit_scrollpane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(edit_panelLayout.createSequentialGroup()
                        .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edit_textField_keyword, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(edit_panelLayout.createSequentialGroup()
                                .addComponent(edit_button_back)
                                .addGap(632, 632, 632)
                                .addComponent(edit_button_next)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(edit_panelLayout.createSequentialGroup()
                                .addComponent(edit_button_edit)
                                .addGap(18, 18, 18)
                                .addComponent(edit_button_save))
                            .addComponent(edit_button_cancel))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        edit_panelLayout.setVerticalGroup(
            edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edit_label_search)
                    .addComponent(edit_textField_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_button_prompt)
                    .addComponent(edit_button_answer))
                .addGap(32, 32, 32)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_button_delete)
                    .addComponent(edit_button_edit)
                    .addComponent(edit_button_save)
                    .addComponent(edit_textField_keyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_button_back)
                    .addComponent(edit_button_next)
                    .addComponent(edit_button_cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_button_addAnswer)
                    .addComponent(edit_button_addPrompt)
                    .addComponent(edit_textField_new, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(edit_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_button_showAllPrompts)
                    .addComponent(edit_button_showAllAnswers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_scrollpane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabbedPane.addTab("Edit", edit_panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1196, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void play_button_endActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_endActionPerformed
        setGroupVisible(false,playGroup);
        play_button_start.setEnabled(true);
        setGroupEnabled(true, playCardGroup);
        
        boolean tie = false;
        //determining winner
        int max = 0;
        int maxind = 0;
        int freq = 0;
        int[] scores = {pplayer1.size(), pplayer2.size(), pplayer3.size(), pplayer4.size(), pplayer5.size(), pplayer6.size()};
        for (int i = 0; i < scores.length; i++){
            if ((max > 0) && (scores[i] == max))
                freq++;
            if (scores[i] > max){
                max = scores[i];
                maxind = i;
            }
        }
        //setting text in judge panel to winner
        if (freq > 0)
            tie = true;
        maxind++;
        judge_label_winner.setText("Player " + maxind);
        if (tie)
            judge_label_winner.setText("TIE");
        
        //resetting game
        
        player1card = "";
        player2card = "";
        player3card = "";
        player4card = "";
        player5card = "";
        player6card = "";
        player1.clear();
        player2.clear();
        player3.clear();
        player4.clear();
        player5.clear();
        player6.clear();
        pplayer1.clear();
        pplayer2.clear();
        pplayer3.clear();
        pplayer4.clear();
        pplayer5.clear();
        pplayer6.clear();
        answers.clear();
        cards.buildAnswers();
        cards.buildPrompts();
        
        //setting all b=player buttons to be enabled so they can be clicked
        play_button_finalize.setEnabled(true);
        play_button_player2.setEnabled(true);
        play_button_player3.setEnabled(true);
        play_button_player4.setEnabled(true);
        play_button_player5.setEnabled(true);
        play_button_player6.setEnabled(true);
        
        judge_textField_prompt.setText("");
        judge_textArea_answer1.setText("");
        judge_textArea_answer2.setText("");
        judge_textArea_answer3.setText("");
        judge_textArea_answer4.setText("");
        judge_textArea_answer5.setText("");
        judge_textArea_answer6.setText("");
        
        edit_textArea_all.setText("");
        finalized.clear();
        for (int i = 0; i < numPlayers; i++){
            finalCards[i] = "";
        }
        setGroupVisible(true, editGroup);
        
    }//GEN-LAST:event_play_button_endActionPerformed

    private void play_button_startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_startActionPerformed
        //setting game up to be on the first player's hand when game is started and clearing all fields that could've been previously populated by a previous game
        play_button_players.setVisible(true);
        play_label_players.setVisible(true);
        play_textField_players.setVisible(true);
        play_button_start.setEnabled(false);
        play_button_end.setVisible(true);
        
        play_button_players.setEnabled(true);
        play_label_players.setEnabled(true);
        play_textField_players.setEnabled(true);
        play_textField_players.setText("");
        
        setGroupVisible(false, editGroup);
        edit_button_cancel.setVisible(false);
        //resetting judge panel to be blank
        judge_label_p1ct.setText("");
        judge_label_p2ct.setText("");
        judge_label_p3ct.setText("");
        judge_label_p4ct.setText("");
        judge_label_p5ct.setText("");
        judge_label_p6ct.setText("");
        judge_label_winner.setText("");
    }//GEN-LAST:event_play_button_startActionPerformed

    private void play_button_playersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_playersActionPerformed
        String text = play_textField_players.getText();
        int num = 0;
        //got the number of players and setting the game up based on that, number of player buttons activated, number of combo boxes, number of hands to deal
        try {
            num = Integer.parseInt(text);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(CAY.this, "Please enter a positive whole number");
            return;
        }
        
        if (num < 2){
            JOptionPane.showMessageDialog(CAY.this, "Please enter at least 2 players");
            return;
        }
        
        if (num >= 2 && num<=6)
            numPlayers = num;
        
        if (num > 6){
            JOptionPane.showMessageDialog(CAY.this, "Please enter at 6 players or less");
            return;
        }
        
        buildCardSelection();
        for (int i = 0; i < num; i++){
            finalized.add(false);
        }
        
        //determining which elements must be enabled based on the number of players entered
        
        setGroupVisible(true, playGroup);
        play_label_players.setEnabled(false);
        play_textField_players.setEnabled(false);
        play_button_players.setEnabled(false);
        //adding cards to each player's hands
        buildPlayerHands(player1);
        buildPlayerHands(player2);
        buildPlayerHands(player3);
        buildPlayerHands(player4);
        buildPlayerHands(player5);
        buildPlayerHands(player6);
        
        setGroupVisible(true, judgeGroup);
        
        if (numPlayers < 6){
            play_button_player6.setVisible(false);
            judge_textArea_answer6.setVisible(false);
        }
        if (numPlayers < 5){
            play_button_player5.setVisible(false);
            judge_textArea_answer5.setVisible(false);
        }
        if (numPlayers < 4){
            play_button_player4.setVisible(false);
            judge_textArea_answer4.setVisible(false);
        }
        if (numPlayers < 3){
            play_button_player3.setVisible(false);
            judge_textArea_answer3.setVisible(false);
        }
        cards.shuffle();
        finalCards = new String[numPlayers];
        
        //setting up for first round
        
        play_button_player1.setEnabled(false);
        play_textArea_card1.setText(player1.get(0));
        play_textArea_card2.setText(player1.get(1));
        play_textArea_card3.setText(player1.get(2));
        play_textArea_card4.setText(player1.get(3));
        play_textArea_card5.setText(player1.get(4));
        play_textArea_card6.setText(player1.get(5));
        play_textArea_card7.setText(player1.get(6));
        prompt = cards.popPrompt();
        play_textArea_prompt.setText(prompt);
        
        play_textArea_card1.setEnabled(false);
        play_textArea_card2.setEnabled(false);
        play_textArea_card3.setEnabled(false);
        play_textArea_card4.setEnabled(false);
        play_textArea_card5.setEnabled(false);
        play_textArea_card6.setEnabled(false);
        play_textArea_card7.setEnabled(false);
        currentPlayer = 1;
    }//GEN-LAST:event_play_button_playersActionPerformed

    private void play_button_player2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_player2ActionPerformed
        //all actions for each player will be reset the same way, but with their respective variables
        play_button_player2.setEnabled(false);
        play_button_player1.setEnabled(true);
        play_button_player3.setEnabled(true);
        play_button_player4.setEnabled(true);
        play_button_player5.setEnabled(true);
        play_button_player6.setEnabled(true);
        
        //setting card answer text
        play_textArea_card1.setText(player2.get(0));
        play_textArea_card2.setText(player2.get(1));
        play_textArea_card3.setText(player2.get(2));
        play_textArea_card4.setText(player2.get(3));
        play_textArea_card5.setText(player2.get(4));
        play_textArea_card6.setText(player2.get(5));
        play_textArea_card7.setText(player2.get(6));
        
        currentPlayer = 2; //using current player as index to check for finalization
        setGroupEnabled(true, playCardGroup);

        for (int i = 0; i < player2.size(); i++){
            if (player2.get(i).equals(player2card))
                playCardGroup[i].setEnabled(false);
        }
        
        if (finalized.get(1)) //stored boolean of if enabled or not in a variable so finalization can be checked
            play_button_finalize.setEnabled(false);
        else
            play_button_finalize.setEnabled(true);
    }//GEN-LAST:event_play_button_player2ActionPerformed

    private void play_button_player3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_player3ActionPerformed
        //same as player 2
        play_button_player3.setEnabled(false);
        play_button_player1.setEnabled(true);
        play_button_player2.setEnabled(true);
        play_button_player4.setEnabled(true);
        play_button_player5.setEnabled(true);
        play_button_player6.setEnabled(true);
        
        play_textArea_card1.setText(player3.get(0));
        play_textArea_card2.setText(player3.get(1));
        play_textArea_card3.setText(player3.get(2));
        play_textArea_card4.setText(player3.get(3));
        play_textArea_card5.setText(player3.get(4));
        play_textArea_card6.setText(player3.get(5));
        play_textArea_card7.setText(player3.get(6));
        
        currentPlayer = 3;
        setGroupEnabled(true, playCardGroup);
        
        for (int i = 0; i < player3.size(); i++){
            if (player3.get(i).equals(player3card))
                playCardGroup[i].setEnabled(false);
        }
        
        if (finalized.get(2))
            play_button_finalize.setEnabled(false);
        else
            play_button_finalize.setEnabled(true);
    }//GEN-LAST:event_play_button_player3ActionPerformed

    private void play_button_player4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_player4ActionPerformed
        //same as player 2
        play_button_player4.setEnabled(false);
        play_button_player1.setEnabled(true);
        play_button_player3.setEnabled(true);
        play_button_player2.setEnabled(true);
        play_button_player5.setEnabled(true);
        play_button_player6.setEnabled(true);
        
        play_textArea_card1.setText(player4.get(0));
        play_textArea_card2.setText(player4.get(1));
        play_textArea_card3.setText(player4.get(2));
        play_textArea_card4.setText(player4.get(3));
        play_textArea_card5.setText(player4.get(4));
        play_textArea_card6.setText(player4.get(5));
        play_textArea_card7.setText(player4.get(6));
        
        currentPlayer = 4;
        setGroupEnabled(true, playCardGroup);
        
        for (int i = 0; i < player4.size(); i++){
            if (player4.get(i).equals(player4card))
                playCardGroup[i].setEnabled(false);
        }
        
        if (finalized.get(3))
            play_button_finalize.setEnabled(false);
        else
            play_button_finalize.setEnabled(true);
    }//GEN-LAST:event_play_button_player4ActionPerformed

    private void play_button_player5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_player5ActionPerformed
        //same as player 2
        play_button_player5.setEnabled(false);
        play_button_player1.setEnabled(true);
        play_button_player3.setEnabled(true);
        play_button_player4.setEnabled(true);
        play_button_player2.setEnabled(true);
        play_button_player6.setEnabled(true);
        
        play_textArea_card1.setText(player5.get(0));
        play_textArea_card2.setText(player5.get(1));
        play_textArea_card3.setText(player5.get(2));
        play_textArea_card4.setText(player5.get(3));
        play_textArea_card5.setText(player5.get(4));
        play_textArea_card6.setText(player5.get(5));
        play_textArea_card7.setText(player5.get(6));
        
        currentPlayer = 5;
        setGroupEnabled(true, playCardGroup);
        
        for (int i = 0; i < player5.size(); i++){
            if (player5.get(i).equals(player5card))
                playCardGroup[i].setEnabled(false);
        }
        
        if (finalized.get(4))
            play_button_finalize.setEnabled(false);
        else
            play_button_finalize.setEnabled(true);
    }//GEN-LAST:event_play_button_player5ActionPerformed

    private void play_button_player6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_player6ActionPerformed
        //same as player 2
        play_button_player6.setEnabled(false);
        play_button_player1.setEnabled(true);
        play_button_player3.setEnabled(true);
        play_button_player4.setEnabled(true);
        play_button_player5.setEnabled(true);
        play_button_player2.setEnabled(true);
        
        play_textArea_card1.setText(player6.get(0));
        play_textArea_card2.setText(player6.get(1));
        play_textArea_card3.setText(player6.get(2));
        play_textArea_card4.setText(player6.get(3));
        play_textArea_card5.setText(player6.get(4));
        play_textArea_card6.setText(player6.get(5));
        play_textArea_card7.setText(player6.get(6));
        
        currentPlayer = 6;
        setGroupEnabled(true, playCardGroup);
        
        for (int i = 0; i < player6.size(); i++){
            if (player6.get(i).equals(player6card))
                playCardGroup[i].setEnabled(false);
        }
        
        if (finalized.get(5))
            play_button_finalize.setEnabled(false);
        else
            play_button_finalize.setEnabled(true);
    }//GEN-LAST:event_play_button_player6ActionPerformed

    private void play_button_player1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_player1ActionPerformed
        //same as player 2, added this one last because it was set up when the game started, but when player 1 is clicked on again it needs to show the same things that the other players have
        //ex. card button unenabled when there's a card chosen
        play_button_player1.setEnabled(false);
        play_button_player2.setEnabled(true);
        play_button_player3.setEnabled(true);
        play_button_player4.setEnabled(true);
        play_button_player5.setEnabled(true);
        play_button_player6.setEnabled(true);
        
        play_textArea_card1.setText(player1.get(0));
        play_textArea_card2.setText(player1.get(1));
        play_textArea_card3.setText(player1.get(2));
        play_textArea_card4.setText(player1.get(3));
        play_textArea_card5.setText(player1.get(4));
        play_textArea_card6.setText(player1.get(5));
        play_textArea_card7.setText(player1.get(6));
        
        currentPlayer = 1;
        setGroupEnabled(true, playCardGroup);
        
        for (int i = 0; i < player1.size(); i++){
            if (player1.get(i).equals(player1card))
                playCardGroup[i].setEnabled(false);
        }
        
        if (finalized.get(0))
            play_button_finalize.setEnabled(false);
        else
            play_button_finalize.setEnabled(true);
    }//GEN-LAST:event_play_button_player1ActionPerformed

    private void play_button_card1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_card1ActionPerformed
        //checking which player selected the card and assigning that card to the variable of that player's current card
        if (!finalized.get(currentPlayer - 1)){
            if (currentPlayer == 1)
                player1card = player1.get(0);
            if (currentPlayer == 2)
                player2card = player2.get(0);
            if (currentPlayer == 3)
                player3card = player3.get(0);
            if (currentPlayer == 4)
                player4card = player4.get(0);
            if (currentPlayer == 5)
                player5card = player5.get(0);
            if (currentPlayer == 6)
                player6card = player6.get(0);
            
            //setting all buttons as enabled besides the selected card
            setGroupEnabled(true, playCardGroup);
            play_button_card1.setEnabled(false);
        }
    }//GEN-LAST:event_play_button_card1ActionPerformed

    private void play_button_card2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_card2ActionPerformed
        //checking which player selected the card and assigning that card to the variable of that player's current card
        if (!finalized.get(currentPlayer - 1)){
            if (currentPlayer == 1)
                player1card = player1.get(1);
            if (currentPlayer == 2)
                player2card = player2.get(1);
            if (currentPlayer == 3)
                player3card = player3.get(1);
            if (currentPlayer == 4)
                player4card = player4.get(1);
            if (currentPlayer == 5)
                player5card = player5.get(1);
            if (currentPlayer == 6)
                player6card = player6.get(1);

            //setting all buttons as enabled besides the selected card
            setGroupEnabled(true, playCardGroup);
            play_button_card2.setEnabled(false);
        }
    }//GEN-LAST:event_play_button_card2ActionPerformed

    private void play_button_card3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_card3ActionPerformed
        //checking which player selected the card and assigning that card to the variable of that player's current card
        if (!finalized.get(currentPlayer - 1)){
            if (currentPlayer == 1)
                player1card = player1.get(2);
            if (currentPlayer == 2)
                player2card = player2.get(2);
            if (currentPlayer == 3)
                player3card = player3.get(2);
            if (currentPlayer == 4)
                player4card = player4.get(2);
            if (currentPlayer == 5)
                player5card = player5.get(2);
            if (currentPlayer == 6)
                player6card = player6.get(2);

            //setting all buttons as enabled besides the selected card
            setGroupEnabled(true, playCardGroup);
            play_button_card3.setEnabled(false);
        }
    }//GEN-LAST:event_play_button_card3ActionPerformed

    private void play_button_card4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_card4ActionPerformed
        //checking which player selected the card and assigning that card to the variable of that player's current card
        if (!finalized.get(currentPlayer - 1)){
            if (currentPlayer == 1)
                player1card = player1.get(3);
            if (currentPlayer == 2)
                player2card = player2.get(3);
            if (currentPlayer == 3)
                player3card = player3.get(3);
            if (currentPlayer == 4)
                player4card = player4.get(3);
            if (currentPlayer == 5)
                player5card = player5.get(3);
            if (currentPlayer == 6)
                player6card = player6.get(3);

            //setting all buttons as enabled besides the selected card
            setGroupEnabled(true, playCardGroup);
            play_button_card4.setEnabled(false);
        }
    }//GEN-LAST:event_play_button_card4ActionPerformed

    private void play_button_card5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_card5ActionPerformed
        //checking which player selected the card and assigning that card to the variable of that player's current card
        if (!finalized.get(currentPlayer - 1)){
            if (currentPlayer == 1)
                player1card = player1.get(4);
            if (currentPlayer == 2)
                player2card = player2.get(4);
            if (currentPlayer == 3)
                player3card = player3.get(4);
            if (currentPlayer == 4)
                player4card = player4.get(4);
            if (currentPlayer == 5)
                player5card = player5.get(4);
            if (currentPlayer == 6)
                player6card = player6.get(4);

            //setting all buttons as enabled besides the selected card
            setGroupEnabled(true, playCardGroup);
            play_button_card5.setEnabled(false);
        }
    }//GEN-LAST:event_play_button_card5ActionPerformed

    private void play_button_card6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_card6ActionPerformed
        //checking which player selected the card and assigning that card to the variable of that player's current card
        if (!finalized.get(currentPlayer - 1)){
            if (currentPlayer == 1)
                player1card = player1.get(5);
            if (currentPlayer == 2)
                player2card = player2.get(5);
            if (currentPlayer == 3)
                player3card = player3.get(5);
            if (currentPlayer == 4)
                player4card = player4.get(5);
            if (currentPlayer == 5)
                player5card = player5.get(5);
            if (currentPlayer == 6)
                player6card = player6.get(5);

            //setting all buttons as enabled besides the selected card
            setGroupEnabled(true, playCardGroup);
            play_button_card6.setEnabled(false);
        }
    }//GEN-LAST:event_play_button_card6ActionPerformed

    private void play_button_card7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_card7ActionPerformed
        //checking which player selected the card and assigning that card to the variable of that player's current card
        if (!finalized.get(currentPlayer - 1)){
            if (currentPlayer == 1)
                player1card = player1.get(6);
            if (currentPlayer == 2)
                player2card = player2.get(6);
            if (currentPlayer == 3)
                player3card = player3.get(6);
            if (currentPlayer == 4)
                player4card = player4.get(6);
            if (currentPlayer == 5)
                player5card = player5.get(6);
            if (currentPlayer == 6)
                player6card = player6.get(6);

            //setting all buttons as enabled besides the selected card
            setGroupEnabled(true, playCardGroup);
            play_button_card7.setEnabled(false);
        }
    }//GEN-LAST:event_play_button_card7ActionPerformed

    private void play_button_finalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_play_button_finalizeActionPerformed
        //keeping track of which players have submitted their cards
        if (currentPlayer == 1 && !player1card.equals("")){
            finalized.set(0, true);
            finalCards[0] = player1card;
            play_button_finalize.setEnabled(false);
        }
        if (currentPlayer == 2 && !player2card.equals("")){
            finalized.set(1, true);
            finalCards[1] = player2card;
            play_button_finalize.setEnabled(false);
        }
        if (currentPlayer == 3 && !player3card.equals("")){
            finalized.set(2, true);
            finalCards[2] = player3card;
            play_button_finalize.setEnabled(false);
        }
        if (currentPlayer == 4 && !player4card.equals("")){
            finalized.set(3, true);
            finalCards[3] = player4card;
            play_button_finalize.setEnabled(false);
        }
        if (currentPlayer == 5 && !player5card.equals("")){
            finalized.set(4, true);
            finalCards[4] = player5card;
            play_button_finalize.setEnabled(false);
        }
        if (currentPlayer == 6 && !player6card.equals("")){
            finalized.set(5, true);
            finalCards[5] = player6card;
            play_button_finalize.setEnabled(false);
        }
        
        //checking if all cards are finalized
        boolean pop = true;
        for (boolean b : finalized){
            if (!b)
                pop = false;
        }
        
        //populating fields in judge panel for judging
        if (pop){
            judge_button_submit.setEnabled(true);
            shuffleArray(finalCards);
            judge_textField_prompt.setText(prompt);
            judge_textArea_answer1.setText("A) " + finalCards[0]);
            judge_textArea_answer2.setText("B) " + finalCards[1]);
            if (numPlayers > 2)
                judge_textArea_answer3.setText("C) " + finalCards[2]);
            if (numPlayers > 3)
                judge_textArea_answer4.setText("D) " + finalCards[3]);
            if (numPlayers > 4)
                judge_textArea_answer5.setText("E) " + finalCards[4]);
            if (numPlayers > 5)
                judge_textArea_answer6.setText("F) " + finalCards[5]);
        }
    }//GEN-LAST:event_play_button_finalizeActionPerformed

    private void judge_button_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judge_button_submitActionPerformed
        judge_button_submit.setEnabled(false);
        
        //determining winning card
        String win = "";
        if (judge_comboBox_answers.getSelectedItem().equals("A"))
            win = judge_textArea_answer1.getText().substring(3);
        if (judge_comboBox_answers.getSelectedItem().equals("B"))
            win = judge_textArea_answer2.getText().substring(3);
        if (judge_comboBox_answers.getSelectedItem().equals("C"))
            win = judge_textArea_answer3.getText().substring(3);
        if (judge_comboBox_answers.getSelectedItem().equals("D"))
            win = judge_textArea_answer4.getText().substring(3);
        if (judge_comboBox_answers.getSelectedItem().equals("E"))
            win = judge_textArea_answer5.getText().substring(3);
        if (judge_comboBox_answers.getSelectedItem().equals("F"))
            win = judge_textArea_answer6.getText().substring(3);
        
        //adding to scores
        if (win.equals(player1card))
            pplayer1.add(prompt);
        if (win.equals(player2card))
            pplayer2.add(prompt);
        if (win.equals(player3card))
            pplayer3.add(prompt);
        if (win.equals(player4card))
            pplayer4.add(prompt);
        if (win.equals(player5card))
            pplayer5.add(prompt);
        if (win.equals(player6card))
            pplayer6.add(prompt);
        //updating card win count
        judge_label_p1ct.setText("" + pplayer1.size());
        judge_label_p2ct.setText("" + pplayer2.size());
        judge_label_p3ct.setText("" + pplayer3.size());
        judge_label_p4ct.setText("" + pplayer4.size());
        judge_label_p5ct.setText("" + pplayer5.size());
        judge_label_p6ct.setText("" + pplayer6.size());
        
        //discarding cards and setting current cards to "" and setting text areas to ""
        for (int i = 0; i < player1.size(); i++){
            if (player1card.equals(player1.get(i)))
                player1.remove(i);
        }
        for (int i = 0; i < player2.size(); i++){
            if (player2card.equals(player2.get(i)))
                player2.remove(i);
        }
        for (int i = 0; i < player3.size(); i++){
            if (player3card.equals(player3.get(i)))
                player3.remove(i);
        }
        for (int i = 0; i < player4.size(); i++){
            if (player4card.equals(player4.get(i)))
                player4.remove(i);
        }
        for (int i = 0; i < player5.size(); i++){
            if (player5card.equals(player5.get(i)))
                player5.remove(i);
        }
        for (int i = 0; i < player6.size(); i++){
            if (player6card.equals(player6.get(i)))
                player6.remove(i);
        }
        
        //resetting finalized card checks
        finalized.clear();
        finalized.add(false);
        answers.add(player1card);
        player1card = "";
        finalized.add(false);
        answers.add(player2card);
        player2card = "";
        if (numPlayers > 2){
            finalized.add(false);
            answers.add(player3card);
            player3card = "";
        }
        if(numPlayers >3){
            finalized.add(false);
            answers.add(player4card);
            player4card = "";
        }
        if(numPlayers >4){
            finalized.add(false);
            answers.add(player5card);
            player5card = "";
        }
        if(numPlayers > 5){
            finalized.add(false);
            answers.add(player6card);
            player6card = "";
        }
        //resetting final cards
        for (int i = 0; i < numPlayers; i++){
            finalCards[i] = "";
        }
        //resetting textfields
        judge_textField_prompt.setText("");
        judge_textArea_answer1.setText("");
        judge_textArea_answer2.setText("");
        judge_textArea_answer3.setText("");
        judge_textArea_answer4.setText("");
        judge_textArea_answer5.setText("");
        judge_textArea_answer6.setText("");
        //setting card buttons as enabled
        play_button_card1.setEnabled(true);
        play_button_card2.setEnabled(true);
        play_button_card3.setEnabled(true);
        play_button_card4.setEnabled(true);
        play_button_card5.setEnabled(true);
        play_button_card6.setEnabled(true);
        play_button_card7.setEnabled(true);
        //adding cards to each hand
        buildPlayerHands(player1);
        buildPlayerHands(player2);
        buildPlayerHands(player3);
        buildPlayerHands(player4);
        buildPlayerHands(player5);
        buildPlayerHands(player6);
        //show new player1 cards and new prompt
        prompt = cards.popPrompt();
        play_button_player1.setEnabled(false);
        play_textArea_card1.setText(player1.get(0));
        play_textArea_card2.setText(player1.get(1));
        play_textArea_card3.setText(player1.get(2));
        play_textArea_card4.setText(player1.get(3));
        play_textArea_card5.setText(player1.get(4));
        play_textArea_card6.setText(player1.get(5));
        play_textArea_card7.setText(player1.get(6));
        prompt = cards.popPrompt();
        play_textArea_prompt.setText(prompt);
        
        //enabling buttons
        currentPlayer = 1;
        play_button_finalize.setEnabled(true);
        play_button_player2.setEnabled(true);
        play_button_player3.setEnabled(true);
        play_button_player4.setEnabled(true);
        play_button_player5.setEnabled(true);
        play_button_player6.setEnabled(true);
    }//GEN-LAST:event_judge_button_submitActionPerformed

    private void edit_button_showAllPromptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_showAllPromptsActionPerformed
        //displaying all the prompt cards stored in the file
        cards.buildPrompts();
        ArrayList<String> text = new ArrayList<String>();
        for (int i = 0; i < cards.getPromptnum(); i++){
            text.add(cards.popPrompt());
        }
        text.clear();
        cards.buildPrompts();
        for (int i = 0; i < cards.getPromptnum(); i++){
            text.add(cards.popPrompt());
        }
        text.add(cards.popPrompt());
        
        //sorting all cards in alphabetical without case sensitivity
        Collections.sort(text, String.CASE_INSENSITIVE_ORDER);
        String display = "";
        for (int i = 0; i < text.size() - 2; i++){
            display += text.get(i);
            display += "\n";
        }
        display += text.get(text.size() - 1);
        
        //changing gui to display all the prompts
        edit_textArea_all.setText(display);
        edit_button_showAllPrompts.setEnabled(false);
        edit_button_showAllAnswers.setEnabled(true);
    }//GEN-LAST:event_edit_button_showAllPromptsActionPerformed

    private void edit_button_showAllAnswersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_showAllAnswersActionPerformed
        //showing all answer cards stored in the file
        cards.buildAnswers();
        ArrayList<String> text = new ArrayList<String>();
        for (int i = 0; i < cards.getAnswernum(); i++){
            text.add(cards.popAnswer());
        }
        text.clear();
        cards.buildAnswers();
        for (int i = 0; i < cards.getAnswernum(); i++){
            text.add(cards.popAnswer());
        }
        text.add(cards.popAnswer());
        
        //sorting all cards in alphabetical without case sensitivity
        Collections.sort(text, String.CASE_INSENSITIVE_ORDER);
        String display = "";
        for (int i = 0; i < text.size() - 2; i++){
            display += text.get(i);
            display += "\n";
        }
        
        //changing gui to display all the prompts
        display += text.get(text.size() - 1);
        edit_textArea_all.setText(display);
        edit_button_showAllPrompts.setEnabled(true);
        edit_button_showAllAnswers.setEnabled(false);
    }//GEN-LAST:event_edit_button_showAllAnswersActionPerformed

    private void edit_button_addAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_addAnswerActionPerformed
        //adding an answer to the answer data file by appending it to the end of the file through a new line so that the scanner in CardStack when building the card decks is able to read it in
        String data = edit_textField_new.getText();
        try{            
            FileWriter filer = new FileWriter("data" + File.separator + "answer.txt", true);
            BufferedWriter buffer = new BufferedWriter(filer);
            PrintWriter print = new PrintWriter(buffer);
            if (!data.equals("")){
                print.println(data);
                print.flush();
                edit_textField_new.setText("");
                print.close();
                buffer.close();
                filer.close();
                JOptionPane.showMessageDialog(CAY.this, "Answer added");
                return;
            }
            else{
                JOptionPane.showMessageDialog(CAY.this, "Please enter an answer to add");
            }
        } catch (IOException e){
            System.out.println("ERROR: Answer txt file not found");
        }
    }//GEN-LAST:event_edit_button_addAnswerActionPerformed

    private void edit_button_addPromptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_addPromptActionPerformed
        //adding a prompt to the prompt data file by appending it to the end of the file through a new line so that the scanner in CardStack when building the card decks is able to read it in
        String data = edit_textField_new.getText();
        try{            
            FileWriter filer = new FileWriter("data" + File.separator + "prompt.txt", true);
            BufferedWriter buffer = new BufferedWriter(filer);
            PrintWriter print = new PrintWriter(buffer);
            if (!data.equals("")){
                print.println(data);
                print.flush();
                edit_textField_new.setText("");
                print.close();
                buffer.close();
                filer.close();
                JOptionPane.showMessageDialog(CAY.this, "Prompt added");
                return;
            }
            else{
                JOptionPane.showMessageDialog(CAY.this, "Please enter an prompt to add");
            }
        } catch (IOException e){
            System.out.println("ERROR: Prompt txt file not found");
        }
    }//GEN-LAST:event_edit_button_addPromptActionPerformed

    private void edit_button_promptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_promptActionPerformed
        //traversing through the prompt card pile and finding if there are any matches to the keyword mentioned in the search bar, compiles into an arraylist and uses it to
        //set the text of the search return text field
        cards.buildPrompts();
        searchedPrompt.clear();
        edit_textField_keyword.setText("");
        edit_button_next.setEnabled(true);
        boolean found = false;
        String searchPrompt = edit_textField_search.getText();
        edit_textField_search.setText("");
        for (int i = 0; i < cards.getPromptnum(); i++){
            String text = cards.popPrompt();
            if (text.toLowerCase().contains(searchPrompt.toLowerCase())){
                searchedPrompt.add(text);
                found = true;
            }
        }
        
        cards.buildPrompts();
        searchedPrompt.clear();
        edit_textField_keyword.setText("");
        edit_button_next.setEnabled(true);
        found = false;
        edit_textField_search.setText("");
        for (int i = 0; i < cards.getPromptnum(); i++){
            String text = cards.popPrompt();
            if (text.toLowerCase().contains(searchPrompt.toLowerCase())){
                searchedPrompt.add(text);
                found = true;
            }
        }
        if (!found){
            JOptionPane.showMessageDialog(CAY.this, "No results");
            return;
        }
        searchedPromptInd = 0;
        edit_textField_keyword.setText(searchedPrompt.get(searchedPromptInd));
        edit_button_back.setEnabled(false);
        edit_button_edit.setEnabled(true);
        edit_button_delete.setEnabled(true);
        edit_button_cancel.setEnabled(true);
        poa = false;
        if (searchedAnswer.size() == 1)
            edit_button_next.setEnabled(false);
        edit_button_edit.setEnabled(true);
    }//GEN-LAST:event_edit_button_promptActionPerformed

    private void edit_button_answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_answerActionPerformed
        //traversing through the answer card pile and finding if there are any matches to the keyword mentioned in the search bar, compiles into an arraylist and uses it to
        //set the text of the search return text field
        cards.buildAnswers();
        searchedAnswer.clear();
        edit_textField_keyword.setText("");
        edit_button_next.setEnabled(true);
        boolean found = false;
        String searchAnswer = edit_textField_search.getText();
        edit_textField_search.setText("");
        for (int i = 0; i < cards.getAnswernum(); i++){
            String text = cards.popAnswer();
            if (text.toLowerCase().contains(searchAnswer.toLowerCase())){
                searchedAnswer.add(text);
                found = true;
            }
        }
        
        cards.buildAnswers();
        searchedAnswer.clear();
        edit_textField_keyword.setText("");
        edit_button_next.setEnabled(true);
        found = false;
        edit_textField_search.setText("");
        for (int i = 0; i < cards.getAnswernum(); i++){
            String text = cards.popAnswer();
            if (text.toLowerCase().contains(searchAnswer.toLowerCase())){
                searchedAnswer.add(text);
                found = true;
            }
        }
        if (!found){
            JOptionPane.showMessageDialog(CAY.this, "No results");
            return;
        }
        searchedAnswerInd = 0;
        edit_textField_keyword.setText(searchedAnswer.get(searchedAnswerInd));
        edit_button_back.setEnabled(false);
        edit_button_edit.setEnabled(true);
        edit_button_delete.setEnabled(true);
        edit_button_cancel.setEnabled(true);
        poa = true;
        if (searchedPrompt.size() == 1)
            edit_button_next.setEnabled(false);
        edit_button_edit.setEnabled(true);
    }//GEN-LAST:event_edit_button_answerActionPerformed

    private void edit_button_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_nextActionPerformed
        //sets text to the next card that matches the keyword, disables if the card displayed is the last one in the matched arraylist
        edit_button_back.setEnabled(true);
        if (poa){
            if (searchedPromptInd < searchedPrompt.size()){
                searchedPromptInd++;
                edit_textField_keyword.setText(searchedPrompt.get(searchedPromptInd));
            }
            if (searchedPromptInd == (searchedPrompt.size() - 1))
                edit_button_next.setEnabled(false);
        }
        if(!poa){
            if (searchedAnswerInd < searchedAnswer.size()){
                searchedAnswerInd++;
                edit_textField_keyword.setText(searchedAnswer.get(searchedAnswerInd));
            }
            if(searchedAnswerInd == (searchedAnswer.size() - 1))
                edit_button_next.setEnabled(false);
        }
    }//GEN-LAST:event_edit_button_nextActionPerformed

    private void edit_button_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_backActionPerformed
        //sets text to the previous card that matches the keyword, disables if the card displayed is the first one in the matched arraylist
        //automatically disabled when the search is made
        edit_button_next.setEnabled(true);
        if (poa){
            if (searchedPromptInd > 0){
                searchedPromptInd--;
                edit_textField_keyword.setText(searchedPrompt.get(searchedPromptInd));
            }
            if (searchedPromptInd == 0)
                edit_button_back.setEnabled(false);
        }
        if(!poa){
            if (searchedAnswerInd > 0){
                searchedAnswerInd--;
                edit_textField_keyword.setText(searchedAnswer.get(searchedAnswerInd));
            }
            if (searchedAnswerInd == 0)
                edit_button_back.setEnabled(false);
        }
    }//GEN-LAST:event_edit_button_backActionPerformed

    private void edit_button_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_editActionPerformed
        //enables buttons used to edit/delete/save/cancel functions and enables editing of the searched keyword text field in the edit tab
        edit_textField_keyword.setEnabled(true);
        editing = edit_textField_keyword.getText();
        //edit_button_cancel.setEnabled(true);
        edit_button_save.setEnabled(true);
    }//GEN-LAST:event_edit_button_editActionPerformed

    private void edit_button_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_saveActionPerformed
        //using the add and delete methods to delete the previous line that was edited and appending the new line to the end of the respective file, keeping track
        //of which data file the card is being edited from
        try {
            File file = new File("data" + File.separator + "prompt.txt");
            
            if (!poa)
                file = new File("data" + File.separator + "answer.txt");
            
            //Construct the new file that will later be renamed to the original filename.
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line = null;
            String content = "";
            
            //Read from the original file and write to the new
            //unless content matches data to be removed.
            while ((line = br.readLine()) != null) {
                
                if (!line.trim().equals(editing)) {
                    content += line + "\n";
                }
            }
            
            br.close();
            file.delete();
            FileWriter fw = new FileWriter(file, false);
            fw.write(content);
            fw.close();
            
            edit_textField_new.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(CAY.this, "Deletion unsuccessful");
                return;
        }
        String data = edit_textField_keyword.getText();
        
        //adding the line to be inputted into the correct file (checked for previously)
        try{
            FileWriter filer = new FileWriter("data" + File.separator + "prompt.txt", true);
            if (!poa)
                filer = new FileWriter("data" + File.separator + "answer.txt", true);
            BufferedWriter buffer = new BufferedWriter(filer);
            PrintWriter print = new PrintWriter(buffer);
            if (!data.equals("")){
                print.println(data);
                print.flush();
                
                //resetting the gui so buttons cant be clicked when there's no card there
                edit_textField_new.setText("");
                edit_textField_keyword.setEnabled(false);
                editing = "";
                edit_textField_keyword.setText("");
                edit_button_edit.setEnabled(false);
                edit_button_save.setEnabled(false);
                edit_button_cancel.setEnabled(false);
                edit_button_delete.setEnabled(false);
                
                print.close();
                buffer.close();
                filer.close();
                
                
                JOptionPane.showMessageDialog(CAY.this, "Save successful");
                return;
            }
        } catch (IOException e){
            System.out.println("ERROR: Save unsuccessful");
        }
    }//GEN-LAST:event_edit_button_saveActionPerformed

    private void edit_button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_deleteActionPerformed

        try {
            File file = new File("data" + File.separator + "prompt.txt");
            if (!poa)
                file = new File("data" + File.separator + "answer.txt");
            
            String lineToRemove = edit_textField_keyword.getText();
            
            //File tempFile = new File("data" + File.separator + "temp.txt");
            
            //Construct the new file that will later be renamed to the original filename.
            BufferedReader br = new BufferedReader(new FileReader(file));
            //PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            
            String line = null;
            String content = "";
            //Read from the original file and write to the new
            //unless content matches data to be removed.
            while ((line = br.readLine()) != null) {
                
                if (!line.trim().equals(lineToRemove)) {
                    content += line + "\n";
                    //pw.println(line);
                    //pw.flush();
                }
            }
            
            //pw.close();
            br.close();
            
            file.delete();
            FileWriter fw = new FileWriter(file, false);
            fw.write(content);
            fw.close();
            
            edit_textField_keyword.setText("");
            edit_textField_keyword.setEnabled(false);
            edit_button_delete.setEnabled(false);
            edit_button_save.setEnabled(false);
            edit_button_edit.setEnabled(false);
            edit_button_cancel.setEnabled(false);
            JOptionPane.showMessageDialog(CAY.this, "Deletion successful");
                return;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(CAY.this, "Deletion unsuccessful");
                return;
        }
    }//GEN-LAST:event_edit_button_deleteActionPerformed

    private void edit_button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_button_cancelActionPerformed
        //resets the searched keyword text field and unenables functions related to the search without the search having been made
        edit_textField_keyword.setEnabled(false);
        edit_textField_keyword.setText("");
        edit_button_cancel.setEnabled(false);
        edit_button_edit.setEnabled(false);
        edit_button_delete.setEnabled(false);
        edit_button_back.setEnabled(false);
        edit_button_next.setEnabled(false);
        edit_button_save.setEnabled(false);
    }//GEN-LAST:event_edit_button_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAY().setVisible(true);
            }
        });
    }
    private void setGroupEnabled(boolean state, JComponent[] group) {
    //setting components of a tab to be enabled or not enabled
        for (JComponent component : group) {
            component.setEnabled(state);
        }
        
    }
    
    private void setGroupVisible(boolean state, JComponent[] group){
    //setting components of a tab to be visible or invisible
        for (JComponent component : group) {
            component.setVisible(state);
        }
    }
    
    private void buildPlayGroup(){
        //building a group of components from the play tab
        playGroup = new JComponent[26];
        playGroup[0] = play_button_end;
        playGroup[1] = play_label_players;
        playGroup[2] = play_textField_players;
        playGroup[3] = play_button_player1;
        playGroup[4] = play_button_player2;
        playGroup[5] = play_button_player3;
        playGroup[6] = play_button_player4;
        playGroup[7] = play_button_player5;
        playGroup[8] = play_button_player6;
        playGroup[9] = play_textArea_prompt;
        playGroup[10] = play_button_card1;
        playGroup[11] = play_button_card2;
        playGroup[12] = play_button_card3;
        playGroup[13] = play_button_card4;
        playGroup[14] = play_button_card5;
        playGroup[15] = play_button_card6;
        playGroup[16] = play_button_card7;
        playGroup[17] = play_textArea_card1;
        playGroup[18] = play_textArea_card2;
        playGroup[19] = play_textArea_card3;
        playGroup[20] = play_textArea_card4;
        playGroup[21] = play_textArea_card5;
        playGroup[22] = play_textArea_card6;
        playGroup[23] = play_textArea_card7;
        playGroup[24] = play_button_finalize;
        playGroup[25] = play_button_players;
        /*playGroup[26] = play_button_end;
        playGroup[0] = play_button_end;
        playGroup[0] = play_button_end;
        playGroup[0] = play_button_end;*/
        
    }
    
    private void buildCardGroup(){
        //building player's hands
        playCardGroup = new JComponent[7];
        playCardGroup[0] = play_button_card1;
        playCardGroup[1] = play_button_card2;
        playCardGroup[2] = play_button_card3;
        playCardGroup[3] = play_button_card4;
        playCardGroup[4] = play_button_card5;
        playCardGroup[5] = play_button_card6;
        playCardGroup[6] = play_button_card7;
    }
    
    private void buildEditGroup(){
        //building a group of components from the editing tab
        editGroup = new JComponent[16];
        editGroup[0] = edit_label_search;
        editGroup[1] = edit_textField_search;
        editGroup[2] = edit_button_prompt;
        editGroup[3] = edit_button_answer;
        editGroup[4] = edit_textField_keyword;
        editGroup[5] = edit_button_addPrompt;
        editGroup[6] = edit_button_addAnswer;
        editGroup[7] = edit_textField_new;
        editGroup[8] = edit_button_delete;
        editGroup[9] = edit_button_save;
        editGroup[10] = edit_button_edit;
        editGroup[11] = edit_button_back;
        editGroup[12] = edit_button_next;
        editGroup[13] = edit_button_showAllPrompts;
        editGroup[14] = edit_button_showAllAnswers;
        editGroup[15] = edit_textArea_all;
    }
    
    private void buildJudgeGroup(){
        //building a group of components from the judging tab
        judgeGroup = new JComponent[7];
        judgeGroup[0] = judge_textField_prompt;
        judgeGroup[1] = judge_textArea_answer1;
        judgeGroup[2] = judge_textArea_answer2;
        judgeGroup[3] = judge_textArea_answer3;
        judgeGroup[4] = judge_textArea_answer4;
        judgeGroup[5] = judge_textArea_answer5;
        judgeGroup[6] = judge_textArea_answer6;
    }
    
    private void buildCardSelection(){
        //building combo boxes based on the number of players
        String[] cardItems = new String[numPlayers];
        cardItems[0] = "A";
        cardItems[1] = "B";
        if (numPlayers > 2)
            cardItems[2] = "C";
        if (numPlayers > 3)
            cardItems[3] = "D";
        if (numPlayers > 4)
            cardItems[4] = "E";
        if (numPlayers > 5)
            cardItems[5] = "F";
        //reassign comboBox model w/ new mod of answer names
        judge_comboBox_answers.setModel(new DefaultComboBoxModel(cardItems));
    }
    
    private void buildPlayerHands(ArrayList<String> hand){
        //adding cards to players' hands
        while (hand.size() < 7){
            hand.add(cards.popAnswer());
        }
    }
    
    private void discardHand(ArrayList<String> hand){
        while (!hand.isEmpty()){
            answers.add(hand.get(0));
            hand.remove(0);
        }
    }
    
    private void shuffleArray(String[] array){
        //used to shuffle cards
        for (int i = array.length - 1; i > 0; i--) {
            int j = (int) Math.floor(Math.random() * (i + 1));
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit_button_addAnswer;
    private javax.swing.JButton edit_button_addPrompt;
    private javax.swing.JButton edit_button_answer;
    private javax.swing.JButton edit_button_back;
    private javax.swing.JButton edit_button_cancel;
    private javax.swing.JButton edit_button_delete;
    private javax.swing.JButton edit_button_edit;
    private javax.swing.JButton edit_button_next;
    private javax.swing.JButton edit_button_prompt;
    private javax.swing.JButton edit_button_save;
    private javax.swing.JButton edit_button_showAllAnswers;
    private javax.swing.JButton edit_button_showAllPrompts;
    private javax.swing.JLabel edit_label_search;
    private javax.swing.JPanel edit_panel;
    private javax.swing.JScrollPane edit_scrollpane1;
    private javax.swing.JTextArea edit_textArea_all;
    private javax.swing.JTextField edit_textField_keyword;
    private javax.swing.JTextField edit_textField_new;
    private javax.swing.JTextField edit_textField_search;
    private javax.swing.JButton judge_button_submit;
    private javax.swing.JComboBox<String> judge_comboBox_answers;
    private javax.swing.JLabel judge_label_WINNER;
    private javax.swing.JLabel judge_label_p1ct;
    private javax.swing.JLabel judge_label_p2ct;
    private javax.swing.JLabel judge_label_p3ct;
    private javax.swing.JLabel judge_label_p4ct;
    private javax.swing.JLabel judge_label_p5ct;
    private javax.swing.JLabel judge_label_p6ct;
    private javax.swing.JLabel judge_label_player1ct;
    private javax.swing.JLabel judge_label_player2ct;
    private javax.swing.JLabel judge_label_player3ct;
    private javax.swing.JLabel judge_label_player4ct;
    private javax.swing.JLabel judge_label_player5ct;
    private javax.swing.JLabel judge_label_player6ct;
    private javax.swing.JLabel judge_label_winner;
    private javax.swing.JLabel judge_label_winningCard;
    private javax.swing.JPanel judge_panel;
    private javax.swing.JScrollPane judge_scrollpane1;
    private javax.swing.JScrollPane judge_scrollpane2;
    private javax.swing.JScrollPane judge_scrollpane3;
    private javax.swing.JScrollPane judge_scrollpane4;
    private javax.swing.JScrollPane judge_scrollpane5;
    private javax.swing.JScrollPane judge_scrollpane6;
    private javax.swing.JTextArea judge_textArea_answer1;
    private javax.swing.JTextArea judge_textArea_answer2;
    private javax.swing.JTextArea judge_textArea_answer3;
    private javax.swing.JTextArea judge_textArea_answer4;
    private javax.swing.JTextArea judge_textArea_answer5;
    private javax.swing.JTextArea judge_textArea_answer6;
    private javax.swing.JTextField judge_textField_prompt;
    private javax.swing.JButton play_button_card1;
    private javax.swing.JButton play_button_card2;
    private javax.swing.JButton play_button_card3;
    private javax.swing.JButton play_button_card4;
    private javax.swing.JButton play_button_card5;
    private javax.swing.JButton play_button_card6;
    private javax.swing.JButton play_button_card7;
    private javax.swing.JButton play_button_end;
    private javax.swing.JButton play_button_finalize;
    private javax.swing.JButton play_button_player1;
    private javax.swing.JButton play_button_player2;
    private javax.swing.JButton play_button_player3;
    private javax.swing.JButton play_button_player4;
    private javax.swing.JButton play_button_player5;
    private javax.swing.JButton play_button_player6;
    private javax.swing.JButton play_button_players;
    private javax.swing.JButton play_button_start;
    private javax.swing.JLabel play_label_players;
    private javax.swing.JPanel play_panel;
    private javax.swing.JScrollPane play_scrollpane;
    private javax.swing.JScrollPane play_scrollpane1;
    private javax.swing.JScrollPane play_scrollpane2;
    private javax.swing.JScrollPane play_scrollpane3;
    private javax.swing.JScrollPane play_scrollpane4;
    private javax.swing.JScrollPane play_scrollpane5;
    private javax.swing.JScrollPane play_scrollpane6;
    private javax.swing.JScrollPane play_scrollpane7;
    private javax.swing.JTextArea play_textArea_card1;
    private javax.swing.JTextArea play_textArea_card2;
    private javax.swing.JTextArea play_textArea_card3;
    private javax.swing.JTextArea play_textArea_card4;
    private javax.swing.JTextArea play_textArea_card5;
    private javax.swing.JTextArea play_textArea_card6;
    private javax.swing.JTextArea play_textArea_card7;
    private javax.swing.JTextArea play_textArea_prompt;
    private javax.swing.JTextField play_textField_players;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
