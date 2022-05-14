package application;
import java.util.Scanner;
public class Program_Exame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Informe o ID do exame: ");
		int idExame = scanner.nextInt();
		System.out.print("Tipo do exame:");
		String tipoExame = scanner.next();
		System.out.print("Informe o n�vel de glicose: ");
		int nivelGlicose = scanner.nextInt();
		
		Exame exame = new Exame (idExame, tipoExame, nivelGlicose);
		
		System.out.println("Diagn�stico: " + exame.obterDiagnostico());
		
		scanner.close();
	}

}
