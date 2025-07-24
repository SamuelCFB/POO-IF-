package br.com.samuel.atividadePOO.Herança;

public class Humano extends SerVivo{
	private String etnia;
	private String nacionalidade;
	private String tipoSangue;
	private String fatorRh;
	private int idade;
	
	public String getEtnia(){
		return this.etnia;
	}
	
	public void setEtnia(String etnia){
		this.etnia = etnia;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public void setNacionalidade(String nacionalidade){
		this.nacionalidade = nacionalidade;
	}
	
	public String getSangue(){
		return this.tipoSangue + this.fatorRh;
	}
	
	public void setSangue(String tipoSangue,String fatorRh){
		this.tipoSangue = tipoSangue;
		this.fatorRh = fatorRh;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public void getInfoHum() {
		System.out.println("--------------CARACTERÍSTICAS--------------");
		System.out.println("NOME: \u001B[32m" + getNome());
		System.out.println("\u001B[0mETNIA: \u001B[32m" + getNome());
		System.out.println("\u001B[0mNACIONALIDADE: \u001B[32m" + getNacionalidade());
		System.out.println("\u001B[0mSANGUE: \u001B[32m" + getSangue());
		System.out.println("\u001B[0mIDADE ATUAL: \u001B[32m" + getIdade() + "\u001B[0m \n");
		try { Thread.sleep(1000); } catch (InterruptedException e){}
	}
	
	public Humano(String nome, String etnia, String nacionalidade, String tipoSangue, String fatorRh, int idade) {
		super(nome, "Animalia", "Homo", "sapiens");
		
		setEtnia(etnia);
		setNacionalidade(nacionalidade);
		setSangue(tipoSangue, fatorRh);
		setIdade(idade);
		getInfoHum();
	}
	
	public Humano(String etnia, String nacionalidade, String tipoSangue, String fatorRh, int idade) {		
		super("Animalia", "Homo", "sapiens"); 
		
		setEtnia(etnia);
		setNacionalidade(nacionalidade);
		setSangue(tipoSangue, fatorRh);
		setIdade(idade);
		getInfoHum();
	}
}