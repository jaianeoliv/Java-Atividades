package br.com.generationjava01;
import java.util.Scanner;

public class AtividadeJava05 {

	public static void main(String[] args) {
	
	float n1, n2, n3, media;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informa a média de uma nota ponderada.");
	System.out.println("\nDigite a primeira nota: ");
	n1 = input.nextFloat();
	System.out.println("Digite a segunda nota: ");
	n2 = input.nextFloat();
	System.out.println("Digite a terceira nota: ");
	n3 = input.nextFloat();
	
	media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
	
	System.out.println("O resultado da média ponderada é: " + media);
	
	input.close();
	}

}
