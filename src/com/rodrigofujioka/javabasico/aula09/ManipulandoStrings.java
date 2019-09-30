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
package com.rodrigofujioka.javabasico.aula09;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 25 de mai de 2016
 * @Time: 20:42:36
 */
public class ManipulandoStrings {

    public static void main(String[] args) {

        String str = "Isto � uma String do Java";
        String[] palavras = str.split(" ");

        for (String palavra : palavras) {

            System.out.println(palavra);
        }

        if (str.endsWith("Javas")) {
            System.out.println(str);
        }


        String nome = "Rodrigo fujioka";

        if (nome.equalsIgnoreCase("rodrigo Fujioka")) {
            System.out.println("� Rodrigo");
        }

        int posicao = str.indexOf("JavaX");
        System.out.println(posicao);

        String textoAlterado = str.replace("Java", "");
        System.out.println(textoAlterado);

        System.out.println(str);


        String outra = str.substring(0, 3);

        System.out.println(outra);

    }
}


