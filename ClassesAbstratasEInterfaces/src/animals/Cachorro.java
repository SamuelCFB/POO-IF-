package animals;
import animalAbstractions.Mamifero;
import animalAbstractions.AnimalDomesticado;
import animalAbstractions.AnimalEstimacao;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
	private String raca;
	private int tamanho;//em cm
	
	public String getRaca() {
		return raca;
	}
	public int getTamanho() {
		return tamanho;
	}

	@Override
	public String emitirSom() {
		return "auau";
	}
	
	@Override
	public String amamentar() {
		return "glup-glup";
	}
	
	@Override
	public void alimentar() {
		System.out.println("Cachorro bem alimentado");
	}
	
	@Override
	public void levarVeterinario() {
		System.out.println("Seu cachorro está em ótimo estado");
	}
	
	@Override
	public void chamarVeterinario() {
		System.out.println("Chamando o veterinário para o cachorro " + getNome() + "...");
	}

	@Override
	public void brincar() {
		System.out.println("tsc-tsc");//muxoxo
	}

	@Override
	public void levarPassear() {
		System.out.println("Passeando com o cachorro " + getNome() + "...");
	}
	
	public Cachorro(String nome, String raca, int tamanho) {
		setNome(nome);
		this.raca = raca;
		this.tamanho = tamanho;
	}
}
