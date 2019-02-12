import java.util.Scanner;

public class NoOfOccurencesOfAllCharacteresInASTring {



public static void main(String[] args) {

    Scanner inp= new Scanner(System.in);
    String str;
    char ch;
    int count=0;

    System.out.println("Enter the string:");
    str=inp.nextLine();

    while(str.length()>0)
    {
        ch=str.charAt(0);
        int i=0;

        while(str.charAt(i)==ch)
        {
                count =count+i;
                i++;
        }

        str.substring(count);
        System.out.println(ch);
        System.out.println(count);
    }

}
}




