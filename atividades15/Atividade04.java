package br.com.generation.atividades15;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/

		Scanner input = new Scanner(System.in);
		int n, p;
		double rq;
		
		System.out.println("Informe um número para saber se ele é par ou ímpar: ");
		n = input.nextInt();
		
		if(n % 2 == 0) {
			rq = Math.sqrt(n);
			System.out.println("O número " + n + " é par." +
			"\nSua raíz quadrada é: " + rq);
		}
		else {
			p = n * n;
			System.out.println("O número " + n + " é ímpar." +
			"\nSeu valor elevado ao quadrado é: " + p);
		}
		input.close();
	} 

}
