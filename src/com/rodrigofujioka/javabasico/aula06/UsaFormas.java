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
package com.rodrigofujioka.javabasico.aula06;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 7 de abr de 2016
 * @Time: 21:10:11
 */
public class UsaFormas {

    public static void main(String[] args) {

        Poligono poligono = new Retangulo();
        Hexagono hexagono = new Hexagono();
        imprimirObjeto(poligono);
        imprimirObjeto(hexagono);


    }

    public static void imprimirObjeto(Poligono poligono) {
        poligono.imprimir();
    }


}




