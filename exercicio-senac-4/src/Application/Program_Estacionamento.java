package Application;
import java.util.Scanner;

public class Program_Estacionamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Código: ");
		int codigo = scanner.nextInt();
		System.out.print("Nome: ");
		String nome = scanner.next();
		System.out.print("cidade: ");
		String cidade = scanner.next();
		System.out.print("vagas: ");
		int vagas = scanner.nextInt();
		System.out.print("Valor inicial: ");
		float valorInicial = scanner.nextFloat();
		System.out.print("Valor adicional: ");
		float valorAdicional = scanner.nextFloat();
		System.out.print("Hora da franquia inicial: ");
		int horaFranquiaInicial = scanner.nextInt();
		
		Estacionamento estacionamento = new Estacionamento (codigo, nome, cidade, vagas, valorInicial, valorAdicional, horaFranquiaInicial);
		estacionamento.ativar();
		
	
		System.out.println(estacionamento.toString());
		
		estacionamento.desativar();
		
		System.out.println(estacionamento.toString());
		
		
		scanner.close();
	}

}
