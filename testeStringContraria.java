package java_nelio_alves_udemy;

import java.util.Scanner;

public class testeStringContraria {

	public static void main(String[] args) {
		contrario("minha frase");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a frase");
		String frase = sc.nextLine();
		for (int i = frase.length() -1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}
		sc.close();
	}
	
	public static String contrario(String x) {
		for (int i = x.length() -1; i >= 0; i--) {
			System.out.print(x.charAt(i));			
		}
		System.out.println("");
		return x;
	}
	

}
