/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package javalib;

import java.util.Scanner;

/**
 *
 * @author dwinger
 */
public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Where the Variables are housed
         String firstName;
         String teamName;
         int teamLevel;
    
    
        
         
        
        
        
        
        Scanner sc =  new Scanner(System.in);
        // Where the qustions are asked and stored
        
        System.out.println("Hello, What is your name: ");
            firstName = sc.nextLine();  
        
      
        
        System.out.println("Hello " + firstName + ", Give me the name of a team");
            teamName = sc.nextLine();  
        
         
        System.out.println("Now give me a whole number");
            teamLevel = sc.nextInt();  
        
        
        
        
        
        
        
        
          // Where the story is told
        
         System.out.println("There once was team of brave adventurers.");
         System.out.println("The team consisted of a cleric, a knight, and a wizard.");
         System.out.println("The team was named The " + teamName );
         
   
                 
         
        
        
    }
    
}
