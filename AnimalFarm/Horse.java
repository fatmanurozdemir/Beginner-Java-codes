
public class Horse extends Mammal {
	
    private static int count=0;
	
	public Horse(String name, int age){
		super(name, age);
		super.setlegNumber(4);
		super.setnumberOfOffsprings(1);
		super.setpregnancyPerYear(1);
		count++;
	}
	@Override
	public void sayGreeting(){
		System.out.println("I will work harder!");
	}
	public static int getCount(){
		return count;
	}
	public static void decrementCount(){
		count--;
	}
	

}
