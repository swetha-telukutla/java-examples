import javax.swing.Spring;

public class ConvertIntegerToLetters {
	public static void main(String[] args){
	int inNum=1234;
	
	String inString = inNum.ToString();
	String outText = "";
	for (int i=0;i<inString.length();i++)
	{
	String number=inString.substring(i,1);
	String oneWordOutput="";
	switch(number)
	{
	case "1":
	oneWordOutput = "One";
	break;
	case "2":
	oneWordOutput = "Two";
	break;
	case "3":
	oneWordOutput = "Three";
	break;
	case "4":
	oneWordOutput = "Four";
	break;
	case "5":
	oneWordOutput = "Five";
	break;
	case "6":
	oneWordOutput = "Six";
	break;
	case "7":
	oneWordOutput = "Seven";
	break;
	case "8":
	oneWordOutput = "Eight";
	break;
	case "9":
	oneWordOutput = "Nine";
	break;
	case "0":
	oneWordOutput = "Zero";
	break;
	default:
	break;
	}
	If(outText="")
	{
	outText = oneWordOutput;
	}
	else
	{
	outText = outText + " " + oneWordOutput;
	}
	}

}
