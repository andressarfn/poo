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
package com.rodrigofujioka.javabasico.aula12;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe que define o comportamento para o objeto.
 * @author: Rodrigo
 * @date: 11 de mai de 2016
 * @Time: 21:04:15
 */
public class ClasseMauvada {

    public void geraErroConversao() {
        throw new NumberFormatException();
    }

    public void geraErroChecado() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public void gerarErroChecadoSegundo() throws SQLException {
        throw new SQLException();
    }


    public int obterNumero(Scanner leitor) {
        int retorno = -1;

        while (retorno < 0) {

            try {

                retorno = Integer.parseInt(leitor.nextLine());

            } catch (InputMismatchException nf) {
                System.out.println("Informe um n�mero");
            } catch (Exception e) {
                System.out.println("Informe um n�mero");
            }
        }

        return retorno;
    }


}





