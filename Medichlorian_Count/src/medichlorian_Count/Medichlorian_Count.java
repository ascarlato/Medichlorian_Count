package medichlorian_Count;

import java.util.Scanner;

public class Medichlorian_Count {

	public static void main(String[] args) {
		
		//USER GREETING
		System.out.println("In a Galaxy Far Far Away...");
		
		//DECLARING VARIABLES
		int medichlorianCount = 0;
		
		
		//MANUAL ENTRY 
		String anakinSkywalker = "Anakin Skywalker";
		int anakinSkywalkerCount = 27700;
		
		String darthSidious = "Darth Sidious";
		int darthSidiousCount = 20500;
				
		//USING A MAP (More Efficient)
		 // Create a map to store character names and their Medichlorian Counts
       // Map<String, Integer> characterCounts = new HashMap<>();
        //characterCounts.put("Anakin Skywalker", 27700);
        //characterCounts.put("Darth Sidious", 20500);
        // Add more characters and their counts as needed
		
		System.out.println("To find out what your characters Medichlorian Count is, please enter their name:");
		Scanner userInput = new Scanner(System.in);
		String characterName = userInput.nextLine();
		
		
		 if (characterName.equalsIgnoreCase(anakinSkywalker)) {
	            medichlorianCount = anakinSkywalkerCount;
	        } 
		 
		 else if (characterName.equalsIgnoreCase(darthSidious)) {
	            medichlorianCount = darthSidiousCount;
	        } 
		 
		 else {
	            System.out.println("Character not found. Medichlorian Count unknown.");
	        }

		
		System.out.println("You entered: " + characterName + "\n Their Medichlorian Count is: " + medichlorianCount);
		
	
				
				
		/*
		Anakin Skywalker/Darth Vader = 27,700 
		Darth Sidious/Palpatine (with Kyber Crystal) = 20,500 
		Yoda = 17,700 
		Luke Skywalker = 14,500 
		Leia Organa Solo = 14,500 
		Aenon Jurtis (Most powerful Jedi Master prior to Yoda) = 14,200
		Shintor Beerus (Ancient Jedi Master) = 13,900 
		Ce Ce Denowai (The Most Powerful Female Jedi) = 13,700 
		Ben (Jhon) Skywalker = 13,700 
		Anakin Solo (Son of Leia and Han Solo) = 13,700 
		Count Dooku/Darth Tyranus = 13,500 
		Obi-Wan Kenobi = 13,400 
		Kaja Sinis (The First Jedi) = 13,250 
		Kyle Katarn = 12,200 
		Mace Windu = 12,000 
		Darth Maul = 12,000 
		General Grievous (New Episode 3 Villain) = 11,900
		Kit Fisto = 11,800 
		Exar Kun (Dark Lord of the Sith during the Sith War) = 11,700 
		Shindor = 11,500 (Dark Jedi from Episode 7)
		Yaddle = 11,300 
		Xanatos' (Qui-Gon Jinn's former apprentice) = 11,300
		Darth Seer (Founder of the modern Sith Order) = 11,200 
		Plo Koon = 11,100 
		Mara Jade = 11,000 
		Darth Malak (Knights of the Old Republic video game) = 10,800 
		Jedi Master Corran Horn (from the New Jedi Order series of Star Wars novels) = 10,700 
		Ki Adi Mundu = 10,600 
		Darth Bane = 10,500 
		Nebar Foxis (Jedi Knight played by SuperShadow in Episode 3) = 10,400 
		Joruus C'baoth = 10,350 
		Darth Imperius (Darth Sidious' Master) = 10,300 
		Shaak Ti = 10,300 
		Tahari Vehlia (New Jedi Order novels) = 10,300 
		Echuu-Shen Jon = 10,200
		Darth Revan = 10,200 (Knights of the Old Republic video game) 
		Jedi Master Kam Solusar (New Jedi Order novels) = 10,100 
		Aalya Secura = 10,000 
		Qui-Gon Jinn = 10,000 
		Average Jedi = 10,000 
		Assajj Ventress (Sith Warrior During Clone Wars) = 9,600
		Naga Sadow (Dark Lord of the Sith that fled to Yavin 4)= 9,400 
		Jedi Master Adeus Hust = 9,300 
		Jacen Solo (Son of Leia and Han Solo) = 9,000 
		Jaina Solo (Daughter of Leia and Han Solo) = 9,000 
		Jedi Master Cihgal (New Jedi Order novels) = 9,000 
		Darth Rage (Sidious' apprentice after Darth Maul) = 9,000 
		Jedi Master Tionne Solusar (New Jedi Order novels) = 8,500 
		Dezar Looger (Dagobah Dark Jedi) = 8,400 
		Xio Jade = 7,400 
		Chewbacca = 7,200
		Tylus Liv = 7,100 
		Aurra Sing = 7,000 
		Need To be Considered for Training as a Jedi = 7,000 
		Padme Amidala = 4,700 
		Danni Quee (New Jedi Order Jedi Scientist)= 4,500 
		Beru Lars = 3,700
		Shmi = 3,300 
		Lando Calsarrian = 3,300 
		Boba Fett= 1,500 
		Han Solo = 1,500 
		Jango Fett = 1,500
		Owen Lars = 1,500
		*/

	
	}

}
