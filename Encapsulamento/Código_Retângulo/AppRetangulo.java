package monitoriaJava;

public class AppRetangulo {
	public static void main(String[] args) {
		Retangulo retanguloPadrao = new Retangulo ();
		/*Criação/Chamando/Instanciando o objeto Retângulo da classe Retângulo na aplicação.
		 *Neste caso não foi colocado informações dentro do parâmetro(parênteses) do objeto, com isso os valores do retângulo será PADRÃO!
		 *REFORÇANDO: O retângulo padrão possui esses seguintes valores:
		 *Cor: Branco;
		 *Altura: 1;
		 *Largura: 1;
		 *Este retângulo padrão está criado no construtor que não recebe parâmetros, feito na classe RETÂNGULO!*/
		System.out.println("RETÂNGULO PELO CONSTRUTOR PADRÃO");
		System.out.println("Cor: " + retanguloPadrao.getCor());
		System.out.println("Altura: " + retanguloPadrao.getAltura());
		System.out.println("Largura: " + retanguloPadrao.getLargura());
    	/*Utilizando o método de acesso GET para pegar as informações do retângulo*/
		
		System.out.println("Perímetro do Retângulo: " + retanguloPadrao.calcularPerimetro());
		/*Foi chamado o método calcularPerimetro, que irá retornar o valor do perímetro na tela, que neste caso será: 4*/
		
		System.out.println("Área do Retângulo: " + retanguloPadrao.calcularArea());
		/*Foi chamado o método calcularArea, que irá retornar o valor da área na tela, que neste caso será: 1*/
		
		
		Retangulo retanguloEspecifico = new Retangulo("Vermelho", 4.60, 5.70);
		/*Criação/Chamando/Instanciando outro objeto Retângulo.
		 *Neste caso, foi colocado informações dentro do paramêtro(parênteses), que são elas respectivamente:
		 *Cor (Vermelho);
		 *Largura (4.60);
		 *Altura (5.70);
		 *OBS: Na mesma ordem do segundo construtor que foi criado na classe Retângulo. */
		
		System.out.println("\n\nRETÂNGULO PELO CONSTRUTOR ONDE RECEBE INFORMAÇÕES");
		System.out.println("Cor: " + retanguloEspecifico.getCor());
		System.out.println("Altura: " + retanguloEspecifico.getAltura());
		System.out.println("Largura: " + retanguloEspecifico.getLargura());
		/*Utilizando o método de acesso GET para pegar as informações do retângulo*/
		
		System.out.println("Perímetro do Retângulo: " + retanguloEspecifico.calcularPerimetro());
		/*Foi chamado o método calcularPerimetro, que irá retornar o valor do perímetro na tela*/
		
		System.out.println("Área do Retângulo: " + retanguloEspecifico.calcularArea());
		/*Foi chamado o método calcularArea, que irá retornar o valor da área na tela*/
	}

}
