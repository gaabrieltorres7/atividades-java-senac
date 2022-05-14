package application;
import java.util.Scanner;
public class Program_equipamento {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Id.....: ");
		int id = scanner.nextInt();
		System.out.print("Modelo : ");
		String modelo = scanner.next();
		
		Equipamento equipamento = new Equipamento(id, modelo);
		
		
		System.out.println("\nIdentificador: "+equipamento.getIdEquipamento());
		System.out.println("Modelo       : "+equipamento.getModelo());
		System.out.println("Temperatura  : "+equipamento.getTemperatura());
		if (equipamento.isEstado()) {
			System.out.println("Estado       : Ligado");
		}
		else {
			System.out.println("Estado       : Desligado");			
		}
		
		equipamento.ligarDesligar();  // ligado
		
		for (int i = 0; i<3; i++) {
			equipamento.aumentarTemp();			
		}

		for (int i = 0; i<5; i++) {
			equipamento.diminuirTemp();;			
		}
		System.out.println("2.2 - Temperatura atual: "+equipamento.getTemperatura());

		for (int i = 0; i<2; i++) {
			equipamento.aumentarTemp();			
		}
		System.out.println("2.3 - Temperatura atual: "+equipamento.getTemperatura());

		equipamento.ligarDesligar(); // desligado

		equipamento.aumentarTemp();
		for (int i = 0; i<2; i++) {
			equipamento.diminuirTemp();			
		}
		
		
		System.out.println("2.4 - Temperatura atual: "+equipamento.getTemperatura());
		
		equipamento.ligarDesligar();  // ligado
		
		for (int i = 0; i<8; i++) {
			equipamento.aumentarTemp();			
		}

		for (int i = 0; i<2; i++) {
			equipamento.diminuirTemp();	
		}
		equipamento.ligarDesligar();
		System.out.println("2.5 - Temperatura atual: "+equipamento.getTemperatura());
		
		scanner.close();
	}

}
