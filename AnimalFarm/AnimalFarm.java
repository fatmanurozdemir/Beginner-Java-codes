import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class AnimalFarm {
	
	private ArrayList<Animal> animalList = new ArrayList<Animal>();
	private ArrayList<String> animalNames = new ArrayList<String>();
	private int CAPACITY;
	private static int numberOfAnimals=0;
	public AnimalFarm(int capacity){
		this.CAPACITY=capacity;
	}
	public int getNumberOfAnimal(){
		return numberOfAnimals;
	}

	public boolean addAnimal (Animal animal)throws IllegalNameException{
//		Checking whether capacity is full or the animal is already exists
		if(animalList.size()<=CAPACITY && !(animalList.contains(animal))){
			animalList.add(animal);
			numberOfAnimals++;
			animalNames.add(animal.getName());
			return true;
		}
		else{
			throw new IllegalNameException();
		}
	}
	public boolean removeAnimal(String name){
		
		if(animalNames.contains(name)){
			
			for(int i=0; i<animalList.size(); i++){
//				Decrementing animal count based on it's type for removing
				if(animalList.get(i).getName().equalsIgnoreCase(name)){
					if(animalList.get(i) instanceof Chicken)
						Chicken.decrementCount();
					else if(animalList.get(i) instanceof Donkey)
						Donkey.decrementCount();
					else if(animalList.get(i) instanceof Horse)
						Horse.decrementCount();
					else if(animalList.get(i) instanceof Pig)
						Pig.decrementCount();
					else if(animalList.get(i) instanceof Raven)
						Raven.decrementCount();
					else if(animalList.get(i) instanceof Sheep)
						Sheep.decrementCount();
					
					animalList.remove(animalList.get(i));
					animalNames.remove(name);
				}
			}
			return true;
		}
		else
			return false;
	}
	
	public void printAllAnimalGreetings(){
		for(int i=0; i<animalList.size(); i++){
		printOneAnimalGreeting(animalList.get(i));
		}
	}
	public void printOneAnimalGreeting(Animal animal){
		animal.sayGreeting();
	}
	public void printAllAnimalNames(){
		for(int i=0; i<animalList.size(); i++){
			printOneAnimalName(animalList.get(i));
		}
	}
	public void printOneAnimalName(Animal animal){
		System.out.println(animal.getName());
	}
	public void printAllAnimals(){
		for(int i=0; i<animalList.size(); i++){
			animalList.get(i).toString();
		}
	}
	public int nextYearPopulationForecast(){
		int totalnumberOfOffsprings=0;
//		Adding offsprings off all animals
		for(int i=0; i<animalList.size(); i++){
			totalnumberOfOffsprings += animalList.get(i).getnumberOfOffsprings();
		}
		int totalPregnancy=0;
//		Adding pregnancy number off all animals
		for(int i=0; i<animalList.size(); i++){
			totalPregnancy += animalList.get(i).getpregnancyPerYear();
		}
		return  totalnumberOfOffsprings * totalPregnancy + 1;
	}
	public void AnimalMovements(){
		
		for(int i=0; i<animalList.size(); i++){	
//			Learning the type of animal to decide it's movement
			if(animalList.get(i) instanceof Bird){
				Bird animal = (Bird)animalList.get(i);
				System.out.print("My name is " + animal.getName() + " and ");
				((Bird)animal).fly();
			}
			else{
				Mammal animal = (Mammal)animalList.get(i);
				System.out.print("My name is " + animal.getName() + " and ");
				((Mammal)animal).walk();
				
			}	
		}
	}
	public void eatingHabits(){
		for(int i=0; i<animalList.size(); i++){
//			Learning the type of animal to decide it's eating habit
			if(animalList.get(i) instanceof Bird){
				Bird animal = (Bird)animalList.get(i);
				System.out.print("My name is " + animal.getName() + " and ");
				((Bird)animal).omnivore();
			}
			else{
				Mammal animal = (Mammal)animalList.get(i);
				System.out.print("My name is " + animal.getName() + " and ");
				((Mammal)animal).herbivore();
			}	
		}
	}
	public void sortAlphabetically(){
		
	}
	
	public void sortBasedOnLegNumber(){
		
//		For the reason that these animal can only have 2 or 4 legs, checking for the condition that if they have 2 or 4 legs
		for(int i=0; i<animalList.size(); i++){
			if(animalList.get(i).getlegNumber()==2)
				System.out.println(animalList.get(i).getName() + " has 2 legs!");
		}
		for(int k=0; k<animalList.size(); k++){
			if(animalList.get(k).getlegNumber()==4)
				System.out.println(animalList.get(k).getName() + " has 4 legs!");
		}
		
	}
	public void sortBasedOnAge(){
		
//		Building a string array with names in animal List to not change animalList
		String[] arrayname = new String[animalList.size()];
		for(int a=0; a<arrayname.length; a++){
			arrayname[a] = animalList.get(a).getName();
		}
		int old=0;
		int young=0;
		
//		Building a integer array with ages in animal List to not change animalList
		int[] array = new int[animalList.size()];
		for(int a=0; a<array.length; a++){
			array[a] = animalList.get(a).getAge();
		}
		for(int k=0; k<array.length; k++){
			
//			Comparing two ages and deciding which one is younger
			for(int i=1; i<array.length; i++){
				if(array[k]<=array[i] && array[k]>=array[young])
				{
					young=k;
					old=i;
				}	
				else{
					young=i;
					old=k;
				}
			}			
			System.out.println(arrayname[young] + " is " + array[young] + " years old");
//			Taking out the youngest animal from list's to sort
			array[young] = array[old] ;
			arrayname[young] = arrayname[old];
		}
		
	}
	public void sortBasedOnAdditionDate(){
		for(int i=0; i<animalList.size(); i++){
			System.out.println(animalList.get(i).toString());
		}
	}
	public void searchBasedOnName(String name){
//		Checking all animals on the list based on their names
		for(int i=0; i<animalList.size(); i++){
			if(animalList.get(i).getName().equalsIgnoreCase(name))
				System.out.println(animalList.get(i).toString());
		}
	}
	public void searchBasedOnAge(int age){
//		Checking all animals on the list based on their ages
		for(int i=0; i<animalList.size(); i++){
			if(animalList.get(i).getAge()==age)
				System.out.println(animalList.get(i).toString());
		}
	}
	public void printReport (String filename) throws FileNotFoundException {
		java.io.File  file = new java.io.File(filename);
		
			java.io.PrintWriter output;
			
				output = new java.io.PrintWriter(filename);
				output.print("We have total of " + getNumberOfAnimal() + " animals in the farm.");
				output.print("\n");
				for(int i=0; i<animalList.size(); i++){
				if(animalList.get(i) instanceof Chicken){
//					Deciding the type of animal
					output.print("*" + Chicken.getCount() + " of them are chicken.Those are:");
					output.println();
					output.print("     ");
					output.printf("%-10s%-10s%-10s", "Name", "Age", "Leg Number" );
					output.println();
					output.print("     ");
					Chicken chicken  = (Chicken)animalList.get(i);
					output.printf("%-10s%-10d%-10d" , chicken.getName(), chicken.getAge(), chicken.getlegNumber());
					output.println();
				}
				if(animalList.get(i) instanceof Donkey){
//					Deciding the type of animal
					output.print("*" + Donkey.getCount() + " of them are donkey.Those are:");
					output.println();
					output.print("     ");
					output.printf("%-10s%-10s%-10s", "Name", "Age", "Leg Number" );
					output.println();
					output.print("     ");
					Donkey donkey  = (Donkey)animalList.get(i);
					output.printf("%-10s%-10d%-10d" , donkey.getName(), donkey.getAge(), donkey.getlegNumber());
					output.println();
				}
				else if(animalList.get(i) instanceof Horse){
					output.print("*" + Horse.getCount() + " of them are horse.Those are:");
					output.println();
					output.print("     ");
					output.printf("%-10s%-10s%-10s", "Name", "Age", "Leg Number" );
					output.println();
					output.print("     ");
					Horse horse  = (Horse)animalList.get(i);
					output.printf("%-10s%-10d%-10d" , horse.getName(), horse.getAge(), horse.getlegNumber());
					output.println();
				}
				else if(animalList.get(i) instanceof Pig){
					output.print("*" + Pig.getCount() + " of them are pig.Those are:");
					output.println();
					output.print("     ");
					output.printf("%-10s%-10s%-10s", "Name", "Age", "Leg Number" );
					output.println();
					output.print("     ");
					Pig pig  = (Pig)animalList.get(i);
					output.printf("%-10s%-10d%-10d" , pig.getName(), pig.getAge(), pig.getlegNumber());
					output.println();
				}
				else if(animalList.get(i) instanceof Raven){
					output.print("*" + Raven.getCount() + " of them are raven.Those are:");
					output.println();
					output.print("     ");
					output.printf("%-10s%-10s%-10s", "Name", "Age", "Leg Number" );
					output.println();
					output.print("     ");
					Raven raven  = (Raven)animalList.get(i);
					output.printf("%-10s%-10d%-10d" , raven.getName(), raven.getAge(), raven.getlegNumber());
					output.println();
				}
				else if(animalList.get(i) instanceof Sheep){
					output.print("*" + Sheep.getCount() + " of them are sheep.Those are:");
					output.println();
					output.print("     ");
					output.printf("%-10s%-10s%-10s", "Name", "Age", "Leg Number" );
					output.println();
					output.print("     ");
					Sheep sheep  = (Sheep)animalList.get(i);
					output.printf("%-10s%-10d%-10d" , sheep.getName(), sheep.getAge(), sheep.getlegNumber());
					output.println();
				}
				}
			
			output.close();
	}
}
