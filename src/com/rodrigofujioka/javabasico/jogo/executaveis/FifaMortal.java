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
package com.rodrigofujioka.javabasico.jogo.executaveis;

import com.rodrigofujioka.javabasico.jogo.fifa.personagens.Tecnico;
import com.rodrigofujioka.javabasico.jogo.fifa.personagens.Terrorista;


/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 20 de abr de 2016
 * @Time: 21:15:07
 */
public class FifaMortal {

    public static void main(String[] args) {

        Terrorista chines = new Terrorista();
        Tecnico demitido = new Tecnico();
        PersonageMutante pm = new PersonageMutante();


        demitido.trocarJogador();


    }


}





