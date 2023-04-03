package monitoriaJava;

import java.util.Date;

public class Livro {
	//DECLARA��O DOS ATRIBUTOS DA CLASSE LIVRO, UTILIZANDO O MODIFICADOR DE ACESSSO PRIVATE
	private int idLivro;
	private String ISBN;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private Date dataLancada;
	
	public Livro(int idLivro, String ISBN, String titulo, String autor, int numeroPaginas, Date dataLancada) {
		this.idLivro = idLivro;
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.dataLancada = dataLancada;
	}
	//CRIA��O DO CONSTRUTOR ESPEC�FICO DA CLASSE LIVRO;
	//TODOS OS ATRIBUTOS EST�O EM SEU PAR�METRO
	
	
	//M�TODOS GETTERS E SETTERS
	//ISBN E O ID N�O PODEM SER SETADOS!
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public Date getDataLancada() {
		return dataLancada;
	}

	public void setDataLancada(Date dataLancada) {
		this.dataLancada = dataLancada;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public String getISBN() {
		return ISBN;
	}
	
	
	
	
}
