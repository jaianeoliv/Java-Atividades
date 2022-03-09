package br.com.generation.atividades16;
import java.util.Scanner;
public class AtividadeVetor01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] notas = new double[5];
		double maiorN = 0.0;
			
		for(int i = 0; i < notas.length; i++){
			System.out.print("Insira a nota da " + (i+1) + "ª atividade: ");
			notas[i]= input.nextDouble();
			
			if(notas[i] > maiorN) {
				maiorN = notas[i];
			}
			
		}
			for(double i = 0; i < notas.length; i++) {

				System.out.print( notas[(int) i] + " | ");
			}
			System.out.println("\nA maior nota foi: " + maiorN);
			
			input.close();
		}
		
		
	
	}


