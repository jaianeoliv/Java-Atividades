package br.com.generation.atividades15;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int id = 0;
		
		System.out.println("Insira sua idade e veja sua categoria adequada: ");
		id = input.nextInt();
		
		if(id < 10 || id > 25) {
				System.out.println("Infelizmente com " + id + " anos você não se encaixa em uma das três categorias!");
		}
			
		else if(id >= 10 && id <= 14) {
			System.out.println("Com " + id + " anos, você entra na categoria Infantil!");
		}
		
		else if(id >= 15 && id <= 17) {
			System.out.println("Com " + id + " anos, você entra na categoria Juvenil!");
		}
		else if(id >= 18 && id <= 25) {
			System.out.println("Com " + id + " anos, você entra na categoria Adulto!");
		}		
		input.close();
	}
		
	}


