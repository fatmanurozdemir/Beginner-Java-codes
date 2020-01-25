
public class Donkey extends Mammal {
	
	private static int count=0;
	
	public Donkey(String name, int age){
		super(name, age);
		super.setlegNumber(4);
		super.setnumberOfOffsprings(1);
		super.setpregnancyPerYear(1);
		count++;
	}
	@Override
	public void sayGreeting(){
		System.out.println("Life will go on as it has always gone –that is, badly!");
	}
	public static int getCount(){
		return count;
	}
	public static void decrementCount(){
		count--;
	}

}
