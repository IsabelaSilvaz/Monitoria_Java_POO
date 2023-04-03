package monitoriaJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppListaEletrodomestico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Eletrodomestico> eletrodomesticos = new ArrayList();
		float precoKwatts = 0;
		/*Criação do Scanner para ler as informações,
		 *Instaciando a lista de eletrodomésticos e
		 *Declaração e inicialização do preço Kwatts que será utilizada para realizar o cálculo
		 *do gasto do Mês*/
		
		System.out.println("===========================");
		System.out.println(" CADASTRO ELETRODOMÉSTICO  ");
		System.out.println("===========================");
		
		System.out.println("Digite o preço dos Kwatts: ");
		precoKwatts = scanner.nextFloat();
		
		for (int i=0 ; i<4 ; i++) {
		/*Utilizando o for para cadastrar 4 objetos na lista
		 *Estrutura do FOR:
		 *for(inicialização; condição; incremmento/decremento {
		 *		bloco de código para ser executado
		 *}*/
			
			System.out.printf("\nDigite o código do %dº Eletrodoméstico: ", (i+1));
			int codigo = scanner.nextInt();
			scanner.nextLine();
			
			System.out.printf("Digite o nome do  %dº Eletrodoméstico: ",  (i+1));
			String nome = scanner.nextLine();
			
			System.out.printf("Digite a potência do %dº Eletrodoméstico: ", (i+1));
			float potencia = scanner.nextFloat();
			
			System.out.printf("Digite o tempo de Utilização diária do %dº Eletrodoméstico: ", (i+1));
			float tempUtilizacaoDiaria = scanner.nextFloat();
			
			/*Pegando as informações necessária para cadastrar o Eletrodoméstico*/
			
			eletrodomesticos.add(new Eletrodomestico(codigo, nome, potencia, tempUtilizacaoDiaria));
			/*Criação e Adicionando o novo objeto na lista*/
		}
		
		System.out.println("\n===========================");
		System.out.println(" LISTA DE ELETRODOMÉSTICO  ");
		System.out.println("===========================");
		
		for (Eletrodomestico eletrodomestico : eletrodomesticos) {
			System.out.printf("\nCódigo...............: %d \n", eletrodomestico.getCodigo());
			System.out.printf("Nome.................: %s \n", eletrodomestico.getNome());
			System.out.printf("Potência.............: %.2f watts \n", eletrodomestico.getPotencia());
			System.out.printf("Tempo de Utilização..: %.2f horas/dia \n", eletrodomestico.getTempUtilizacaoDiaria());
			System.out.printf("Watts por Dia........: %.2f W \n", eletrodomestico.wattsPorDia());
			System.out.printf("Watts por Mês........: %.2f W \n", eletrodomestico.wattsPorMes());
			System.out.printf("Watts por Ano........: %.2f W \n", eletrodomestico.wattsPorAno());
			System.out.printf("Gasto do Mês.........: R$%.4f \n", eletrodomestico.gastoMes(precoKwatts));
			
			/*Utilização do loop For Each para mostrar na tela todos os dados dos objetos
			 *que estão na lista.
			 *Estrutura do ForEach:
			 *for(TipoDoObjeto nomeDoObjeto: nomeDaLista) {
			 *		Bloco de código que será executado
			 *}*/
			
		}
	}

}
