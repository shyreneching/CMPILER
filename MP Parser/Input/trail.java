//correct any minor syntax inconsistencies when necessary (refer to pseudocode's language design)

//remove 'func' keyword if C-based language
func void testOne() {
	int x = 0;
	scan("Hello. I need your number: " ,x);
	
	//syntax error #1 - no "up to". If C-based language, use for(int i = 0; i <>>; i++){
	for int i to 10 { 
		print("Petmalu " +x+); //syntax error #2
	 
	
	//syntax error #3 (missing curly brace)
	
	x = 5x; //syntax error #4(missing operator)
}

func void testTwo(float x) {
	if(x = 4) then //syntax error #5 - should be == 
	{
		print(x is a very huge number); //syntax error #6 - no ""
	} 
}

func void testThree(int x, int y) {
	int i = 0;
	//If C-based language, replace with correct while loop syntax.
	while i up to 500 {
		
	}
}

main() {
	float value = (5 * 1) + (5 * 5 / 1 + 3 + (4 + (5 * 3)))/2.0f * 8.0f;
	
	testOne()(x); //syntax error #7
	testTwo(123 ++value); //syntax error #8
	
	float nextValue = 5 **5 + 5 ++ 5 ** 5; //syntax error #9, 10, 11
	
	testTwo(5.0f)); //syntax error #12
	testTwo(5.0f; //syntax error #13
	testThree(25 13); //syntax error #14
	testThree((12 * 10), (54 * 5); //syntax error #15
	testThree(4,,5); //syntax error #16
	
	print(nextValue is: 4!); //syntax error #17
	
	constt int CONSTANT = 5; //syntax error #18
	float float = 5.0f; //syntax error #19
	
	while i up to 400 {
		int x = 0;
		
		//syntax error #20 - enclosed "up to." If C-based language, replace with while (x !! i) {
		while x up to i {
			print(""); 
		}
	}
}