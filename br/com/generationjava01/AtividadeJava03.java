package br.com.generationjava01;

import java.util.Scanner;

public class AtividadeJava03 {

	public static void main(String[] args) {
	
	int horas, minutos, segundos;
	Scanner input = new Scanner(System.in);
	
	
	System.out.println("Informa a duração de um evento.");
	System.out.println("Informe o tempo em segundos: ");
	segundos = input.nextInt();
	
	horas = segundos / 3600;
	minutos = (segundos % 3600) / 60;
	segundos = (segundos % 3600) % 60;
	
	System.out.println("\nO tempo do evento é de: "+horas+" hora(s) "+minutos+" minuto(s) e "+segundos+" segundo(s).");
		
	input.close();
	}

}
