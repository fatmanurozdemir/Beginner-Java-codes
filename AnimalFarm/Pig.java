
public class Pig extends Mammal{
	
    private static int count=0;
	
	public Pig(String name, int age){
		super(name, age);
		super.setlegNumber(4);
		super.setnumberOfOffsprings(12);
		super.setpregnancyPerYear(2);
		count++;
	}
	@Override
	public void sayGreeting(){
		System.out.println("All animals are equal, but some animals are more equal than others!");
	}
	public static int getCount(){
		return count;
	}
	public static void decrementCount(){
		count--;
	}

}
