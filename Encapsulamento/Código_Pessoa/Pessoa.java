package monitoriaPOO;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private double imc;
	/*
	 * Declara��o dos atributos da classe Pessoa, utilizando o modificador de acesso
	 * PRIVATE
	 */

	public Pessoa(String nome, int idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	/*
	 * Cria��o do construtor personalizado Pessoa, onde ir� receber os
	 * argumentos/informa��es de todos os seus atributos. S�o eles: o nome, a idade,
	 * altura e peso.
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	/* Cria��o dos getters e setters de todos os atributos da Classe Pessoa */

	public double calcularIMC() {
		this.imc = peso / (altura * altura);
		return imc;
	}
	/*Cria��o do m�todo calcularIMC, que vai calcular o �ndice de massa corporal, cuja f�rmula:
	 * peso dividido pela (altura ao quadrado). 
	 * Ap�s calcular, ir� retornar o valor do IMC, que � do tipo DOUBLE*/

	public String classificarIMC() {
	    if (imc < 18.5) {
			return "Abaixo do peso";
			
		} else if ((imc >= 18.5) && (imc < 25)) {
			return "Peso normal";
			
		} else if ((imc >= 25) && (imc < 30)) {
			return "Sobrepeso";
			
		} else if ((imc >= 30) && (imc < 35)) {
		    return "Obesidade grau 1";
		    
		} else if ((imc >= 35) && (imc < 40)) {
			return "Obesidade grau 2";
		} else {
			return "Obesidade grau 3";
		}
	}
	
	/*Cria��o do m�todo classificarIMC, que vai retornar a classifica��o do Imc. Foi utilizado a condi��o 
	 * "IF (Se)" para classificar o imc corretamente de acordo com os valores.
	 * Abaixo do peso: IMC menor que 18,5;
	 * Peso normal: IMC entre 18,5 e 24,9;
	 * Sobrepeso: IMC entre 25 e 29,9;
	 * Obesidade grau 1: IMC entre 30 e 34,9;
	 * Obesidade grau 2: IMC entre 35 e 39,9 */
}
