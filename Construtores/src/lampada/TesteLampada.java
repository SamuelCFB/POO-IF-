package lampada;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampPadrao = new Lampada();
		Lampada lampNormal = new Lampada(false, 4000, 12, 5, 1000);
		lampNormal.setBrilho(200);
		lampNormal.setTemperaturaCor(5000);
		
		Lampada lampInteligente = new Lampada(true);
		lampInteligente.setBrilho(0);
		lampInteligente.setTemperaturaCor(3000);
	}

}
