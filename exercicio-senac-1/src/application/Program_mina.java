package application;
import java.util.Scanner;

public class Program_mina {

public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	Mina mina = new Mina();
	
	System.out.print("Digite o ID da mina: ");
	mina.idMina = scanner.nextInt();
		
	System.out.print("Digite o tipo de minério que produz: ");
	mina.minerio = scanner.next();
	
	System.out.print(mina);
	
	for (int i = 0; i<3 ; i++ ) {
		System.out.printf("Digite quantos produtos foram produzidos no dia %d: ", i+1);
		int qtde = scanner.nextInt();
		mina.registrarProducao(qtde);
	}
	
	System.out.print("Digite quantos produtos foram escoados: ");
	int qtde = scanner.nextInt();
	mina.registrarEscoamento(qtde);
	
	System.out.printf("\n============================\n");
	System.out.print(mina);
	System.out.println("============================");

	scanner.close();
 }

}
