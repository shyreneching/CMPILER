func int myFunction(int x) {
	int add = x + 50 ++ ; //syntax error #1
	
	return int; //syntax error #2
}

func float myFunctionFloat(float x) {
	float fTest = (x * 50) + (x * 15)); //syntax error #3
	
	return fTest * 50 (); //syntax error #4
}

main() {
	myFunction(50);
	myFunctionFloat(50.0f);
}
