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
package com.rodrigofujioka.javabasico.aula05;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 10 de mar de 2016
 * @Time: 21:41:26
 */
public class Empregado {

    private String nome;

    public Empregado(String nome) {
        this.nome = nome;
        System.out.println("Construtor Empregado");
    }

    public void trabalhar() {
        System.out.println("Trabalhando");
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }


}




