package monitoriaJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppListaEletrodomestico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Eletrodomestico> eletrodomesticos = new ArrayList();
		float precoKwatts = 0;
		/*Cria��o do Scanner para ler as informa��es,
		 *Instaciando a lista de eletrodom�sticos e
		 *Declara��o e inicializa��o do pre�o Kwatts que ser� utilizada para realizar o c�lculo
		 *do gasto do M�s*/
		
		System.out.println("===========================");
		System.out.println(" CADASTRO ELETRODOM�STICO  ");
		System.out.println("===========================");
		
		System.out.println("Digite o pre�o dos Kwatts: ");
		precoKwatts = scanner.nextFloat();
		
		for (int i=0 ; i<4 ; i++) {
		/*Utilizando o for para cadastrar 4 objetos na lista
		 *Estrutura do FOR:
		 *for(inicializa��o; condi��o; incremmento/decremento {
		 *		bloco de c�digo para ser executado
		 *}*/
			
			System.out.printf("\nDigite o c�digo do %d� Eletrodom�stico: ", (i+1));
			int codigo = scanner.nextInt();
			scanner.nextLine();
			
			System.out.printf("Digite o nome do  %d� Eletrodom�stico: ",  (i+1));
			String nome = scanner.nextLine();
			
			System.out.printf("Digite a pot�ncia do %d� Eletrodom�stico: ", (i+1));
			float potencia = scanner.nextFloat();
			
			System.out.printf("Digite o tempo de Utiliza��o di�ria do %d� Eletrodom�stico: ", (i+1));
			float tempUtilizacaoDiaria = scanner.nextFloat();
			
			/*Pegando as informa��es necess�ria para cadastrar o Eletrodom�stico*/
			
			eletrodomesticos.add(new Eletrodomestico(codigo, nome, potencia, tempUtilizacaoDiaria));
			/*Cria��o e Adicionando o novo objeto na lista*/
		}
		
		System.out.println("\n===========================");
		System.out.println(" LISTA DE ELETRODOM�STICO  ");
		System.out.println("===========================");
		
		for (Eletrodomestico eletrodomestico : eletrodomesticos) {
			System.out.printf("\nC�digo...............: %d \n", eletrodomestico.getCodigo());
			System.out.printf("Nome.................: %s \n", eletrodomestico.getNome());
			System.out.printf("Pot�ncia.............: %.2f watts \n", eletrodomestico.getPotencia());
			System.out.printf("Tempo de Utiliza��o..: %.2f horas/dia \n", eletrodomestico.getTempUtilizacaoDiaria());
			System.out.printf("Watts por Dia........: %.2f W \n", eletrodomestico.wattsPorDia());
			System.out.printf("Watts por M�s........: %.2f W \n", eletrodomestico.wattsPorMes());
			System.out.printf("Watts por Ano........: %.2f W \n", eletrodomestico.wattsPorAno());
			System.out.printf("Gasto do M�s.........: R$%.4f \n", eletrodomestico.gastoMes(precoKwatts));
			
			/*Utiliza��o do loop For Each para mostrar na tela todos os dados dos objetos
			 *que est�o na lista.
			 *Estrutura do ForEach:
			 *for(TipoDoObjeto nomeDoObjeto: nomeDaLista) {
			 *		Bloco de c�digo que ser� executado
			 *}*/
			
		}
	}

}
