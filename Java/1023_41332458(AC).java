﻿import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("\\.");
		System.out.printf("%s\n%s", s[0], s[1]);
		sc.close();
	}
}
