package unit;

import java.util.Date; //import da Data
import java.text.ParseException; //import do exception, para não dar erro na Data
import java.text.SimpleDateFormat; //import para formatar a Data

public class AppPessoaUniversidade {

	public static void main(String[] args) throws ParseException {
		//Declaração/Instanciando o SimpleDateFormart, para deixar a data formatada
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
		//Criação de 5 datas de Nascimento
		Date dataNasc1 = formato.parse("25/12/2004");
		Date dataNasc2 = formato.parse("23/05/2000");
		Date dataNasc3 = formato.parse("13/02/1989");
		Date dataNasc4 = formato.parse("19/01/2016");
		Date dataNasc5 = formato.parse("05/11/2007");
		
		//Declarando e Instanciando 3 objetos do tipo Universidade
		Universidade universidade1 = new Universidade(710, "UNIT-PE");
		Universidade universidade2 = new Universidade(720, "Uninassau");
		Universidade universidade3 = new Universidade(730, "Unibra");
		
		//Declarando e Instanciando 5 objetos do tipo Pessoa
		Pessoa pessoa1 = new Pessoa(1,"Isabela", dataNasc1, "(81) 98878-4323", universidade1 );
		Pessoa pessoa2 = new Pessoa(2,"Maria", dataNasc2, "(81) 98665-4087", universidade2 );
		Pessoa pessoa3 = new Pessoa(3,"Alice", dataNasc3, "(81) 98775-9014", universidade3 );
		Pessoa pessoa4 = new Pessoa(4,"Pedro", dataNasc4, "(81) 98991-0280", universidade1 );
		Pessoa pessoa5 = new Pessoa(5,"João", dataNasc5, "(81) 97345-0611", universidade3);
		//OBS: na passagem do parâmetro do objeto pessoa, foi colocado a universidade que ela está associada!
		
		//Chamada do método mostrarDados para cada objeto do tipo Pessoa
		mostrarDados(pessoa1);
		mostrarDados(pessoa2);
		mostrarDados(pessoa3);
		mostrarDados(pessoa4);
		mostrarDados(pessoa5);
	}
	
	/*Criação de um método STATIC (global), fora do método MAIN, para mostrar os dados do livro.
	 *Ele recebe como parâmetro o livro que será mostrado os dados*/
	public static void mostrarDados (Pessoa pessoa) {
		System.out.println("Nome da Pessoa: " + pessoa.getNome());
		System.out.println("Data de Nascimento: " + pessoa.getDataNasc());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Nome da Universidade: " + pessoa.getUniversidade().getNome() 
		+ "\n"); //Acessou o nome da universidade que a pessoa está associada.
	}
	

}
