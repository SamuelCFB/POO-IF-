package carro;

import java.util.Scanner;

public class Carro {
	String placa;
	String marca;
	String modelo;
	String cor;
	String tipoCombustivel;
	int ano;
	int acentos;
	
	Scanner scanner = new Scanner(System.in);
	
	Carro(){
		System.out.println("--------CRIANDO CARRO--------");
		System.out.print("Placa: ");
		placa = scanner.next();
		
		System.out.print("Marca: ");
		marca = scanner.next();
		
		System.out.print("Modelo: ");
		modelo = scanner.next();
		
		System.out.print("Ano: ");
		ano = scanner.nextInt();
		
		System.out.print("Cor: ");
		cor = scanner.next();
		
		System.out.print("Tipo de combustível: ");
		tipoCombustivel = scanner.next();
		
		System.out.print("Número de acentos: ");
		acentos = scanner.nextInt();
		
		System.out.print("Carro da marca " + marca + ", modelo " + modelo + ", cor " + cor + " e do ano " + ano + " foi criada com sucesso.\nO tipo de combusível do carro é " + tipoCombustivel + " e tem " + acentos + " acentos.");
	}
	
	Carro(String placa, String marca, String modelo, String cor, int ano){
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		
		tipoCombustivel = "gasolina";
		acentos = 4;
		
		System.out.print("Carro da marca " + marca + ", modelo " + modelo + ", cor " + cor + " e do ano " + ano + " foi criada com sucesso.\nO tipo de combusível do carro é " + tipoCombustivel + " e tem " + acentos + " acentos.");
	}
	
	Carro(String placa, String marca, String modelo, String cor, String tipoCombustivel, int ano, int acentos){
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.tipoCombustivel = tipoCombustivel;
		this.ano = ano;
		this.acentos = acentos;
		System.out.print("Carro da marca " + marca + ", modelo " + modelo + ", cor " + cor + " e do ano " + ano + " foi criada com sucesso.\nO tipo de combusível do carro é " + tipoCombustivel + " e tem " + acentos + " acentos.");
		
	}
}
