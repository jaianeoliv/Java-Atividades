package br.com.generation.atividades15;

import java.util.Scanner;
		//#15 LA�OS DE DECIS�O
public class Atividade01 {

	public static void main(String[] args) {
		
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = input.nextInt();
		
		if(n1 > n3 && n1 > n2) {
			System.out.println("O primeiro n�mero � o maior.");
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O segundo n�mero � o maior.");
		}
		else if(n3 > n1 && n3 > n2) {
			System.out.println("O terceiro n�mero � o maior.");
		}
		else {
			System.out.println("Os n�meros tem o mesmo valor.");
		}
		
		input.close();
	}

}
