package br.com.generation.atividades15;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		�mpar exiba o n�mero elevado ao quadrado.*/

		Scanner input = new Scanner(System.in);
		int n, p;
		double rq;
		
		System.out.println("Informe um n�mero para saber se ele � par ou �mpar: ");
		n = input.nextInt();
		
		if(n % 2 == 0) {
			rq = Math.sqrt(n);
			System.out.println("O n�mero " + n + " � par." +
			"\nSua ra�z quadrada �: " + rq);
		}
		else {
			p = n * n;
			System.out.println("O n�mero " + n + " � �mpar." +
			"\nSeu valor elevado ao quadrado �: " + p);
		}
		input.close();
	} 

}
