import java.util.Scanner;

public class binaryToDecimal {
	
  public static void main(String[] args) {
	  
    System.out.print("Enter binary number: ");
    Scanner kbreader = new Scanner(System.in);
    String binaryString = kbreader.next();
	
    char separatedDigits[];
    separatedDigits = binaryString.toCharArray();
    
	int first = (int) separatedDigits[0] - 48, second = (int) separatedDigits[1] - 48,
        third = (int) separatedDigits[2] - 48, fourth = (int) separatedDigits[3] - 48;
    fourth = fourth * 1;
    third = third * 2;
    second = second * 4;
    first = first * 8;
    
	int decimalNumber = first + second + third + fourth;
    
	System.out.print(decimalNumber);
    
	kbreader.close();
  }
}
