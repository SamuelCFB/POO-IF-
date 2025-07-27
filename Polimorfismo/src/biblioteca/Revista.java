package biblioteca;

public class Revista extends ItenBiblioteca {

	@Override
	public void reserva(int diaDaReserva) {
		setDiaDaReserva(diaDaReserva);
		setFimDaReserva(diaDaReserva + 4);
		if (getFimDaReserva() > 30) {
			setFimDaReserva(getFimDaReserva() - 30);
		}
		System.out.println("Revista \"" + getTitulo() + "\" reservado no dia " + getDiaDaReserva() + ".");
		System.out.println("Devolva no dia " + getFimDaReserva() + ".");
	}

	@Override
	public void consulta() {
		System.out.println("Você está lendo a revista " + getTitulo() + ".");
	}
	
	public void consulta(int sala) {
		System.out.println("Sala " + sala + " reservada para ler a revista " + getTitulo());
	}
	
	public void consulta(int inicioDaRes, int fimDaRes, int sala) {
		System.out.println("Sala " + sala + " reservada das " + inicioDaRes + " ás " + fimDaRes + " para ler a revista "
				+ getTitulo() + ".");
	}

	public void consulta(int sala, int inicioDaRes, int fimDaRes, int diaDaReserva) {
		System.out.println("Sala " + sala + " reservada das " + inicioDaRes + " ás " + fimDaRes + " do dia "
				+ diaDaReserva + " para ler a revista " + getTitulo() + ".");
	}

	public Revista(String titulo, int volume) {
		super(titulo, volume);
	}

}
