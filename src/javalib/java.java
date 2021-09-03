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
         int levelsGained;
         double goldFound;
        
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
        
        System.out.println("Now give me a decimal between 100 and 200:");
            dragonHp = sc.nextDouble();  
                
        System.out.println("Give me a second Decimal:");
            knightDamage = sc.nextDouble();      
            
        System.out.println("Give me a third decimal that is less than the previous:");
            clericHeal = sc.nextDouble();      
            
        System.out.println("Give me a 4th decimal less than 100:");
            fireballDamage = sc.nextDouble();          
            
        System.out.println("Now give me one last whole number whole number:");
            levelsGained = sc.nextInt();  
        
        System.out.println("Finally, Give me a number whole number larger than 10.");
            goldFound = sc.nextDouble();              
            
            
        
        sc.close();
            
            
         double damageLeft = knightDamage - clericHeal;
         double dragonhpLeft = dragonHp - fireballDamage;
         int newLevel = teamLevel + levelsGained ;
         double goldEach = goldFound /3 ;
         
          // Where the story is told
        
         System.out.println("There once was team of brave adventurers.");
         
         System.out.println("The team consisted of a cleric, a knight, and a wizard.");
         
         System.out.println("They were called The " + teamName + ".");
         
         System.out.println("Currently our brave heroes were level " + teamLevel + ".");
   
         System.out.println("The " + teamName + " were quickly approaching The cave of " + nameCave + ".");      
         
         System.out.println("Inside was an Adult " + dragonColor + " dragon with " + dragonHp  + " HP");
        
         System.out.println("The knight leaped at the dragon, but the dragon swatted him out of the air, dealing " + knightDamage + " points of damage.");
        
         System.out.println("The cleric rushed over and cast healing word, wich healed " + clericHeal + " points of damage, leaving the knight with only " + damageLeft + " points of damage left.");
        
         System.out.println("While the dragon was distracted, the wizard cast fireball, dealing " + fireballDamage + " points of damage, leaving the dragon with only " + dragonhpLeft + " HP.");
        
         System.out.println("The Knight, filled with rage, charged at the dragon, getting a critical hit and dealing the final blow.");
         
         System.out.println("As the dragon dropped to the ground, the group could feel that they gained " + levelsGained + " levels. This brought their total levels up to " + newLevel + ".");
    
         System.out.println("After pillaging the dragons lair, our heroes found a total of " + goldFound + " gold coins. This meant that they each get " + goldEach + " gold coins.");
        
         System.out.println("The brave adventurers leave the cave in search of more daring escapades.");
    
    }
    
}
