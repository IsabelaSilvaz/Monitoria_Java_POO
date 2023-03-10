package monitoriaJava;

public class Retangulo {
	private String cor;
	private double largura;
	private double altura;
	private double perimetro;
	private double area;
	/* Declaração dos atributos da classe Retângulo, utilizando o modificador de acesso PRIVATE */
	
	public Retangulo() {
		this.cor = "Branco";
		this.altura = 1;
		this.largura = 1;		
	}
	
	/* Foi realizada a criação do construtor padrão do retângulo. Os valores padrões do retângulo será:
	 * Altura = 1; Largura = 1; Cor = "Branco";
	 * O construtor padrão é aquele que não recebe parâmetros, ou seja, não irá precisar receber nenhuma informação*/
	
	public Retangulo(String cor, double largura, double altura) {
		this.cor = cor;
		this.largura = largura;
		this.altura = altura;
	}
	
	/*Também foi feito o construtor que irá pegar as informações, são elas: A cor, largura e altura.
	 *Caso não queira criar um retângulo PADRÃO, por meio deste construtor terá a opção de criar um retângulo 
	 *com suas informações especificadas */

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
	
	/*Criação dos getters e setters dos atributos da Classe Retângulo*/
	
	public double calcularPerimetro() {
		this.perimetro = (2*(this.altura + this.largura));
		return perimetro;
	}
	
	/*Criação de um método para calcular o perímetro do retângulo. Ao ser chamado o método na aplicação, ele irá retornar o valor 
	 *do seu perimetro, cujo sua variável é do tipo DOUBLE.
	 *O perímetro de um retângulo é calculado pela fórmula = 2 vezes(altura+largura).
	 *OBS: O Método CalcularPerimetro está utilizando o modificador de acesso PÚBLICO, ou seja, o seu acesso é livre para todos*/
	
	public double calcularArea() {
		this.area = (this.altura*this.largura);
		return area;
	}
	
	/*Criação de um método para calcular a área do retângulo. Ao ser chamado o método na aplicação, ele irá retornar o valor
	 *da sua área, cujo sua variável é do tipo DOUBLE.
	 *A área de um retângulo é calculado pela fórmula = (altura Vezes largura.
	 *OBS: O Método CalcularArea está utilizando o modificador de acesso PÚBLICO, ou seja, o seu acesso é livre para todos*/
	 
}

