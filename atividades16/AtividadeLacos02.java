package br.com.generation.atividades16;
import java.util.Scanner;
public class AtividadeLacos02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double n;
		int par = 0, imp = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o " + (i+1) + "� n�mero: ");
			n = input.nextDouble();

				if ((n % 2) == 0) {
					par++;
				} else {
					imp++;
				}
			
			}
			System.out.println("Quantidade de n�meros pares: " + par + "\nQuantidade de n�meros �mpares: " + imp);

		
		input.close();

	}

}
