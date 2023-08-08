package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program_ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.Nome = sc.nextLine();
		System.out.print("Grade 1: ");
		student.N1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		student.N2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		student.N3 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();
	}

}
