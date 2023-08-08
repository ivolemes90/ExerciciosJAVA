package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		double soma = 0;
		
		System.out.print("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores = ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		for (int i=0; i<vect.length; i++) {
			soma += vect[i];
		}
		
		double media = soma/n;
		
		
		System.out.printf("%nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f", media);
		
			
		sc.close();
	}
}
