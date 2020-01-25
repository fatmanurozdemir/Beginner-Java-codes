import java.io.*;
public class Animal {
	
	private String name; 
	private int legNumber, age, pregnancyPerYear, numberOfOffsprings;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getlegNumber(){
		return legNumber;
	}
	public void setlegNumber(int legNumber){
		this.legNumber=legNumber;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getpregnancyPerYear(){
		return pregnancyPerYear;
	}
	public void setpregnancyPerYear(int pregnancyPerYear){
		this.pregnancyPerYear=pregnancyPerYear;
	}
	public int getnumberOfOffsprings(){
		return numberOfOffsprings;
	}
	public void setnumberOfOffsprings(int numberOfOffsprings){
		this.numberOfOffsprings=numberOfOffsprings;
	}
	public Animal(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void sayGreeting(){
		System.out.println("Have nothing to say!");
	}
	public void reproduce(){
		System.out.println("None of your business!!");
	}
	public String toString(){
		return "My name is " + name + "! I am " + age + " years old " + "! I have " + legNumber + " legs!";
	}

}
