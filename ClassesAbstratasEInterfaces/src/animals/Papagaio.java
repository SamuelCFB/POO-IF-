package animals;

import animalAbstractions.Ave;

public class Papagaio extends Ave {
	@Override
	public String emitirSom() {
		return "cricri";
	}

	@Override
	public String voar() {
		return "flap-flap";
	}
	
	Papagaio(String nome) {
		setNome(nome);
	}
}
