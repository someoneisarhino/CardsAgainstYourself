package com.vhscs3.cardsagainstyourself;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sophi
 */
public class CardStack {
    
    private Stack<String> prompts;
    private Stack<String> answers;

    public CardStack() {
        prompts = new Stack<String>();
        answers = new Stack<String>();
    }
    
    
    public void buildPrompts(){
        //using a scanner to extract all the prompt information from the prompt text file and into the stack 'prompts'
        try {
            Scanner file = new Scanner(new File("data" + File.separator + "prompt.txt"));
            
            
            while (file.hasNextLine()) {
                prompts.add(file.nextLine());
            }
            file.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: Prompt txt file not found");
        }
    }
    
    public void buildAnswers(){
        //using a scanner to extract all the prompt information from the prompt text file and into the stack 'prompts'
        try {
            Scanner file = new Scanner(new File("data" + File.separator + "answer.txt"));
            
            
            while (file.hasNextLine()) { 
                answers.add(file.nextLine());
            }
            file.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR: Answer txt file not found");
        }
    }
    
    public Stack<String> getPrompts(){
        //returns stack 'prompts'
        buildPrompts();
        return prompts;
    }
    
    public Stack<String> getAnswers(){
        //returns stack 'answer'
        buildAnswers();
        return answers;
    }
    
    public void shuffle(){
        //shuffles prompts and answer stacks
        Collections.shuffle(prompts);
        Collections.shuffle(answers);
    }
    
    public String popPrompt(){
        //returns prompt from the top of the card deck (most recently added unless shuffled)
        String prompt = prompts.get(0);
        prompts.remove(0);
        return prompt;
    }
    
    public String popAnswer(){
        //returns answer from the top of the card deck (most recently added unless shuffled)
        String answer = answers.get(0);
        answers.remove(0);
        return answer;
    }
    
    public int getPromptnum(){
        //returns number of prompts
        return prompts.size();
    }
    
    public int getAnswernum(){
        //returns number of answers
        return answers.size();
    }
    
    public boolean promptNull(){
        //returns true if there are no prompts left in the deck
        return prompts.isEmpty();
    }
    
    public boolean answerNull(){
        //returns true if there are no answers left in the deck
        return answers.isEmpty();
    }
}
