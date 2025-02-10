import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split("");

		for (String s : str) {
			System.out.printf("\'%s\'\n", s);
		}
		
		sc.close();
	}
}
