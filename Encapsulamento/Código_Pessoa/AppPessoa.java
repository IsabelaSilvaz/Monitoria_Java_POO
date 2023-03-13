package monitoriaPOO;
import java.util.Scanner;

public class AppPessoa {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		/*Cria��o do Scanner LEIA, para pegar as informa��es que ser�o digitadas pelo usu�rio*/
		
		System.out.println("APLICA��O CALCULAR IMC");
		System.out.println("\nInforme o seu nome:");
		String nome = leia.nextLine();
		System.out.println("Informe a sua idade:");
		int idade = leia.nextInt();
		System.out.println("Informe a sua altura:");
		double altura = leia.nextDouble();
		System.out.println("Informe o seu peso:");
		double peso = leia.nextDouble();
		/*Nessa parte, pegamos as informa��es de cada dado pessoal do usu�rio e colocamos 
		 *em uma vari�vel para guard�-la*/
		
		Pessoa pessoa = new Pessoa(nome, idade, altura, peso);
		/*Cria��o do objeto pessoa colocando suas informa��es em seu par�metro, na mesma ordem do construtor:
		 *nome; idade; altura; peso*/
		
		System.out.println("\n----------------------------------");
		System.out.printf("Nome: %s", pessoa.getNome());
		System.out.printf("\nIdade: %d", pessoa.getIdade());
		System.out.printf("\nAltura:  %.2f",pessoa.getAltura());
		System.out.printf("\nPeso: %.2f", pessoa.getPeso());
		/*Mostrando na tela para usu�rio as informa��es pessoais dele que foram guardadas.
		 *Foi utilizado o m�todo de acesso getter, que retornar� o valor do atributo.*/
		
		System.out.printf("\nSeu IMC:  %.2f",pessoa.calcularIMC());
		System.out.printf("\nClassifica��o IMC: %s", pessoa.classificarIMC());
		System.out.println("\n-----------------------------------");
		/*Chamada dos m�todos calcularIMC e classificarIMC
		 *No calcularIMC, ele vai calcular o IMC da Pessoa, cuja f�rmula �: peso dividido pela (altura ao quadrado)
		 *e vai retornar o valor DOUBLE.
		 *
		 *No classificarIMC, foi criado as condi��es para saber a classifica��o do IMC, ele vai retornar 
		 *o seu valor (String).*/
		
		leia.close();
	}

}
