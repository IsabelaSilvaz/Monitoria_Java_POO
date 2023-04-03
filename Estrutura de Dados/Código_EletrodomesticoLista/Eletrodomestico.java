package monitoriaJava;

public class Eletrodomestico {
	//DECLARA��O DOS ATRIBUTOS DA CLASSE ELETRODOM�STICO
	private int codigo;
	private String nome;
	private float potencia;
	private float tempUtilizacaoDiaria;
	
	//CRIA��O DO CONSTRUTOR ESPEC�FICO (COM PAR�METROS)
	public Eletrodomestico(int codigo, String nome, float potencia, float tempUtilizacaoDiaria) {
		this.codigo = codigo;
		this.nome = nome;
		this.potencia = potencia;
		this.tempUtilizacaoDiaria = tempUtilizacaoDiaria;
	}
	
	//M�TODOS GETTERS E SETTERS
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
	
	//CRIA��O DAS OPERA��ES/M�TODOS DA CLASSE ELETRODOM�STICO
	
	public float wattsPorDia() {
		return(this.potencia*this.tempUtilizacaoDiaria);
	}
	/*O m�todo wattsPorDia retorna um valor FLOAT, o seu c�lculo �:
	 *A pot�ncia vezes o tempo de utiliza��o di�ria*/
	
	public float wattsPorMes() {
		return(wattsPorDia()*30);
	}
	/*O m�todo wattsPorMes retorna um valor FLOAT, o seu c�lculo �:
	 *O valor do wattsPorDia vezes 30*/
	
	public float wattsPorAno() {
		return(wattsPorMes()*12);
	}
	/*O m�todo wattsPorAno retorna um valor FLOAT, o seu c�lculo �:
	 *O valor do wattsPorMes vezes 12*/
	
	public float gastoMes(float precoKwatts) {
		return((wattsPorMes()/1000)*precoKwatts);
	}
	/*O m�todo gastoMes retorna um valor FLOAT e recebe um par�metro chamado precoKwatts, o seu c�lculo �:
	 *O valor do (wattsPorMes dividido por 1000) vezes o precoKwatts (o pre�o vai ser recebido via par�metro)*/
	
	
}
