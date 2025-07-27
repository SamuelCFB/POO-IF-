package biblioteca;

public class ItenBiblioteca {
	private String titulo;
	private int volume;
	private boolean disponivel;
	private int diaDaReserva;
	private int fimDaReserva;

	public String getTitulo() {
		if (volume == 0) {
			return titulo;
		} else {
			return titulo + " - volume " + volume;
		}
	}

	public int getDiaDaReserva() {
		return diaDaReserva;
	}

	public void setDiaDaReserva(int diaDaReserva) {
		this.diaDaReserva = diaDaReserva;
	}

	public int getFimDaReserva() {
		return fimDaReserva;
	}

	public void setFimDaReserva(int fimDaReserva) {
		this.fimDaReserva = fimDaReserva;
	}

	public void reserva(int diaDaReserva) {
	}

	public void consulta() {
	}

	public ItenBiblioteca(String titulo, int volume) {
		this.titulo = titulo;
		this.volume = volume;
	}
}
