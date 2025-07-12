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
	
	public void setEtinia(String etnia){
		this.etnia = etnia;
	}
	
	public String getNome(){
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
	
	Humano(String nome) {
		super(nome);
		setReino("Animalia");
		setGenero("Homo");
		setEpitetoEsp("sapiens");
	}
	Humano() {
		System.out.println("Seres Humanos devem ter um nome:");
		setNome(scan.nextLine());
		setReino("Animalia");
		setGenero("Homo");
		setEpitetoEsp("sapiens");
	}

}