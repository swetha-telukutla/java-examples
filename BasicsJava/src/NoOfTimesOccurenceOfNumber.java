import java.util.Arrays;

public class NoOfTimesOccurenceOfNumber {
	public static void main(String[] args) {
		int[] a = { 1,8,3,6,7,8,1,1 };
		Arrays.sort(a);
		int nbOccurences = 1;
		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				if (a[i] == a[i + 1]) {
					nbOccurences++;
					// System.out.println(a[i] + " occurs " + nbOccurences + "
					// time(s)"); // end
				} else {
					System.out.println(a[i] + " occurred " + nbOccurences);
					nbOccurences = 1;
				}
			}else{
				System.out.println(a[i] + " occurred " + nbOccurences);
			}
		}
	}
}
