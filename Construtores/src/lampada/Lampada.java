package lampada;

import java.util.Scanner;

public class Lampada {
	private int temperaturaCor;//Em kelvins(K)
	private int potencia;//Em wats(W)
	private int vidaUtil;//Em anos
	private int brilho;//Em lúmens(lm)
	private boolean inteligente;
	
	Scanner scanner = new Scanner(System.in);
	
	public void setTemperaturaCor(int temperaturaCor) {
		if(this.inteligente) {			
			this.temperaturaCor = temperaturaCor;
			System.out.println("Agora a cor da lâmpada é de " + temperaturaCor + "K");
		} else {
			System.out.println("A lampada não é inteligente, não é possível mudar sua cor");
		}
	}
	
	public void setBrilho(int brilho) {
		if(this.inteligente) {			
			this.brilho = brilho;
			System.out.println("Agora o brilho da lâmpada é de " + brilho + "lm");
		} else {
			System.out.println("A lampada não é inteligente, não é possível mudar seu brilho");
		}
	}
	
	public Lampada() {
		inteligente = false;
		temperaturaCor = 3500;
		potencia = 10;
		vidaUtil = 5;
		brilho = 800;
		
		System.out.println("_______________________________________________");
		System.out.println("_________________CONFIGURAÇÕES_________________");
		System.out.println("TEMPERTATURA: " + temperaturaCor + "K.");
		System.out.println("POTÊNCIA: " + potencia + "W.");
		System.out.println("VIDA ÚTIL: " + vidaUtil + " anos.");
		System.out.println("BRILHO: " + brilho + "lm.");
	}

	public Lampada(boolean inteligente, int temperaturaCor, int potencia, int vidaUtil, int brilho) {
		this.inteligente = inteligente; 
		this.temperaturaCor = temperaturaCor;
		this.potencia = potencia;
		this.vidaUtil = vidaUtil;
		this.brilho = brilho;
		
		System.out.println("_______________________________________________");
		System.out.println("_________________CONFIGURAÇÕES_________________");
		System.out.println("TEMPERTATURA: " + temperaturaCor + "K.");
		System.out.println("POTÊNCIA: " + potencia + "W.");
		System.out.println("VIDA ÚTIL: " + vidaUtil + " anos.");
		System.out.println("BRILHO: " + brilho + "lm.");
	}

	public Lampada(boolean inteligente) {
		this.inteligente = inteligente;
		
		System.out.println("_______________________________________________");
		System.out.println("_______________DEFININDO-LÂMPADA_______________");
		System.out.print("TEMPERATURA: ");
		temperaturaCor = scanner.nextInt();
		System.out.print("POTÊNCIA: ");
		potencia = scanner.nextInt();
		System.out.print("VIDA ÚTIL: ");
		vidaUtil = scanner.nextInt();
		System.out.print("BRILHO: ");
		brilho = scanner.nextInt();
	}

}