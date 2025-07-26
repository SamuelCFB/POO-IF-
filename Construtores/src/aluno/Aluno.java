package aluno;

import java.util.Scanner;

public class Aluno {
	String escola;
	String nome;
	int matricula;
	int ano;
	int idade;
	
	Scanner scanner = new Scanner(System.in);
	
	Aluno(){
		escola = "IFCE";
		
		System.out.print("Nome do aluno: ");
		nome = scanner.next();
		
		System.out.print("Matrícula: ");
		matricula = scanner.nextInt();
		
		System.out.print("Ano: ");
		ano = scanner.nextInt();
		
		System.out.print("Idade: ");
		idade = scanner.nextInt();
		
		System.out.println("Aluno " + nome + " matriculado no colégio " + escola + ", registrado como " + matricula + ", no ano " + ano + " e tem " + idade + "anos.");

	}
	
	Aluno(String escola){
		System.out.print("Nome do aluno: ");
		nome = scanner.next();
		
		System.out.print("Matrícula: ");
		matricula = scanner.nextInt();
		
		System.out.print("Ano: ");
		ano = scanner.nextInt();
		
		System.out.print("Idade: ");
		idade = scanner.nextInt();
		
		System.out.println("Aluno " + nome + " matriculado no colégio " + escola + ", registrado como " + matricula + ", no ano " + ano + " e tem " + idade + "anos.");
	}
	
	Aluno(String escola, String nome, int matricula, int ano, int idade){
		this.escola = escola;
		this.nome = nome;
		this.matricula = matricula;
		this.ano = ano;
		this.idade = idade;
		
		System.out.println("Aluno " + nome + " matriculado no colégio " + escola + ", registrado como " + matricula + ", no ano " + ano + " e tem " + idade + "anos.");
	}
}


