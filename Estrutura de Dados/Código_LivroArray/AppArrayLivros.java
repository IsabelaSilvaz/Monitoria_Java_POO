package monitoriaJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppArrayLivros {
	static Livro livros[] = new Livro[4];
	static Scanner scanner = new Scanner(System.in);
	static int contadorLivro;
	/*Criação do array chamado livros, onde irá armazenar 
	 * 4 objetos da classe livro.
	 * Também foi criado o scanner para ler as informações do teclado e o contador (irá contar a quantidade de cadastros realizados)
	 * OBS: todas são variáveis globais (STATIC), por isso está fora do public MAIN*/
	
	public static void main(String[] args) throws ParseException {
		int opcao;
		do {
			System.out.println("\nEscolha umas das Opções:");
			System.out.println();
			System.out.println("1 - Cadastrar Livro");
			System.out.println("2 - Buscar Livro");
			System.out.println("3 - Alterar Livro");
			System.out.println("4 - Excluir Livro");
			System.out.println("5 - Listar Livros");
			System.out.println("0 - Encerrar Aplicação");

			System.out.print("\nOpção: ");
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
				System.out.println("\nOpção incorreta");
				
			}
			
		} while (opcao !=0);
		scanner.close();
		/*Utilização do Switch para fazer um menu onde o usuário irá escolher
		 * as opções.*/			
	}
	
	public static int pesquisarLivroPorId(int idLivro) {
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] != null && idLivro == livros[i].getIdLivro()) {
				return i;
			}
		}
		return -1;
	} 
	/*Criação do método pesquisarLivro, ele recebe como parâmetro o id do livro que o usuário gostaria
	 *de pesquisar.
	 *Foi utilizado o loop for para varrer o array, caso o código digitado pelo usuário for igual a 
	 *algum código de um objeto no array, ele irá retornar a posição do objeto encontrado, caso não for 
	 *encontrado, ele irá retornar -1*/
	
	//CRIAÇÃO DO MÉTODO CADASTRAR LIVRO
	public static void cadastrarLivro() throws ParseException {
		System.out.println("\nCadastro de Livro\n");
		
		if (contadorLivro == livros.length) {
			System.out.println("O Array está cheio!");
			return;
		}
		/*Se o valor do contador de cadastro de livro for igual ao tamanho do array(4 objetos), ele vai 
		 * mandar uma mensagem avisando que o array está cheio*/
		
		System.out.printf("\nDigite o id do Livro: ");
		int idLivro = scanner.nextInt();
		
		if (pesquisarLivroPorId(idLivro) != -1) {
			System.out.println("\n--- Id já cadastrado ---\n");
			return;
		}	
		/*Pedindo o id do livro com o scanner e chamando o método pesquisarLivro para verificar se o id já foi cadastrado.
		 *Se já foi cadastrado, ele vai retornar, não será possível cadastrar o mesmo ID
		 *Se não foi cadastrado, ele vai continuar a rodar o método cadastrar.*/
		
		scanner.nextLine();
		System.out.printf("\nDigite o ISBN do Livro: ");
		String ISBN = scanner.nextLine();
		
		System.out.printf("\nDigite o título do Livro: ");
		String titulo = scanner.nextLine();
		
		System.out.printf("\nDigite o nome do autor do Livro: ");
		String autor = scanner.nextLine();
		
		System.out.printf("\nDigite o número de páginas do Livro: ");
		int numeroPaginas = scanner.nextInt();
		scanner.nextLine();
		
		System.out.printf("\nDigite a data de lançamento do Livro: ");
		String data = scanner.nextLine();
		/*Utilização do scanner para pedir as outras informações do livro*/
		
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date dataLancada = formato.parse(data);
		/*Passando a String "data' para ser do tipo DATE ao invés de ser String*/
		
		
		for (int i = 0; i < livros.length; i++) {
			if (livros[i] == null) {
				livros[i]= new Livro(idLivro, ISBN, titulo, autor, numeroPaginas, dataLancada);
				contadorLivro++;
				System.out.println("\n-- Cadastro efetuado --\n");
				return;
			}
		}
		/*Utilização do for para cadastrar o novo livro no Array e fazer a contagem de cadastro utilizando o CONTADOR.
		 *O loop vai procurar uma posição vazia e cadastrar o novo livro nesta posição.*/
		
		System.out.println("Não tem mais posição vazia para cadastro");			
	}
	
	//CRIAÇÃO DO MÉTODO BUSCAR LIVRO
	public static void buscarLivro() {
		System.out.println("\n Buscar Livro \n");
		
		if (contadorLivro==0) {
			System.out.println("Vetor vazio");
			return;
		}
		/*Se o valor do contador de cadastro de livro for igual a ZERO, ele vai 
		 * mandar uma mensagem avisando que o array está vazio (não terá objetos para buscar) e vai retornar.*/
		
		System.out.printf("\nDigite o id do Livro: ");
		int idLivro = scanner.nextInt();
		
		int posicaoEncontrada = pesquisarLivroPorId(idLivro);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n--- Id não cadastrado ---\n");
			return;
		}	
		/*Pedindo o id do Livro com o Scanner, após isso foi criado uma variável para guardar o valor do retorno do método pesquisarLivro
		 *Caso o retorno for igual a -1, ele vai retornar para o menu principal.*/
		
		System.out.printf("\nId...............: %d\n", livros[posicaoEncontrada].getIdLivro());
		System.out.printf("ISBN...............: %s\n", livros[posicaoEncontrada].getISBN());
		System.out.printf("Titulo.............: %s\n", livros[posicaoEncontrada].getTitulo());
		System.out.printf("Autor..............: %s\n", livros[posicaoEncontrada].getAutor());	
		System.out.printf("Número de Páginas..: %d\n", livros[posicaoEncontrada].getNumeroPaginas());	
		System.out.printf("Data de Lançamento.: %s\n", livros[posicaoEncontrada].getDataLancada());	
		/*Mostrando na tela, com o método GETTER, os valores de cada atributo do livro encontrado*/
	}
	
	//CRIAÇÃO DO MÉTODO ALTERAR LIVRO
	public static void alterarLivro() {
		System.out.println("\nAlteração de Elevador\n");
		if (contadorLivro==0) {
			System.out.println("Vetor vazio");
			return;
		}
		/*Se o valor do contador de cadastro de livro for igual a ZERO, ele vai 
		 * mandar uma mensagem avisando que o array está vazio (não terá objetos para alterar) e vai retornar.*/
		
		System.out.printf("\nDigite o id do Livro: ");
		int idLivro = scanner.nextInt();
		
		int posicaoEncontrada = pesquisarLivroPorId(idLivro);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n--- Id não cadastrado ---\n");
			return;
		}	
		/*Pedindo o id do Livro com o Scanner, após isso foi criado uma variável para guardar o valor do retorno do método pesquisarLivro
		 *Caso o retorno for igual a -1, ele vai retornar para o menu principal.*/
		
		System.out.printf("\nId...............: %d\n", livros[posicaoEncontrada].getIdLivro());
		System.out.printf("ISBN...............: %s\n", livros[posicaoEncontrada].getISBN());
		System.out.printf("Titulo.............: %s\n", livros[posicaoEncontrada].getTitulo());
		System.out.printf("Autor..............: %s\n", livros[posicaoEncontrada].getAutor());	
		System.out.printf("Número de Páginas..: %d\n", livros[posicaoEncontrada].getNumeroPaginas());	
		System.out.printf("Data de Lançamento.: %s\n", livros[posicaoEncontrada].getDataLancada());	
		/*Mostrando na tela, com o método GETTER, os valores de cada atributo do livro encontrado*/
		
		scanner.nextLine();
		System.out.println("\nNovo título: ");
		String novoTitulo = scanner.nextLine();
		livros[posicaoEncontrada].setTitulo(novoTitulo);
		System.out.println("Novo título alterado!");
		
		System.out.println("\nNovo número de páginas: ");
		int novoNumPaginas = scanner.nextInt();
		livros[posicaoEncontrada].setNumeroPaginas(novoNumPaginas);
		System.out.println("Novo número de páginas alterado!");
		/*Pedindo os novos valores para o título e o número de páginas.
		 *Após isso, utilizando o método SETTER para alterar o valor*/
	}
	
	//CRIAÇÃO DO MÉTODO EXCLUIR LIVRO
	public static void excluirLivro() {
		System.out.println("\nExclusão de Elevador\n");
		if (contadorLivro==0) {
			System.out.println("Vetor vazio");
			return;
		}
		/*Se o valor do contador de cadastro de livro for igual a ZERO, ele vai 
		 * mandar uma mensagem avisando que o array está vazio (não terá objetos para excluir) e vai retornar.*/
		
		System.out.printf("\nDigite o id do Livro: ");
		int idLivro = scanner.nextInt();
		
		int posicaoEncontrada = pesquisarLivroPorId(idLivro);
		
		if (posicaoEncontrada == -1) {
			System.out.println("\n--- Id não cadastrado ---\n");
			return;
		}	
		/*Pedindo o id do Livro com o Scanner, após isso foi criado uma variável para guardar o valor do retorno do método pesquisarLivro
		 *Caso o retorno for igual a -1, ele vai retornar para o menu principal.*/
		
		System.out.printf("\nId...............: %d\n", livros[posicaoEncontrada].getIdLivro());
		System.out.printf("ISBN...............: %s\n", livros[posicaoEncontrada].getISBN());
		System.out.printf("Titulo.............: %s\n", livros[posicaoEncontrada].getTitulo());
		System.out.printf("Autor..............: %s\n", livros[posicaoEncontrada].getAutor());	
		System.out.printf("Número de Páginas..: %d\n", livros[posicaoEncontrada].getNumeroPaginas());	
		System.out.printf("Data de Lançamento.: %s\n", livros[posicaoEncontrada].getDataLancada());	
		/*Mostrando na tela, com o método GETTER, os valores de cada atributo do livro encontrado*/
		
		char confirma;
		do {
			System.out.printf("\nConfirma exclusão [S/N]: ");
			scanner.nextLine();
			confirma = scanner.nextLine().charAt(0);
			
			confirma = Character.toUpperCase(confirma);
			/*Passando o char para letra maiúscula*/
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
			System.out.println("Exclusão realizada!");
			/*Remanejando as posições com o FOR*/
		}
		/*Se o char for 'S', ele exclui o livro encontrado remanejando a posição*/
		
		else {
			System.out.println("Exclusão cancelada!");
		}
		/*Se o char for 'N', ele cancela a exclusão */
		
	}
	
	//CRIAÇÃO DO MÉTODO LISTAR LIVROS
	public static void listarLivros() {
		System.out.println("\n Lista de Livros \n");
		if (contadorLivro==0) {
			System.out.println("Vetor vazio");
			return;
		}
		
		/*Se o valor do contador de cadastro de livro for igual a ZERO, ele vai 
		 * mandar uma mensagem avisando que o array está vazio (não terá objetos para listar) e vai retornar.*/
		
		System.out.println("===========================================================");
		System.out.println("IdLivro  ISBN   Titulo    Autor   Páginas  Data Lançamento ");
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
				System.out.printf("%dº Elemento nulo\n", i);
			}
		}
		
		System.out.println("===========================================================");
		
		
	}
	
}


