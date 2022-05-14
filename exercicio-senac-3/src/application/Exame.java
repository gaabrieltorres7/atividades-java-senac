package application;

public class Exame {
	private int idExame;
	private String tipoExame;
	private int nivelGlicose;
	
	public Exame (int idExame, String tipoExame, int nivelGlicose) {
		this.idExame = idExame;
		this.tipoExame = tipoExame;
		this.nivelGlicose = nivelGlicose;
		
	}
	
	public String obterDiagnostico() {
		if (this.nivelGlicose < 100) {
			return "Normal";
		}else if (this.nivelGlicose < 126){
			return "Pré-diabetes"; 
		}else {
			return "Diabetes";
		}
	}
	
	public int getIdExame() {
		return idExame;
	}
	
	public String getTipoExame() {
		return tipoExame;
	}
	
	public void setTipoExame(String tipoExame) {
		this.tipoExame = tipoExame;
	}
	
	public int getNivelGlicose() {
		return nivelGlicose;
	}
	
	public void setNivelGlicose(int nivelGlicose) {
		this.nivelGlicose = nivelGlicose;
	}
	

}
