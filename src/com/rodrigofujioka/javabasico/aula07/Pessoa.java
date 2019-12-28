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
 * @Time: 20:51:33
 */
public class Pessoa extends OperadoresJava {

    private String nome;

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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object p) {

        return this.nome == ((Pessoa) p).getNome();
    }


}
