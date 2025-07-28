package animals;

import animalAbstractions.Mamifero;
import animalAbstractions.AnimalDomesticado;
import animalAbstractions.AnimalEstimacao;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao{
	private String raca;
	
	public String getRaca() {
		return raca;
	}

	@Override
	public String emitirSom() {
		return "miau";
	}
	
	@Override
	public String amamentar() {
		return "glup-glup";
	}
	
	@Override
	public void alimentar() {
		System.out.println("Gato bem alimentado");
	}
	
	@Override
	public void levarVeterinario() {
		System.out.println("Seu gato está em ótimo estado");
	}
	
	@Override
	public void chamarVeterinario() {
		System.out.println("Chamando o veterinário para o gato " + getNome() + "...");
	}

	@Override
	public void brincar() {
		System.out.println("psi-psi");
	}

	@Override
	public void levarPassear() {
		System.out.println("Passeando com o gato " + getNome() + "...");
	}

	public Gato(String nome, String raca) {
		setNome(nome);
		this.raca = raca;
	}
	
	
}
