package application;

public class Equipamento {
	private int idEquipamento;
	private String modelo;
	private int temperatura;
	private boolean estado;
	
	public Equipamento(int idEquipamento, String modelo) {
		this.idEquipamento = idEquipamento;
		this.modelo = modelo;	
		// por padrão o atributo int temperatura é inicializado com 0
		// por padrão o atributo booelan estado é inicializado com false
	}
	
	
	public void ligarDesligar() {
		
		this.estado = !this.estado;
		if (this.estado) {
			this.temperatura = 80;
		}
		else
		{
			this.temperatura = 0;
		}
	}
	
	public int obterTemperatura() {
		if (this.estado) {
			return this.temperatura;			
		}
		else
		{
			return 0;
		}
	}
	
	
	public void aumentarTemp() {
		if (this.temperatura<85 && this.estado) {
			this.temperatura++;			
		}
	}
	
	public void diminuirTemp() {
		if (this.temperatura>80 && this.estado) {
			this.temperatura--;			
		}		
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getIdEquipamento() {
		return idEquipamento;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public boolean isEstado() {
		return estado;
	}

	public String toString() {
		return "ID do equipamento: " + idEquipamento + "\nModelo: " + modelo + "\nTemperatura: " + getTemperatura()
				+"°" +"\nEstado: " + estado;
	}
	
}
