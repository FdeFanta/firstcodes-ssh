package Cadastro;

public class Usuariobk {
	private String nome;
	private int idade;
	private char genero;
	private int telefone;
	
	public Usuariobk(String nome, int idade, char genero, int telefone) {
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.telefone = telefone;
	}
	
@Override
public String toString() {
	return "Usuario{" + "nome=" + nome + ", idade=" + idade + ", genero=" + genero + ", telefone=" + telefone + "}";
}
public String getNome() {
	return nome;
}
public void setName(String nome) {
	this.nome = nome;
	
}
public int getIdade() {
	return idade;
	
}

public void setIdade(int idade) {
	this.idade = idade;
}

public char getGenero() {
	return genero;
}

public void setGenero(char genero) {
	this.genero = genero;
}
public void setTelefone(int telefone) {
	this.telefone = telefone;
}
public int getTelefone() {
	return telefone;
}

public void setTelefone(String nextLine) {
	// TODO Auto-generated method stub
	
}




}