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
package com.rodrigofujioka.javabasico.aula10;

import java.util.*;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 1 de jun de 2016
 * @Time: 21:18:19
 */
public class ColecoesJava {


    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Rodrigo Fujioka");


        Collections.sort(lista);


        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(33, "Fujioka");
        mapa.put(45, "Rodrigo");
        mapa.put(33, "Rodrigo Fujioka");


        String numero = mapa.get(45);

        Set<Integer> chaves = mapa.keySet();

        mapa.values();

        System.out.println(chaves.toString());


    }


}







