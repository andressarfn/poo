/**
 * Projeto das trilhas de treinamento de Java b�sico ou avan�ado
 * com foco nas certifica��es java e em treinamentos corporativos.
 * Fontes dispon�veis em https://github.com/rodrigofujioka
 * <p>
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2016
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * <p>
 * Contato: rcf4@cin.ufpe.br
 */
package com.rodrigofujioka.projeto.teatro;

import java.util.Scanner;

/**
 * Exemplos para implementa��o de projeto e boas pr�ticas.
 * @author: Rodrigo
 * @date: 19 de mai de 2016
 * @Time: 20:54:16
 */
public class Menu {

    private Scanner leitor = new Scanner(System.in);


    /**
     *
     * Esse exibe o menu e obt�m a op��o informada.
     * @return int contendo a op��o selecionada.
     */
    public int exibeMenuPrincipal() {


        int opcao = -1;
        System.out.println("1 - Comprar Ingresso");
        System.out.println("2 - Exibir Lugares Ocupados");
        System.out.println("9 - Sair");
        System.out.print("Informe a o��o: ");

        opcao = obterValorInteiro();

        return opcao;
    }

    /**
     * Obt�m o valor inteiro de uma String digitada.
     * Esse m�todo realiza a convers�o de uma String digitada para um Inteiro
     * al�m disso faz tratamento de exce��o, caso o usu�rio
     * informe um valor inv�lido.
     * @return int contendo o valor convertido para inteiro.
     */
    public int obterValorInteiro() {
        int retorno = -1;
        String valor = null;
        while (retorno < 0) {
            try {

                valor = leitor.nextLine();
                retorno = Integer.parseInt(valor);

            } catch (NumberFormatException ne) {
                retorno = -1;
                System.out.println("Informe um valor V�lido");
            }
        }
        return retorno;
    }


    /**
     * @return the leitor
     */
    public Scanner getLeitor() {
        return leitor;
    }


    /**
     * @param leitor the leitor to set
     */
    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }


}







