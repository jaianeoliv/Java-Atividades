package br.com.generation.atividades18;

public class TestaGeral {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguiça preg = new Preguiça();
		

		
		
		
		
		System.out.println("Cachorro");
		dog.setIdade(2);
		dog.emitirSom();
		dog.correr();
		System.out.println();
		System.out.println("Cavalo");
		cav.setIdade(3);
		cav.emitirSom();
		cav.correr();
		System.out.println();
		System.out.println("Preguiça");
		preg.setIdade(1);
		preg.emitirSom();
		preg.subirNaArvore();
		
		
		
		
	}

}
