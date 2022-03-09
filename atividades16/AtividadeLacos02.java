package br.com.generation.atividades16;
import java.util.Scanner;
public class AtividadeLacos02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double n;
		int par = 0, imp = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o " + (i+1) + "º número: ");
			n = input.nextDouble();

				if ((n % 2) == 0) {
					par++;
				} else {
					imp++;
				}
			
			}
			System.out.println("Quantidade de números pares: " + par + "\nQuantidade de números ímpares: " + imp);

		
		input.close();

	}

}
