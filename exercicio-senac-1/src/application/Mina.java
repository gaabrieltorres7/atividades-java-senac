package application;

public class Mina {
	
	protected int idMina;
	protected String minerio;
	protected int estoque;
	
	
	protected void registrarProducao(int qtde) {
		estoque = estoque + qtde;
		
	}
	
	protected void registrarEscoamento(int qtde) {
		estoque = estoque - qtde;
	}
	
	public String toString () {
		return	"Id: " + idMina +
				"\nMinério produzido: " + minerio +
				"\nEstoque atual da mina: " + estoque + "\n";
	}
}
