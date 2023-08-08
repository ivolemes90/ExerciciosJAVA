package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program_ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employee employee = new Employee();
		
		
		System.out.println("Enter Name, Gross Salary and Tax: ");
		
		System.out.print("Name: ");
		employee.Name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.printf("%nEmployee: " + employee + "%n");
		
		
		System.out.println("---------------------");
		System.out.print("Which percentage to increase salary? ");
		employee.IncreaseSalary(sc.nextDouble());
		
		System.out.printf("%nUpdate data: " + employee);
		
		//System.out.printf("%nUpdate data: %s, $ %.2f%n%n", employee.Name, employee.NetSalary());
		
		sc.close();
	}

}
