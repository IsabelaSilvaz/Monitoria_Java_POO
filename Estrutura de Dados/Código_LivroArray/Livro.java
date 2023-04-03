package monitoriaJava;

import java.util.Date;

public class Livro {
	//DECLARAÇÃO DOS ATRIBUTOS DA CLASSE LIVRO, UTILIZANDO O MODIFICADOR DE ACESSSO PRIVATE
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
	//CRIAÇÃO DO CONSTRUTOR ESPECÍFICO DA CLASSE LIVRO;
	//TODOS OS ATRIBUTOS ESTÃO EM SEU PARÂMETRO
	
	
	//MÉTODOS GETTERS E SETTERS
	//ISBN E O ID NÃO PODEM SER SETADOS!
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
