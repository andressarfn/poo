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
package com.rodrigofujioka.javabasico.aula07;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 14 de abr de 2016
 * @Time: 20:46:33
 */
public class OperadoresJava {


    public static void main(String[] args) {


        Pessoa p = new Pessoa();
        PessoaEspecial pe = new PessoaEspecial();
        Pessoa pp = new PessoaEspecial();

        float valorFloat = 4.6f;


        if (p instanceof PessoaEspecial) {
            System.out.println("P � uma inst�ncia de PessoaEspecial");
        }


        int idade = (45 == 80) ? 45 : 89;
        int outraIdade = (45 == 80) ? 45 : (33 == 33) ? 33 : 45;

        String s = "(short)(1 + 2 + 3)";

        if (operacaoUm() || operacaoDois()) {

            System.out.println("Tudo CErto");
        } else {
            System.out.println("Aconteceu alguma coisa");
        }


    }

    public static boolean operacaoUm() {
        System.out.println("Opera��o um");
        return true;
    }


    public static boolean operacaoDois() {
        System.out.println("Opera��o Dois");
        return true;
    }


}
