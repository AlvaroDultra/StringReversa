package estagio;
import java.util.Scanner;
public class StringReversa {

	public static void main(String[] args) {
		String a;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite uma palavra ");
		a=s.nextLine();
		int x = a.length();
		for(int i = x-1; i>=0; i--) {
		char j =a.charAt(i);
			System.out.print(j);
		}
		

	}

}
