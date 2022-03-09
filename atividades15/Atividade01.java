package br.com.generation.atividades15;

import java.util.Scanner;
		//#15 LAÇOS DE DECISÃO
public class Atividade01 {

	public static void main(String[] args) {
		
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro número: ");
		n1 = input.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = input.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = input.nextInt();
		
		if(n1 > n3 && n1 > n2) {
			System.out.println("O primeiro número é o maior.");
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O segundo número é o maior.");
		}
		else if(n3 > n1 && n3 > n2) {
			System.out.println("O terceiro número é o maior.");
		}
		else {
			System.out.println("Os números tem o mesmo valor.");
		}
		
		input.close();
	}

}
