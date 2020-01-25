import java.io.*;
import java.util.Scanner;
public class Test {
	
//	FATMANUR ÖZDEMÝR 150116046

	public static void main(String[] args) throws IllegalNameException {
		
		System.out.printf("%s \n%s", "Welcome to animal farm simulation program" , "Please enter the capacity of the animal farm:" );
		Scanner input = new Scanner(System.in);
		int capacity = input.nextInt();
		
		AnimalFarm animal = new AnimalFarm(capacity);
		
		System.out.println("0 - Exit the program");
		System.out.println("1 - Add animal");
		System.out.println("2 - Remove animal");
		System.out.println("3 - Search animal");
		System.out.println("4 - Sort animal");
		System.out.println("5 - Calculate the next year's population estimate ");
		System.out.println("6 - Print all animal's movements");
		System.out.println("7 - Print all animal's eating habits");
		System.out.println("8 - Print report");
		System.out.println("Please enter our choice:");
		int choice = input.nextInt();
		while(choice != 0 ){
			if(choice == 1 && !(animal.getNumberOfAnimal()>capacity)){
				System.out.printf("%s \n%s \n%s \n%s \n%s \n%s \n", "1-Chicken", "2-Donkey","3-Horse", "4-Pig", "5-Raven" , "6-Sheep");
				System.out.print("Select animal type:");
				int type = input.nextInt();
				System.out.print("Enter the name:");
				String name= input.next();
				System.out.print("Enter the age:");
				int age = input.nextInt();
				if(type==1){
					Chicken chicken = new Chicken(name, age);					
					animal.addAnimal(chicken);
				}
				else if(type==2){
					Donkey donkey = new Donkey(name, age);
					animal.addAnimal(donkey);
				}
				else if(type == 3){
					Horse horse = new Horse(name, age);
					animal.addAnimal(horse);
				}
				else if(type == 4){
					Pig pig = new Pig(name, age);
						animal.addAnimal(pig);
					
				}
				else if (type == 5){
					Raven raven = new Raven(name ,age);
						animal.addAnimal(raven);
					
				}
				else if (type==6){
					Sheep sheep = new Sheep(name , age);
						animal.addAnimal(sheep);
				}
			}
			else if(choice==2){
				System.out.println("Enter name of animal:");
				String name = input.next();
				animal.removeAnimal(name);
			}
			else if(choice == 3){
				System.out.println("1-Search based on name");
				System.out.print("2-Search based on age");
				int number = input.nextInt();
				if(number==1){
					System.out.print("Enter name:");
					String name= input.next();
					animal.searchBasedOnName(name);
				}
				else if(number==2){
					System.out.println("Enter age:");
					int age=input.nextInt();
					animal.searchBasedOnAge(age);
				}	
			}
			else if(choice==4){
				System.out.println("Sort based on name");
				System.out.println("Sort based on leg number");
				System.out.println("Sort based on age");
				System.out.println("Sort based on addition date");
				int sortchoice = input.nextInt();
				if(sortchoice==1)
					animal.sortAlphabetically();
				else if(sortchoice==2)
					animal.sortBasedOnLegNumber();
				else if(sortchoice==3)
					animal.sortBasedOnAge();
				else if(sortchoice==4)
					animal.sortBasedOnAdditionDate();
			}
			else if(choice==5){
				System.out.println(animal.nextYearPopulationForecast());
			}
			
			else if (choice==6){
				animal.AnimalMovements();
			}
			
			else if(choice==7){
				animal.eatingHabits();
			}
			
			else if(choice==8){
				System.out.print("Enter file name:");
				String filename = input.next();
				try {
					( animal).printReport(filename);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("0 - Exit the program");
			System.out.println("1 - Add animal");
			System.out.println("2 - Remove animal");
			System.out.println("3 - Search animal");
			System.out.println("4 - Sort animal");
			System.out.println("5 - Calculate the next year's population estimate ");
			System.out.println("6 - Print all animal's movements");
			System.out.println("7 - Print all animal's eating habits");
			System.out.println("8 - Print report");
			System.out.println("Please enter our choice:");
			choice = input.nextInt();
		}
	}
}
