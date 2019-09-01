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

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 17 de fev de 2016
 * @Time: 21:25:42
 */
public class Aluno {

    String nome;
    int idade;
    String escola;

    /**
     * M�todo que exibe todos os dados do usu�rio.
     */
    public void exibeDados() {
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Escola " + escola);
    }


    /**
     * M�todo que exibe apenas a idade do usu�rio
     */
    public void informaIdade() {
        System.out.println("Idade " + idade);
    }

    /*
     * Crie m�todos que sejam respons�veis pela impress�o das demais variaveis que n�o possuem impress�o solo
     *
     * */


}












