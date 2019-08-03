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
package com.rodrigofujioka.javabasico.aula02;

import java.util.Scanner;

/**
 * Classe criada para demonstrar como � realizada a cria��o de objetos a partir
 * de outras classes.
 *
 * @author Rodrigo.fujioka
 * @data 04/02/2016 21:33
 * @data 10/02/2019 18:00
 */
public class ProgramaPrincipal {

    public static void main(String[] args) {

        /*
         * Criando algo na mem�ria do Java. Agora a classe que voc� criou existe e pode
         * ter seu comportamento invocado. variavelDeReferencia � o nome da variav�l que aponta para o
         * objeto em mem�ria.  O nome da variavel de refer�ncia poderia ter qualquer  OutroNome.
         *
         * PS: S� n�o esque�a que ela n�o pode ser definida de novo no mesmo c�digo.
         */
        ProfessorRodrigoFujioka variavelDeReferencia = new ProfessorRodrigoFujioka();
        variavelDeReferencia.imprimeNome("Rodrigo Fujioka");
        variavelDeReferencia.imprimeIdade(25);


        /*
         *
         * Crie uma classe com seu nome e crie m�todos inerentes a abstra��o da sua pessoa.
         *  1 - Execute o c�digo no console e no eclipse/intelijj ou ferramenta de desenvolvimento.
         *  2 - Saber compilar na m�o � obrigat�rio, pelo menos, para essa aula.
         *
         * */

    }

}
