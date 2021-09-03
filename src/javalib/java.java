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
         double knightDamage;
         double clericHeal;
         double fireballDamage;
        
        
        
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
                
        System.out.println("Give me a second Decimal:");
            knightDamage = sc.nextDouble();      
            
        System.out.println("Give me a third decimal that is less than the previous:");
            clericHeal = sc.nextDouble();      
            
        System.out.println("Give me a 4th decimal less than 100:");
            fireballDamage = sc.nextDouble();          
            
        
        
         double damageLeft = knightDamage - clericHeal;
         double dragonhpLeft = dragonHp - fireballDamage;
         
         
          // Where the story is told
        
         System.out.println("There once was team of brave adventurers.");
         
         System.out.println("The team consisted of a cleric, a knight, and a wizard.");
         
         System.out.println("Their names were The " + teamName + ".");
         
         System.out.println("Currently our brave heroes were level " + teamLevel + ".");
   
         System.out.println("The " + teamName + " were quickly approaching The cave of " + nameCave + ".");      
         
         System.out.println("Inside was an Adult " + dragonColor + " dragon with " + dragonHp  + " HP");
        
         System.out.println("The knight leaped at the dragon, but the dragon swatted him out fo the air dealing " + knightDamage + " points of damage.");
        
         System.out.println("The cleric rushed over and cast healing word, wich healed " + clericHeal + " points of damage, leaving the knight with only " + damageLeft + " points of damage left.");
        
         System.out.println("While the dragon was distracted, the wizard cast fireball, dealing" + fireballDamage + " points of damage, leaving the dragon with only " + dragonhpLeft + " HP.");
        
        
    }
    
}
