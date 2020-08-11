package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contributors;
import entities.CorporateTaxpayers;
import entities.Taxpayers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contributors> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payers #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expendtures: ");
				double healthSpending = sc.nextDouble();
				list.add(new Taxpayers(name, anualIncome, healthSpending));
			}
			else {
				System.out.print("Number of Employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new CorporateTaxpayers(name, anualIncome, numberOfEmployees));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double total = 0;
		for(Contributors taxpayers : list) {
			System.out.println(taxpayers.getName() + String.format(": $ %.2f ", taxpayers.taxCalc()));
			total += taxpayers.taxCalc();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", total);
		sc.close();
	}
}
