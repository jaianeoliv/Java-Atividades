package br.com.generation.atividades15;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int id = 0;
		
		System.out.println("Insira sua idade e veja sua categoria adequada: ");
		id = input.nextInt();
		
		if(id < 10 || id > 25) {
				System.out.println("Infelizmente com " + id + " anos voc� n�o se encaixa em uma das tr�s categorias!");
		}
			
		else if(id >= 10 && id <= 14) {
			System.out.println("Com " + id + " anos, voc� entra na categoria Infantil!");
		}
		
		else if(id >= 15 && id <= 17) {
			System.out.println("Com " + id + " anos, voc� entra na categoria Juvenil!");
		}
		else if(id >= 18 && id <= 25) {
			System.out.println("Com " + id + " anos, voc� entra na categoria Adulto!");
		}		
		input.close();
	}
		
	}


