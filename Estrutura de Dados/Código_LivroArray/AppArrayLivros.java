package monitoriaJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppArrayLivros {
	static Livro livros[] = new Livro[4];
	static Scanner scanner = new Scanner(System.in);
	static int contadorLivro;
	/*Cria��o do array chamado livros, onde ir� armazenar 
	 * 4 objetos da classe livro.
	 * Tamb�m foi criado o scanner para ler as informa��es do teclado e o contador (ir� contar a quantidade de cadastros realizados)
	 * OBS: todas s�o vari�veis globais (STATIC), por isso est� fora do public MAIN*/
	
	public static void main(String[] args) throws ParseException {
		int opcao;
		do {
			System.out.println("\nEscolha umas das Op��es:");
			System.out.println();
			System.out.println("1 - Cadastrar Livro");
			System.out.println("2 - Buscar Livro");
			System.out.println("3 - Alterar Livro");
			System.out.println("4 - Excluir Livro");
			System.out.println("5 - Listar Livros");
			System.out.println("0 - Encerrar Aplica��o");

			System.out.print("\nOp��o: ");
			opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				cadastrarLivro();
				break;
			case 2:
				buscarLivro();
				break;
			case 3:
				alterarLivro();
				break;
			case 4:
				excluirLivro();
				break;
			case 5:
				listarLivros();
				break;
			case 0:
				System.out.println("\n--- PROGRAMA ENCERRADO!!");
				break;
			default:
				System.out.println("\nOp��o incorreta");
				
			}
			
		} while (opcao !=0);
		scanner.close();
		/*Utiliza��o do Switch para fazer um menu onde o usu�rio ir� escolher
		 * as op��es.*/			
	}
	
	public static int pesquisarLivroPorId(int idLivro) {
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && idLivro == livros[i].getIdLivro()) {
				return i;
			}
		}
		return -1;
	} 
	/*Cria��o do m�todo pesquisarLivro, ele recebe como par�metro o id do livro que o usu�rio gostaria
	 *de pesquisar.
	 *Foi utilizado o loop for para varrer o array, caso o c�digo digitado pelo usu�rio for igual a 
	 *algum c�digo de um objeto no array, ele ir� retornar a posi��o do objeto encontrado, caso n�o for 
	 *encontrado, ele ir� retornar -1*/
	
	//CRIA��O DO M�TODO CADASTRAR LIVRO
	public static void cadastrarLivro() throws ParseException {
		System.out.println("\nCadastro de Livro\n");
		
		if (contadorLivro == livros.length) {
			System.out.println("O Array est� cheio!");
			return;
		}
		/*Se o valor do contador de cadastro de livro for igual ao tamanho do array(4 objetos), ele vai 
		 * mandar uma mensagem avisando que o array est� cheio*/
		
		System.out.printf("\nDigite o id do Livro: ");
		int idLivro = scanner.nextInt();
		
		if (pesquisarLivroPorId(idLivro) != -1) {
			System.out.println("\n--- Id j� cadastrado ---\n");
			return;
		}	
		/*Pedindo o id do livro com o scanner e chamando o m�todo pesquisarLivro para verificar se o id j� foi cadastrado.
		 *Se j� foi cadastrado, ele vai retornar, n�o ser� poss�vel cadastrar o mesmo ID
		 *Se n�o foi cadastrado, ele vai continuar a rodar o m�todo cadastrar.*/
		
		scanner.nextLine();
		System.out.printf("\nDigite o ISBN do Livro: ");
		String ISBN = scanner.nextLine();
		
		System.out.printf("\nDigite o t�tulo do Livro: ");
		String titulo = scanner.nextLine();
		
		System.out.printf("\nDigite o nome do autor do Livro: ");
		String autor = scanner.nextLine();
		
		System.out.printf("\nDigite o n�mero de p�ginas do Livro: ");
		int numeroPaginas = scanner.nextInt();
		scanner.nextLine();
		
		System.out.printf("\nDigite a data de lan�amento do Livro: ");
		String data = scanner.nextLine();
		/*Utiliza��o do scanner para pedir as outras informa��es do livro*/
		
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataLancada = formato.parse(data);
		/*Passando a String "data' para ser do tipo DATE ao inv�s de ser String*/
		
		
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] == null) {
				livros[i]= new Livro(idLivro, ISBN, titulo, autor, numeroPaginas, dataLancada);
				contadorLivro++;
				System.out.println("\n-- Cadastro efetuado --\n");
				return;
			}
		}
		/*Utiliza��o do for para cadastrar o novo livro no Array e fazer a contagem de cadastro utilizando o CONTADOR.
		 *O loop vai procurar uma posi��o vazia e cadastrar o novo livro nesta posi��o.*/
		
		System.out.println("N�o tem mais posi��o vazia para cadastro");			
	}
	
	//CRIA��O DO M�TODO BUSCAR LIVRO
	public static void buscarLivro() {
		System.out.println("\n Buscar Livro \n");
		
		if (contadorLivro==0) {
			System.out.println("Vetor vazio");
			return;
		}
		/*Se o valor do contador de cadastro de livro for igual a ZERO, ele vai 
		 * mandar uma mensagem avisando que o array est� vazio (n�o ter� objetos para buscar) e vai retornar.*/
		
		System.out.printf("\nDigite o id do Livro: ");
		int idLivro = scanner.nextInt();
		
		int posicaoEncontrada = pesquisarLivroPorId(idLivro);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n--- Id n�o cadastrado ---\n");
			return;
		}	
		/*Pedindo o id do Livro com o Scanner, ap�s isso foi criado uma vari�vel para guardar o valor do retorno do m�todo pesquisarLivro
		 *Caso o retorno for igual a -1, ele vai retornar para o menu principal.*/
		
		System.out.printf("\nId...............: %d\n", livros[posicaoEncontrada].getIdLivro());
		System.out.printf("ISBN...............: %s\n", livros[posicaoEncontrada].getISBN());
		System.out.printf("Titulo.............: %s\n", livros[posicaoEncontrada].getTitulo());
		System.out.printf("Autor..............: %s\n", livros[posicaoEncontrada].getAutor());	
		System.out.printf("N�mero de P�ginas..: %d\n", livros[posicaoEncontrada].getNumeroPaginas());	
		System.out.printf("Data de Lan�amento.: %s\n", livros[posicaoEncontrada].getDataLancada());	
		/*Mostrando na tela, com o m�todo GETTER, os valores de cada atributo do livro encontrado*/
	}
	
	//CRIA��O DO M�TODO ALTERAR LIVRO
	public static void alterarLivro() {
		System.out.println("\nAltera��o de Elevador\n");
		if (contadorLivro==0) {
			System.out.println("Vetor vazio");
			return;
		}
		/*Se o valor do contador de cadastro de livro for igual a ZERO, ele vai 
		 * mandar uma mensagem avisando que o array est� vazio (n�o ter� objetos para alterar) e vai retornar.*/
		
		System.out.printf("\nDigite o id do Livro: ");
		int idLivro = scanner.nextInt();
		
		int posicaoEncontrada = pesquisarLivroPorId(idLivro);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n--- Id n�o cadastrado ---\n");
			return;
		}	
		/*Pedindo o id do Livro com o Scanner, ap�s isso foi criado uma vari�vel para guardar o valor do retorno do m�todo pesquisarLivro
		 *Caso o retorno for igual a -1, ele vai retornar para o menu principal.*/
		
		System.out.printf("\nId...............: %d\n", livros[posicaoEncontrada].getIdLivro());
		System.out.printf("ISBN...............: %s\n", livros[posicaoEncontrada].getISBN());
		System.out.printf("Titulo.............: %s\n", livros[posicaoEncontrada].getTitulo());
		System.out.printf("Autor..............: %s\n", livros[posicaoEncontrada].getAutor());	
		System.out.printf("N�mero de P�ginas..: %d\n", livros[posicaoEncontrada].getNumeroPaginas());	
		System.out.printf("Data de Lan�amento.: %s\n", livros[posicaoEncontrada].getDataLancada());	
		/*Mostrando na tela, com o m�todo GETTER, os valores de cada atributo do livro encontrado*/
		
		scanner.nextLine();
		System.out.println("\nNovo t�tulo: ");
		String novoTitulo = scanner.nextLine();
		livros[posicaoEncontrada].setTitulo(novoTitulo);
		System.out.println("Novo t�tulo alterado!");
		
		System.out.println("\nNovo n�mero de p�ginas: ");
		int novoNumPaginas = scanner.nextInt();
		livros[posicaoEncontrada].setNumeroPaginas(novoNumPaginas);
		System.out.println("Novo n�mero de p�ginas alterado!");
		/*Pedindo os novos valores para o t�tulo e o n�mero de p�ginas.
		 *Ap�s isso, utilizando o m�todo SETTER para alterar o valor*/
	}
	
	//CRIA��O DO M�TODO EXCLUIR LIVRO
	public static void excluirLivro() {
		System.out.println("\nExclus�o de Elevador\n");
		if (contadorLivro==0) {
			System.out.println("Vetor vazio");
			return;
		}
		/*Se o valor do contador de cadastro de livro for igual a ZERO, ele vai 
		 * mandar uma mensagem avisando que o array est� vazio (n�o ter� objetos para excluir) e vai retornar.*/
		
		System.out.printf("\nDigite o id do Livro: ");
		int idLivro = scanner.nextInt();
		
		int posicaoEncontrada = pesquisarLivroPorId(idLivro);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n--- Id n�o cadastrado ---\n");
			return;
		}	
		/*Pedindo o id do Livro com o Scanner, ap�s isso foi criado uma vari�vel para guardar o valor do retorno do m�todo pesquisarLivro
		 *Caso o retorno for igual a -1, ele vai retornar para o menu principal.*/
		
		System.out.printf("\nId...............: %d\n", livros[posicaoEncontrada].getIdLivro());
		System.out.printf("ISBN...............: %s\n", livros[posicaoEncontrada].getISBN());
		System.out.printf("Titulo.............: %s\n", livros[posicaoEncontrada].getTitulo());
		System.out.printf("Autor..............: %s\n", livros[posicaoEncontrada].getAutor());	
		System.out.printf("N�mero de P�ginas..: %d\n", livros[posicaoEncontrada].getNumeroPaginas());	
		System.out.printf("Data de Lan�amento.: %s\n", livros[posicaoEncontrada].getDataLancada());	
		/*Mostrando na tela, com o m�todo GETTER, os valores de cada atributo do livro encontrado*/
		
		char confirma;
		do {
			System.out.printf("\nConfirma exclus�o [S/N]: ");
			scanner.nextLine();
			confirma = scanner.nextLine().charAt(0);
			
			confirma = Character.toUpperCase(confirma);
			/*Passando o char para letra mai�scula*/
			if(confirma!='S' && confirma!='N') {
				continue;
			}
			/*Se o char for diferente de N e S, ele roda o DO WHILE novamente */
			break;
		} while (true);
		if (confirma=='S') {
			for (int i = posicaoEncontrada; i < livros.length -1; i++) {
				livros[i] = livros[i+1];
			}
			livros[livros.length-1]= null;
			contadorLivro--;
			System.out.println("Exclus�o realizada!");
			/*Remanejando as posi��es com o FOR*/
		}
		/*Se o char for 'S', ele exclui o livro encontrado remanejando a posi��o*/
		
		else {
			System.out.println("Exclus�o cancelada!");
		}
		/*Se o char for 'N', ele cancela a exclus�o */
		
	}
	
	//CRIA��O DO M�TODO LISTAR LIVROS
	public static void listarLivros() {
		System.out.println("\n Lista de Livros \n");
		if (contadorLivro==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		/*Se o valor do contador de cadastro de livro for igual a ZERO, ele vai 
		 * mandar uma mensagem avisando que o array est� vazio (n�o ter� objetos para listar) e vai retornar.*/
		
		System.out.println("===========================================================");
		System.out.println("IdLivro  ISBN   Titulo    Autor   P�ginas  Data Lan�amento ");
		System.out.println("===========================================================");

		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null) {
				System.out.printf("%-7d %4s %6s %8s %8d %16s\n", 
				  		  livros[i].getIdLivro(),
						  livros[i].getISBN(),
						  livros[i].getTitulo(),
						  livros[i].getAutor(),
						  livros[i].getNumeroPaginas(),
						  livros[i].getDataLancada());
			}
			else {
				System.out.printf("%d� Elemento nulo\n", i);
			}
		}
		
		System.out.println("===========================================================");
		
		
	}
	
}


