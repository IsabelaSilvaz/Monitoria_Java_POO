package unit;

public class Universidade {
	//Declaração dos atributos da classe Universidade
	private int idUniversidade;
	private String nome;
	
	//Criação do construtor. Todos os atributos foram passados no parâmetro
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
	} //O id não pode ter SET
	
	
}
