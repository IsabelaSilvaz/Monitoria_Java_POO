package monitoriaJava;

public class Retangulo {
	private String cor;
	private double largura;
	private double altura;
	private double perimetro;
	private double area;
	/* Declara��o dos atributos da classe Ret�ngulo, utilizando o modificador de acesso PRIVATE */
	
	public Retangulo() {
		this.cor = "Branco";
		this.altura = 1;
		this.largura = 1;		
	}
	
	/* Foi realizada a cria��o do construtor padr�o do ret�ngulo. Os valores padr�es do ret�ngulo ser�:
	 * Altura = 1; Largura = 1; Cor = "Branco";
	 * O construtor padr�o � aquele que n�o recebe par�metros, ou seja, n�o ir� precisar receber nenhuma informa��o*/
	
	public Retangulo(String cor, double largura, double altura) {
		this.cor = cor;
		this.largura = largura;
		this.altura = altura;
	}
	
	/*Tamb�m foi feito o construtor que ir� pegar as informa��es, s�o elas: A cor, largura e altura.
	 *Caso n�o queira criar um ret�ngulo PADR�O, por meio deste construtor ter� a op��o de criar um ret�ngulo 
	 *com suas informa��es especificadas */

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public double getArea() {
		return area;
	}
	
	/*Cria��o dos getters e setters dos atributos da Classe Ret�ngulo*/
	
	public double calcularPerimetro() {
		this.perimetro = (2*(this.altura + this.largura));
		return perimetro;
	}
	
	/*Cria��o de um m�todo para calcular o per�metro do ret�ngulo. Ao ser chamado o m�todo na aplica��o, ele ir� retornar o valor 
	 *do seu perimetro, cujo sua vari�vel � do tipo DOUBLE.
	 *O per�metro de um ret�ngulo � calculado pela f�rmula = 2 vezes(altura+largura).
	 *OBS: O M�todo CalcularPerimetro est� utilizando o modificador de acesso P�BLICO, ou seja, o seu acesso � livre para todos*/
	
	public double calcularArea() {
		this.area = (this.altura*this.largura);
		return area;
	}
	
	/*Cria��o de um m�todo para calcular a �rea do ret�ngulo. Ao ser chamado o m�todo na aplica��o, ele ir� retornar o valor
	 *da sua �rea, cujo sua vari�vel � do tipo DOUBLE.
	 *A �rea de um ret�ngulo � calculado pela f�rmula = (altura Vezes largura.
	 *OBS: O M�todo CalcularArea est� utilizando o modificador de acesso P�BLICO, ou seja, o seu acesso � livre para todos*/
	 
}

