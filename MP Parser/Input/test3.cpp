func void testOne() {
	int x = 0;
	scan("Hello. I need your number: " ,x);
	
	for int i to 10 { //syntax error #1
		print("Petmalu " +x+); //syntax error #2
	}
	//syntax error #3 (missing curly brace)
}

func void testTwo(float x) {
	if(x = 4) then //syntax error #4 
	{
		print(x is a very huge number); //syntax error #5
	} 
}

main() {
	float value = (5 * 1) + (5 * 5 / 1 + 3 + (4 + (5 * 3)))/2.0f * 8.0f;
	
	testOne()(x); //syntax error #6
	testTwo(123 ++value); //syntax error #7
}
