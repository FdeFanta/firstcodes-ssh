package Cadastro;

public class Usuario extends Usuariobk {
	private int telefone;
	
	public Usuario(String nome, int idade, char genero, int telefone) {
		super(nome, idade, genero, telefone);
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
