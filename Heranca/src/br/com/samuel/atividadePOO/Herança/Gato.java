package br.com.samuel.atividadePOO.Herança;

public class Gato extends SerVivo{
	private String raca;
	private String cor;
	private boolean adestrado;
	
	public String getRaca(){
		return this.raca;
	}
	
	public void setRaca(String raca){
		this.raca = raca;
	}
	
	public String getCor(){
		return this.cor;
	}
	
	public void setCor(String cor){
		this.cor = cor;
	}
	
	public boolean getAdestrado(){
		return this.adestrado;
	}
	
	public void setAdestrado(boolean adestrado){
		this.adestrado = adestrado;
	}
	
	public Gato(boolean adestrado) {
		setReino("Animalia");
		setGenero("Felis");
		setEpitetoEsp("catus");
		
		
	}

}