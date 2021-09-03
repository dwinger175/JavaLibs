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
         String nameCave;
         String dragonColor;
         double dragonHp;
        
         
        
        
        
        
        Scanner sc =  new Scanner(System.in);
        // Where the qustions are asked and stored
        
        System.out.println("Hello, What is your name: ");
            firstName = sc.next();  
        
      
        
        System.out.println("Hello " + firstName + ", Give me the name of a team:");
            teamName = sc.next();  
        
         
        System.out.println("Now give me a whole number:");
            teamLevel = sc.nextInt();  
            
         
        System.out.println("Next, give me a proper noun:");
            nameCave = sc.next();  
        
        System.out.println("Now, give me a color:");
            dragonColor = sc.next();  
        
        System.out.println("Now give me a decimal that is over 100:");
            dragonHp = sc.nextDouble();  
                
            
            
            
            
            
            
        
        
        
        
          // Where the story is told
        
         System.out.println("There once was team of brave adventurers.");
         
         System.out.println("The team consisted of a cleric, a knight, and a wizard.");
         
         System.out.println("Their names were The " + teamName + ".");
         
         System.out.println("Currently our brave heroes were level " + teamLevel + ".");
   
         System.out.println("The " + teamName + " were quickly approaching The cave of " + nameCave + ".");      
         
        System.out.println("Inside was an Adult " + dragonColor + "dragon with " + dragonHp );
        
    }
    
}
