package lab13;

public class ThreadNaoSincronizada {

	public static void main(String[] args) {
	
	new ImprimeStringsThread("Voce ", " aqui ?");
	new ImprimeStringsThread("Muito bem ", "obrigado!");
	new ImprimeStringsThread("Como voce ", " esta?");
	}
}
