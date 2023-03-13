package monitoriaPOO;
import java.util.Scanner;

public class AppPessoa {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		/*Criação do Scanner LEIA, para pegar as informações que serão digitadas pelo usuário*/
		
		System.out.println("APLICAÇÃO CALCULAR IMC");
		System.out.println("\nInforme o seu nome:");
		String nome = leia.nextLine();
		System.out.println("Informe a sua idade:");
		int idade = leia.nextInt();
		System.out.println("Informe a sua altura:");
		double altura = leia.nextDouble();
		System.out.println("Informe o seu peso:");
		double peso = leia.nextDouble();
		/*Nessa parte, pegamos as informações de cada dado pessoal do usuário e colocamos 
		 *em uma variável para guardá-la*/
		
		Pessoa pessoa = new Pessoa(nome, idade, altura, peso);
		/*Criação do objeto pessoa colocando suas informações em seu parâmetro, na mesma ordem do construtor:
		 *nome; idade; altura; peso*/
		
		System.out.println("\n----------------------------------");
		System.out.printf("Nome: %s", pessoa.getNome());
		System.out.printf("\nIdade: %d", pessoa.getIdade());
		System.out.printf("\nAltura:  %.2f",pessoa.getAltura());
		System.out.printf("\nPeso: %.2f", pessoa.getPeso());
		/*Mostrando na tela para usuário as informações pessoais dele que foram guardadas.
		 *Foi utilizado o método de acesso getter, que retornará o valor do atributo.*/
		
		System.out.printf("\nSeu IMC:  %.2f",pessoa.calcularIMC());
		System.out.printf("\nClassificação IMC: %s", pessoa.classificarIMC());
		System.out.println("\n-----------------------------------");
		/*Chamada dos métodos calcularIMC e classificarIMC
		 *No calcularIMC, ele vai calcular o IMC da Pessoa, cuja fórmula é: peso dividido pela (altura ao quadrado)
		 *e vai retornar o valor DOUBLE.
		 *
		 *No classificarIMC, foi criado as condições para saber a classificação do IMC, ele vai retornar 
		 *o seu valor (String).*/
		
		leia.close();
	}

}
