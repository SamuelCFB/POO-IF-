package biblioteca;

public class Livro extends ItenBiblioteca {

	@Override
	public void reserva(int diaDaReserva) {
		setDiaDaReserva(diaDaReserva);
		setFimDaReserva(diaDaReserva + 7);
		if (getFimDaReserva() > 30) {
			setFimDaReserva(getFimDaReserva() - 30);
		}
		System.out.println("Livro \"" + getTitulo() + "\" reservado no dia " + getDiaDaReserva() + ".");
		System.out.println("Devolva no dia " + getFimDaReserva() + ".");
	}

	@Override
	public void consulta() {
		System.out.println("Você está lendo o livro " + getTitulo() + ".");
	}
	
	public void consulta(int sala) {
		System.out.println("Sala " + sala + " reservada para ler o livro " + getTitulo());
	}

	
	public void consulta(int inicioDaRes, int fimDaRes, int sala) {
		System.out.println("Sala " + sala + " reservada das " + inicioDaRes + " ás " + fimDaRes + " para ler o livro "
				+ getTitulo() + ".");
	}

	public void consulta(int sala, int inicioDaRes, int fimDaRes, int diaDaReserva) {
		System.out.println("Sala " + sala + " reservada das " + inicioDaRes + " ás " + fimDaRes + " do dia "
				+ diaDaReserva + " para ler o livro " + getTitulo() + ".");
	}

	public Livro(String titulo, int volume) {
		super(titulo, volume);
	}
}
