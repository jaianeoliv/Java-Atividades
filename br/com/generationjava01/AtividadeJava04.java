package br.com.generationjava01;

import java.util.Scanner;

public class AtividadeJava04 {

	public static void main(String[] args) {
		
	int a = 0, b = 0, c = 0, d, r, s;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informa o valor de um produto not�vel.");
	System.out.println("Digite o primeiro n�mero: ");
	a = input.nextInt();
	System.out.println("Digite o segundo n�mero: ");
	b = input.nextInt();
	System.out.println("Digite o terceiro n�mero: ");
	c = input.nextInt();
	
	r = (a + b) * (a + b);
	s = (b + c) * (b + c);
	d = (r + s) / 2;
	
	System.out.println("O resultado do produto not�vel �: " + d);
	
	input.close();
	}
	
}
