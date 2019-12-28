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
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 11 de fev de 2016
 * @Time: 20:52:46
 */
public class TiposJava {

    public static void main(String[] args) {

        int variavelInteira = 10;
        String variavelString = "s";
        double variavelDouble = 7.0;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Inteiro " + variavelInteira);
        System.out.println("Variavel String " + variavelString);
        System.out.println("Variavel Double " + variavelDouble);

        System.out.println("Informe um nome :");
        variavelString = leitor.nextLine();

        System.out.println("Informe um numero:");
        variavelInteira = leitor.nextInt();

        System.out.println("Informe um numero ponto flutu :");
        variavelDouble = leitor.nextDouble();

        leitor.reset();

        leitor.close();
    }


}




