package chapter5;

public class PrintBinary {

	public static void printBinary(String input) {
		
		int intPart = Integer.parseInt(input.substring(0, input.indexOf(".")));
		double decPart = Double.parseDouble(input.substring(input.indexOf(".")));
		
		String intString = "";
		while (intPart != 0) {
			int r = intPart % 2;
			intPart >>= 1;
			intString = r + intString;
		}
		
		String decString = "";
		while (decPart != 0) {
			decPart *= 2;
			if (decPart >= 1) {
				decString = decString + "1";
				decPart -= 1;
			} else {
				decString = decString + "0";
			}
		}
		
		System.out.println(intString + "." + decString);
		
	}
	
}
