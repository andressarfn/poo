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
package com.rodrigofujioka.javabasico.aula03_objects;

import java.util.Scanner;

/**
 * Classe de exemplo com main para exibir a forma como os valores
 * s�o atribu�dos as vari�veis
 *
 * @author: rodrigo.fujioka
 * @date: 10 de fev de 2016
 * @Time: 04:46:51
 */
public class AtribuirValorVariavel {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva o seu nome");
        String nome = leitor.nextLine();
        System.out.println("A string lida foi -> " + nome);

        System.out.println("Escreva o ano de nascimento");
        int anoNacimento = leitor.nextInt();
        System.out.println("O inteiro lido foi -> " + anoNacimento);

        System.out.println("Escreva a sua idade, incluindo os meses j� passados");
        double idade = leitor.nextDouble();
        System.out.println("O inteiro lido foi -> " + idade);

        leitor.close();

    }
}
