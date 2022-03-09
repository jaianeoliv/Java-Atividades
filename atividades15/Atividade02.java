package br.com.generation.atividades15;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite três números para visualizar em ordem crescente: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if(a < b) {
			if(b < c) {
				System.out.println(a + " - " + b + " - " + c);
			}
			else if(a < c) {
				System.out.println(a + " - " + c + " - " + b);
			} else {
				System.out.println(c + " - " + a + " - " + b);
			}
			
		}
		else if(b < c) {
			if(a < c) {
				System.out.println(b+" - "+a+" - "+c);
			} else {
				System.out.println(b+" - "+c+" - "+a);
			}
		} else {
			System.out.println(c + " - "+b+" - "+a);
		}
		
		input.close();
	} 

}
