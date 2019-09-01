/**
 * Projeto das trilhas de treinamento de Java b�sico ou avan�ado
 * com foco nas certifica��es java e em treinamentos corporativos.
 * Fontes dispon�veis em https://github.com/rodrigofujioka
 * <p>
 * Professor: Rodrigo da Cruz Fujioka
 * <p>
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * <p>
 * Contato: rcf4@cin.ufpe.br
 */
package com.rodrigofujioka.javabasico.aula01_javac_args_println;

import javax.swing.*;

/**
 * Primeiro programa java. Classe de apresenta��o utilizada para entender e refor�ar
 * as informa��es da primeira Aula, Passagem de par�metros e m�todos em Java.
 * Pr�tica:
 * 1 - Implemente um programa que recebe par�metros com o nome e ano de nascimento.
 * o programa deve calcular a idade do usu�rio em anos com base no ano de nascimento informado.
 * <p>
 * 2 - Implemente uma calculadora em Java, utilizando m�todos e o que voc� achar que � poss�vel
 * com seu conhecimento atual, para inteiros use o tipo   int.
 *
 * @author Rodrigo.fujioka
 * @data 03/02/2016 21:30 2018.1
 * @date 07/02/2019 20:30 2019.1
 */
public class PrimeiraAula {

    /*
     * main m�todo principal de uma classe executavel java. O compilador java
     * procura o main m�todo em uma classe para executar, se ela n�o tem esse m�todo
     * ela n�o � executavel
     */
    public static void main(String args[]) {

        imprimeNome();  //Nessa linha vai ser realizada chamada ao m�todo imprimeNome.


        /*O primeiro par�metro � passado aqui no comando   java PrimeiraAula  Professor Fujioka*/
        System.out.println(args[0]);  //Nessa linha vai imprimir Professor


        System.out.println(args[1]);   //Nessa outra linha vai imprimir Fujioka

        /*M�todos est�ticos s� executam m�todos est�ticos, esse conte�do ainda ser� visto*/

    }

    /**
     * M�todo que realiza impress�o do texto Al� Mundo no console.
     */
    public static void imprimeNome() {


        System.out.println("Al� mundo");  // Console
        JOptionPane.showMessageDialog(null, "Al� mundo"); // Interface Gr�fica
    }

}
