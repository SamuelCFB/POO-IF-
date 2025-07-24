package br.com.samuel.atividadePOO.Herança;

import java.util.Scanner;

public class SerVivo {
	private String nomeClasse;
	private String nome;
	private String reino;
	private String genero;
	private String epitetoEsp;
	
	Scanner scan = new Scanner(System.in);
	
	public String getNomeClasse() {
		return this.nomeClasse;
	}
	
	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getReino() {
		return this.reino;
	}
	
	public String getGenero(){
		return this.genero;
	}
	
	public String getEpitetoEsp() {
		return this.epitetoEsp;
	}
	
	public void setClassBiologica(String reino, String genero, String epitetoEsp) {
		this.reino = reino;
		this.genero = genero;
		this.epitetoEsp = epitetoEsp;
	}
	
	public void getInfoSerVivo() {
		System.out.println("Um ser vido do reino " + reino + ", nome científico " + genero + " " + epitetoEsp + " e nome popular " + getClass().getSimpleName().toLowerCase() + " foi criado:");
		try { Thread.sleep(1500); } catch (InterruptedException e) {}
	}
	
	public SerVivo(String nome, String reino, String genero, String epitetoEsp) {
		this.nome = nome;
		setClassBiologica(reino, genero, epitetoEsp);
		getInfoSerVivo();
	}
	
	public SerVivo(String reino, String genero, String epitetoEsp) {
		setClassBiologica(reino, genero, epitetoEsp);
		nomeClasse = getClass().getSimpleName();
		if (nomeClasse.equals("Humano")) {
			System.out.println("Seres Humanos devem ter um nome:");
			nome = scan.nextLine();
		} else {
			this.nome = "N/H";
		}
		getInfoSerVivo();
	}
};