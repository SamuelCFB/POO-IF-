package pessoa;

import java.util.Scanner;

public class Pessoa {
	String nome;
	String corCabelo;
	String corOlhos;
	String nacionalidade;
	int idade;
	int altura;
	
	Scanner scanner = new Scanner(System.in);
	
	public Pessoa(String corCabelo, String corOlhos) {
		idade = 0;
		altura = 55;
		System.out.println("Dê um nome ao seu bebê: ");
		nome = scanner.nextLine();
		System.out.println("Defina a nacionalidade do seu bebê: ");
		nacionalidade = scanner.next();
	}
	
	public Pessoa(String nome, String corCabelo, String corOlhos, String nacionalidade, int idade, int altura) {
		this.nome = nome;
		this.corCabelo = corCabelo;
		this.corOlhos = corOlhos;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
	}

	public Pessoa(String corCabelo, String corOlhos, String nacionalidade, int idade, int altura) {
		nome = "desconhecido";
		this.corCabelo = corCabelo;
		this.corOlhos = corOlhos;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
	}
}
