package Application;

public class Estacionamento {
	private int codigo;
	private String nome;
	private String cidade;
	private int vagas;
	private boolean situacao;
	private float valorInicial;
	private float valorAdicional;
	private int horaFranquiaInicial;
	
	
	public Estacionamento(int codigo, String nome, String cidade, int vagas, float valorInicial, float valorAdicional,
			int horaFranquiaInicial) {
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.vagas = vagas;
		this.valorInicial = valorInicial;
		this.valorAdicional = valorAdicional;
		this.horaFranquiaInicial = horaFranquiaInicial;
		this.situacao = false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getVagas() {
		return vagas;
	}

	public void setVagas(int vagas) {
		this.vagas = vagas;
	}

	public float getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(float valorInicial) {
		this.valorInicial = valorInicial;
	}

	public float getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public int getHoraFranquiaInicial() {
		return horaFranquiaInicial;
	}

	public void setHoraFranquiaInicial(int horaFranquiaInicial) {
		this.horaFranquiaInicial = horaFranquiaInicial;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void ativar() {
		if(this.situacao != true) {
			this.situacao = true;	
		}
	}
	
	public void desativar() {
		if(this.situacao != false) {
			this.situacao = false;	
		}
	}

	
	public String toString() {
		return "\ncódigo do estacionamento= " + codigo + "\nnome = " + nome + "\ncidade = " + cidade + "\nvagas = " + vagas
				+ "\nsituacao = " + situacao + "\nvalor inicial = " + valorInicial + "\nvalor adicional = " + valorAdicional
				+ "\nhoraFranquiaInicial = " + horaFranquiaInicial;
	}
	
}