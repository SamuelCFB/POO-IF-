package animals;

import animalAbstractions.Mamifero;
import animalAbstractions.AnimalDomesticado;

public class Cavalo extends Mamifero implements AnimalDomesticado{
	@Override
	public String emitirSom() {
		return "Iiirrrrí";
	}
	
	@Override
	public String amamentar() {
		return "glup-glup";
	}
	
	@Override
	public void alimentar() {
		System.out.println("Cavalo bem alimentado");
	}
	
	@Override
	public void levarVeterinario() {
		System.out.println("Seu cavalo está em ótimo estado");
	}
	
	@Override
	public void chamarVeterinario() {
		System.out.println("Chamando o veterinário para o cavalo" + getNome() + "...");
	}
	
	Cavalo(String nome) {
		setNome(nome);
	}
}
