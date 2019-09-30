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
package com.rodrigofujioka.projeto.teatro;

/**
 * Testes realizados em sala .
 * @author: Rodrigo
 * @date: 19 de mai de 2016
 * @Time: 21:31:25
 */
public class TeatroMinerva {

    private String[] lugares = new String[25];

    public void comprarIngresso(int numeroLugar, String cpf) {

        try {

            if (lugares[numeroLugar - 1] == null) {
                lugares[numeroLugar] = cpf;
            } else {
                System.out.println("Lugar Ocupado");
            }

        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("Lugar inv�lido");
        }

    }


}







