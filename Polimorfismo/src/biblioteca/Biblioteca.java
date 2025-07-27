package biblioteca;

public class Biblioteca {

	public static void main(String[] args) {
		Livro ACulpaEDasEstrelas = new Livro("A culpa é das estrelas", 0);
		ACulpaEDasEstrelas.reserva(24);
		
		Revista Vogue = new Revista ("Vogue", 46);
		Vogue.reserva(1);
		
		ACulpaEDasEstrelas.consulta();
		ACulpaEDasEstrelas.consulta(2);
		ACulpaEDasEstrelas.consulta(1, 14, 15);
		ACulpaEDasEstrelas.consulta(5, 10, 12, 30);
		
		Vogue.consulta();
		Vogue.consulta(4);
		Vogue.consulta(3,13,14);
		Vogue.consulta(6,13,14,21);
		
	}

}
