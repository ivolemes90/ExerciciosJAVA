package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNegativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		while (n > 10) {
			System.out.println("Numero máximo permitido = 10");
			System.out.print("Digite novamente: ");
			n = sc.nextInt();
		}
		
		int[] vect = new int[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.printf("Digite o número de posicão %s: ", i);
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		int negConfirm = 0;
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
				negConfirm ++;
			}
		}
		
		if (negConfirm == 0) {
			System.out.println("Não temos número negativos no vetor!");
		}

		sc.close();
	}

}
