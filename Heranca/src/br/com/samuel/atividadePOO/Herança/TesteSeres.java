package br.com.samuel.atividadePOO.Herança;

public class TesteSeres {

	public static void main(String[] args) {
		Humano Vitor = new Humano("Vitor Emanoel", "Branco", "Chinês", "A", "-", 35);
		Humano Giulia = new Humano("Negro", "Mexicano", "AB", "+", 22);
		
		Gato gato = new Gato("viralata", "laranja");
		Gato tapioca = new Gato("viralata", "branco", true, "tapioca");
	}

}
