import java.util.Scanner;

/**
 * Roman to Integer conversion
 * 
 * @author SankarA
 *
 */
public class Roman2Number {

	public static void main(String[] args){
	   Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the Roman String "  );
       String romanStr = scanner.nextLine();
       int sum = 0;
       char[] romanChars = romanStr.toCharArray();

       for( int i = 0 ; i < romanChars.length ; i++){
       	if(i == romanChars.length -1){
       		sum+= convert(romanChars[i], ' ');
       	}else{
       		sum+= convert(romanChars[i], romanChars[i+1]);
       	}
       }
      System.out.print(romanStr +" = " + sum );
      
      scanner.close();
	}
	
	/**
	 * Convert the Roman number to Number.
	 * @param ch
	 * @param next_char
	 * @return
	 */
	public static int convert(char ch, char next_char) {
	     
		if (ch == 'I') {
			if (next_char == 'V' || next_char == 'X')
				return -1;
			else
				return 1;
		} else if (ch == 'V')
			return 5;
		else if (ch == 'X')
			return 10;
		else if (ch == 'L')
			return 50;
		else if (ch == 'C')
			return 100;
		else if (ch == 'D')
			return 500;
		else if (ch == 'M')
			return 1000;
		else {
			System.out.println("Invalid Character found");
			System.exit(0);
		}
		return 0;
	}
  }
