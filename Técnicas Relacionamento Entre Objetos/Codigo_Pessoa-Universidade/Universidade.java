package unit;

public class Universidade {
	//Declara��o dos atributos da classe Universidade
	private int idUniversidade;
	private String nome;
	
	//Cria��o do construtor. Todos os atributos foram passados no par�metro
	public Universidade(int idUniversidade, String nome) {
		this.idUniversidade = idUniversidade;
		this.nome = nome;
	}
	
	//Getter e setters dos atributos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdUniversidade() {
		return idUniversidade;
	} //O id n�o pode ter SET
	
	
}
