package br.com.generationjava01;

import java.util.Scanner;

public class AtividadeJava01 {

	public static void main(String[] args) {
	int anos, meses, dias, ddm = 30, dda = 365;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informa a idade em dias.");
	
	
	System.out.println("\nVocê sabe a quantos dias está vivo?");
	System.out.println("Informe a sua idade.");
	System.out.print("\nEm anos: ");
	anos = input.nextInt();
	
	System.out.print("Em meses: ");
	meses = input.nextInt();
	
	System.out.print("Em dias: ");
	dias = input.nextInt();
	
	dias = (anos * dda) + (meses * ddm);
	System.out.println("Sua idade em dias é: "+dias+" dias.");
	
	input.close();
	
}

}