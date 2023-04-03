package monitoriaJava;

public class Eletrodomestico {
	//DECLARAÇÃO DOS ATRIBUTOS DA CLASSE ELETRODOMÉSTICO
	private int codigo;
	private String nome;
	private float potencia;
	private float tempUtilizacaoDiaria;
	
	//CRIAÇÃO DO CONSTRUTOR ESPECÍFICO (COM PARÂMETROS)
	public Eletrodomestico(int codigo, String nome, float potencia, float tempUtilizacaoDiaria) {
		this.codigo = codigo;
		this.nome = nome;
		this.potencia = potencia;
		this.tempUtilizacaoDiaria = tempUtilizacaoDiaria;
	}
	
	//MÉTODOS GETTERS E SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getTempUtilizacaoDiaria() {
		return tempUtilizacaoDiaria;
	}

	public void setTempUtilizacaoDiaria(float tempUtilizacaoDiaria) {
		this.tempUtilizacaoDiaria = tempUtilizacaoDiaria;
	}

	public int getCodigo() {
		return codigo;
	}
	
	//CRIAÇÃO DAS OPERAÇÕES/MÉTODOS DA CLASSE ELETRODOMÉSTICO
	
	public float wattsPorDia() {
		return(this.potencia*this.tempUtilizacaoDiaria);
	}
	/*O método wattsPorDia retorna um valor FLOAT, o seu cálculo é:
	 *A potência vezes o tempo de utilização diária*/
	
	public float wattsPorMes() {
		return(wattsPorDia()*30);
	}
	/*O método wattsPorMes retorna um valor FLOAT, o seu cálculo é:
	 *O valor do wattsPorDia vezes 30*/
	
	public float wattsPorAno() {
		return(wattsPorMes()*12);
	}
	/*O método wattsPorAno retorna um valor FLOAT, o seu cálculo é:
	 *O valor do wattsPorMes vezes 12*/
	
	public float gastoMes(float precoKwatts) {
		return((wattsPorMes()/1000)*precoKwatts);
	}
	/*O método gastoMes retorna um valor FLOAT e recebe um parâmetro chamado precoKwatts, o seu cálculo é:
	 *O valor do (wattsPorMes dividido por 1000) vezes o precoKwatts (o preço vai ser recebido via parâmetro)*/
	
	
}
