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
package com.rodrigofujioka.javabasico.aula08;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 27 de abr de 2016
 * @Time: 21:11:25
 */
public class ExemploVetores {


    public static void main(String[] args) {


        int[] vetorInteiro = new int[5];

        double[] top = new double[10];

        float[] top2 = new float[4];

        float[] top3 = {1.4f, 4.5f};

        int x;

        String[] vetorString = {"Rodrigo", "F�rias"};

        vetorInteiro[0] = 7;
        vetorInteiro[1] = 9;
        vetorInteiro[2] = 10;
        vetorInteiro[3] = 12;


        int[] vetores = {7, 9, 10, 12};

        for (int i = 0; i < 4; i++) {
            System.out.println(vetores[i]);
        }


    }


}
