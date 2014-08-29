package chapter5;

public class GetNP {
	
	static int getNext_NP(int input) {
		
		int output = input;
		
		int pos = 0;
		
		//Get first one
		while (!testPos(output, pos)) {
			pos++;
		}
		
		//output = input & ~(1<<pos++);
		
		int countOne = 0;
		pos++;
		//Find next zero
		while (testPos(output, pos)) {
			pos++;
			countOne++;
		}
		output |= (1<<pos);
		
		int i;
		for (i = pos - 1; i >= countOne; i--) {
			output &= ~(1<<i);
		}
		for (; i >= 0; i--) {
			output |= 1<<i;
		}
		
		return output;	
		
	}
	
	static int getPrevious_NP(int input) {
		
		int output = input;
		
		int pos = 0;
		
		//Get first zero
		while (testPos(output, pos)) {
			pos++;
		}
		
		//output = input & ~(1<<pos++);
		
		int countZero = 0;
		pos++;
		//Find next one
		while (!testPos(output, pos)) {
			pos++;
			countZero++;
		}
		output &= ~(1<<pos);
		
		int i;
		for (i = pos - 1; i >= countZero; i--) {
			output |= 1<<i;
		}
		for (; i >= 0; i--) {
			output &= ~(1<<i);
		}
		
		return output;
		
	}

	private static boolean testPos(int n, int pos) {
		return (n&(1<<pos)) > 0;
	}

}
