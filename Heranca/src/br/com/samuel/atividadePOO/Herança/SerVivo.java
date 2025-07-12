package br.com.samuel.atividadePOO.Herança;

import java.util.Scanner;

public class SerVivo {
	private String nome;
	private String reino;
	private String genero;
	private String epitetoEsp;
	private String fase;//Fase da vida(larval, bebê, completamente matura...)
	
	Scanner scan = new Scanner(System.in);
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getReino(){
		return this.reino;
	}
	
	public void setReino(String reino){
		this.reino = reino;
	}
	
	public String getGenero(){
		return this.genero;
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}
	
	public String getEpitetoEsp(){
		return this.epitetoEsp;
	}
	
	public void setEpitetoEsp(String epitetoEsp){
		this.epitetoEsp = epitetoEsp;
	}
	
	public String getFase(){
		return this.fase;
	}
	
	public void setFase(String fase){
		this.fase = fase;
	}
	
	public SerVivo(String nome) {
		this.nome = nome;
	}
	
	public SerVivo() {
		
	}
}