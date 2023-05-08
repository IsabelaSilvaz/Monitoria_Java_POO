package unit;

import java.util.Date; //import da DATA. � necess�rio importar para o atributo do tipo DATE funcionar. 

public class Pessoa {
	private int idPessoa;
	private String nome;
	private Date dataNasc;
	private String telefone;
	private Universidade universidade;
	/*Declara��o dos atributos da classe Pessoa e realizando a associa��o com a classe Universidade*/
	
	public Pessoa(int idPessoa, String nome, Date dataNasc, String telefone, Universidade universidade) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.universidade = universidade; //foi colocado no construtor o atributo "universidade" que � do tipo Universidade (Classe)
	}
	
	/*Cria��o do construtor com o mesmo nome da classe "Pessoa"
	 *Todos os atributos foram passados como par�metro*/

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
	} /*OBS: � necess�rio utilizar o GET para o atributo "universidade", � com o GET que iremos acessar o dado
			da universidade que a pessoa est� associada!*/
	
	
	/*Getters e Setters dos atributos da classe Pessoa
	 *O idPessoa � um c�digo �nico, n�o pode ser alterado, por isso n�o foi colocado
	 *o m�todo Setter*/
	
	
}
