import java.util.Locale;


public class Imprimindo {

	public static void main(String[] args) {
		
		double x = 10.35784;
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		
		System.out.println(x);
		System.out.printf("%.3f%n", x);//printf pega o formato do computador.
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", x);
		System.out.println("RESULTADO = " + x + " METROS" );
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		

	}

}
