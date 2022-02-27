package br.com.generationjava01;

import java.util.Scanner;

public class AtividadeJava02 {
	
	public static void main(String[] args) {
		
	int iEmAnos=0, iEmMeses=0, iEmDias;
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Informa a idade em anos, meses e dias.");
	
	System.out.println("Digite sua idade em dias: ");
	iEmDias = input.nextInt();
	
	iEmAnos = iEmDias / 365;
	iEmMeses = (iEmDias % 365) / 30;
	iEmDias = (iEmDias % 365) % 30;
	
	System.out.println("\nSua idade em anos: "+iEmAnos+"\nEm meses: "+iEmMeses+"\nEm dias: "+iEmDias);
	
	input.close();
	}

}
