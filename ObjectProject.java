/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package objectproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jordanriskus
 * credited source — Working Foundation : AI Simulation
 */ 
class Iris {
    public void holdConversationWithUser(String name) throws IOException{
       //welcome user and display possible commands
        System.out.println("Great to see you " + name + "!\n");
        System.out.println("My name is Iris, and I will be your virtual assistant today!");
        System.out.println("You can ask me the following questions:\n");
        System.out.println("1: What is the temperature right now?");
        System.out.println("2: What is the date today?");
        System.out.println("3: Do I have anything to do today?");
        System.out.println("4: Where can I get fast food near me?");
        System.out.println("5: What was the score of the Steelers' game on Sunday?\n");
            System.out.println("To ask a question, please type the corresponding number.\n");
       
        //import BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean c = true;

        //display answer for question based on user input (1-4) using else if
        while (c){ 
            String answer = reader.readLine();
            if (answer.equals("1")) {
            System.out.println("———————————————————————————————————————————————————————————————");
            System.out.println("It is currently 34°F.");
            System.out.println("Good thing AI dont get cold! Pretty chilly for humans though...");
            System.out.println("———————————————————————————————————————————————————————————————\n");
            System.out.println("Enter a number to ask another question.\n");
            
            } else if (answer.equals("2")) {
            System.out.println("—————————————————————————————");
            System.out.println("Today is Monday, December 14.");
            System.out.println("——————————————————————————————\n");
            System.out.println("Enter a number to ask another question.\n");
            
            } else if (answer.equals("3")) {
            System.out.println("————————————————————————————————————————————————————");
            System.out.println("Reminder: Your Object Project for Java is due today.");
            System.out.println("How could you possibly forget!?");
            System.out.println("————————————————————————————————————————————————————\n");
            System.out.println("Enter a number to ask another question.\n");
            
             } else if (answer.equals("4")) {
            System.out.println("———————————————————————————");
            System.out.println("Scanning 5 mi radius.......");
            System.out.println("Burger King: 1 mi");
            System.out.println("Wendy's: 1.9 mi");
            System.out.println("Chick-fil-a: 3.1 mi");
            System.out.println("Five Guys: 4.9 mi");
            System.out.println("————————————————————————————\n");
            System.out.println("Enter a number to ask another question.\n");

             } else if (answer.equals("5")) {
            System.out.println("——————————————————————————————————————————");
            System.out.println("Steelers: 15 — Bills: 26");
            System.out.println("Unfortunate luck for Pittsburgh this time.");
            System.out.println("——————————————————————————————————————————\n");
            System.out.println("Enter a number to ask another question.\n");

            }//close else if
        }//close (while)
    }//end method
}//close class Iris

////////////////////////////////////////////////////////////////////////////////////////////

public class ObjectProject {
    public static void main (String[] args) throws IOException  { 
        Iris iris = new Iris();
        iris.holdConversationWithUser ("Eric");
    }//close main method
}//close class objectProject