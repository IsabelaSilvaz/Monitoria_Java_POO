package monitoriaJava;

public class AppRetangulo {
	public static void main(String[] args) {
		Retangulo retanguloPadrao = new Retangulo ();
		/*Cria��o/Chamando/Instanciando o objeto Ret�ngulo da classe Ret�ngulo na aplica��o.
		 *Neste caso n�o foi colocado informa��es dentro do par�metro(par�nteses) do objeto, com isso os valores do ret�ngulo ser� PADR�O!
		 *REFOR�ANDO: O ret�ngulo padr�o possui esses seguintes valores:
		 *Cor: Branco;
		 *Altura: 1;
		 *Largura: 1;
		 *Este ret�ngulo padr�o est� criado no construtor que n�o recebe par�metros, feito na classe RET�NGULO!*/
		System.out.println("RET�NGULO PELO CONSTRUTOR PADR�O");
		System.out.println("Cor: " + retanguloPadrao.getCor());
		System.out.println("Altura: " + retanguloPadrao.getAltura());
		System.out.println("Largura: " + retanguloPadrao.getLargura());
    	/*Utilizando o m�todo de acesso GET para pegar as informa��es do ret�ngulo*/
		
		System.out.println("Per�metro do Ret�ngulo: " + retanguloPadrao.calcularPerimetro());
		/*Foi chamado o m�todo calcularPerimetro, que ir� retornar o valor do per�metro na tela, que neste caso ser�: 4*/
		
		System.out.println("�rea do Ret�ngulo: " + retanguloPadrao.calcularArea());
		/*Foi chamado o m�todo calcularArea, que ir� retornar o valor da �rea na tela, que neste caso ser�: 1*/
		
		
		Retangulo retanguloEspecifico = new Retangulo("Vermelho", 4.60, 5.70);
		/*Cria��o/Chamando/Instanciando outro objeto Ret�ngulo.
		 *Neste caso, foi colocado informa��es dentro do param�tro(par�nteses), que s�o elas respectivamente:
		 *Cor (Vermelho);
		 *Largura (4.60);
		 *Altura (5.70);
		 *OBS: Na mesma ordem do segundo construtor que foi criado na classe Ret�ngulo. */
		
		System.out.println("\n\nRET�NGULO PELO CONSTRUTOR ONDE RECEBE INFORMA��ES");
		System.out.println("Cor: " + retanguloEspecifico.getCor());
		System.out.println("Altura: " + retanguloEspecifico.getAltura());
		System.out.println("Largura: " + retanguloEspecifico.getLargura());
		/*Utilizando o m�todo de acesso GET para pegar as informa��es do ret�ngulo*/
		
		System.out.println("Per�metro do Ret�ngulo: " + retanguloEspecifico.calcularPerimetro());
		/*Foi chamado o m�todo calcularPerimetro, que ir� retornar o valor do per�metro na tela*/
		
		System.out.println("�rea do Ret�ngulo: " + retanguloEspecifico.calcularArea());
		/*Foi chamado o m�todo calcularArea, que ir� retornar o valor da �rea na tela*/
	}

}
