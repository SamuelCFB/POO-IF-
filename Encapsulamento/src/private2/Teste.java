package private2;

import private1.Homem;

public class Teste {

	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Carlos");
		cavalo.setCor("marrom");
		cavalo.setAltura(100);
		
		Homem homem = new Homem();
		homem.setNome("Carlos");
		homem.setAltura(170);
		homem.setPeso(60);
	}

}
