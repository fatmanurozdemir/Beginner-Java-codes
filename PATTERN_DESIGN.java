
import java.util.Scanner;
public class PATTERN_DESIGN {

	public static void main(String[] args) {
		
//		Printing Pattern
//		Fatmanur Özdemir 150116046

			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter an input string: ");
			
	        String string = input.nextLine();
			
			int letternum = 0;
			
//			Declaring variables to make pattern line number as string length
			int m = 0;
			int stringlength= string.length();
			
//			Declaring variable to convert not printing strings to space
			int a = string.length();
			
			while(m <= stringlength){
				
			    int space=string.length()-a;
				
//				Printing word firstly by cutting last letter for each line(except first line)
			    while(letternum < a){
					
					System.out.print(string.charAt(letternum));
					letternum++;	
				}
				
//				Printing first interval's spaces
				for(int i=0; i < space*2-1; i++)
					System.out.print(" ");
				
//				Equalizing letternum to s.length()-1 for getting last letter
				letternum--;
				
//				Printing word reversely by cutting last letter for each line(except first line)
				while(letternum >= 0){
					
//					Preventing last letter repeat for the first lane
					if(letternum == string.length()-1)
						System.out.print("");
					
					else{
					System.out.print(string.charAt(letternum));
					
//					Preventing letternum become -1
					if(letternum == 0 )
						break;
					}
					
					letternum--;
				}
				
//				Deactivating cutted letters
				letternum++;
		        
//				Printing word secondly by cutting last letter for each line(except first line)
				while(letternum < a){
					
					System.out.print(string.charAt(letternum));
					letternum++;			
		        }
		        
//				Printing second interval's spaces
				for(int i=0; i < space*2-1; i++)
					System.out.print(" ");
		        
//				Deactivating cutted letters
				letternum--;
				
//				Printing word for the second time reversely by cutting last letter for each line(except first line)
				while(letternum >= 0){
					
//					Preventing last letter repeat for two times
					if(letternum == string.length()-1)
						System.out.print("");
					
					else{
					System.out.print(string.charAt(letternum));
					
//					Preventing letternum become -1
					if(letternum == 0)
						break;
					}
					
					letternum--;	
				}
				
				m++;
				
				System.out.println();
				
//				Increasing space number for per line
			   	a-=1;
			}	
	}

}
