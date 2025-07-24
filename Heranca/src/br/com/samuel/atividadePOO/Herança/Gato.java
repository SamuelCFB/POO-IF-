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
	
	public void getInfoGat() {
		System.out.println("--------------CARACTERÍSTICAS--------------");
		System.out.println("NOME: \u001B[32m" + getNome());
		System.out.println("\u001B[0mRAÇA: \u001B[32m" + getRaca());
		System.out.println("\u001B[0mCOR: \u001B[32m" + getCor());
		System.out.println("\u001B[0mADESTRADO: \u001B[32m" + ((getAdestrado()) ? "SIM\u001B[0m \n": "NÃO\u001B[0m \n"));
		try { Thread.sleep(1000); } catch (InterruptedException e) {};
	}
	
	public Gato(String raca, String cor) {
		super("Animalia", "Felis", "catus");
		
		setRaca(raca);
		setCor(cor);
		setAdestrado(false);
		getInfoGat();
	}
	
	public Gato(String raca, String cor, boolean adestrado, String nome) {
		super(nome, "Animalia", "Felis", "catus");
		
		setRaca(raca);
		setCor(cor);
		setAdestrado(adestrado);
		getInfoGat();
	}
}