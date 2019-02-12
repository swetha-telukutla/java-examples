
public class ConvertRomanToInteger {
public static void main(String[] args)
	
	//Return the integer value of a roman numeral digit
	private static int romanValue(char digit){
	int romanValue='x';
	
	switch ( romanValue )
	{
	case 'I' : 
	System.out.println(1);
	
	case 'V' : 
		
		System.out.println(5);
	
	case 'X' : 
	System.out.println(10);

	
	case 'L' : 
	System.out.println(50);
	case 'C' :
	System.out.println(100);
	case 'D' : 	System.out.println(500);
	case 'M' :
	System.out.println(1000);
	break;
	default : throw new RuntimeException("Not a valid Roman Numeral");
	}
	}}

