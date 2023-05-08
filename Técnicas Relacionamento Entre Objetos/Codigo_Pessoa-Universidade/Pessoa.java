package unit;

import java.util.Date; //import da DATA. É necessário importar para o atributo do tipo DATE funcionar. 

public class Pessoa {
	private int idPessoa;
	private String nome;
	private Date dataNasc;
	private String telefone;
	private Universidade universidade;
	/*Declaração dos atributos da classe Pessoa e realizando a associação com a classe Universidade*/
	
	public Pessoa(int idPessoa, String nome, Date dataNasc, String telefone, Universidade universidade) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.universidade = universidade; //foi colocado no construtor o atributo "universidade" que é do tipo Universidade (Classe)
	}
	
	/*Criação do construtor com o mesmo nome da classe "Pessoa"
	 *Todos os atributos foram passados como parâmetro*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public Universidade getUniversidade() {
		return universidade;
	} /*OBS: é necessário utilizar o GET para o atributo "universidade", é com o GET que iremos acessar o dado
			da universidade que a pessoa está associada!*/
	
	
	/*Getters e Setters dos atributos da classe Pessoa
	 *O idPessoa é um código único, não pode ser alterado, por isso não foi colocado
	 *o método Setter*/
	
	
}
