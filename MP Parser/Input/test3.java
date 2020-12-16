public class Main {
	
	public static void testOne() {
		int x = 0;
		scan("Hello. I need your number: " ,x);
		
		for int i up to 6 { //syntax error #1
			System.out.println("Petmalu " +x+); //syntax error #2
		
		//syntax error #3 (missing curly brace)
	}

	public static void testTwo(float x) {
		if(x = 4)  //syntax error #4 
		{
			
			System.out.println("x is a very huge number"); //syntax error #5
		} 
	}

	public static void main(String[] args) {
		
		float value = (5 * 1) + (5 * 5 / 1 + 3 + (4 + (5 * 3)))/2.0f * 8.0f;
		int g = 5 + 8 *;	
		testOne()(x); //syntax error #6
		testTwo(123 ++value); //syntax error #7

	}
	
}


