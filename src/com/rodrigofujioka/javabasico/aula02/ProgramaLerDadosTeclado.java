package com.rodrigofujioka.javabasico.aula02;

import javax.swing.*;
import java.util.Scanner;

public class ProgramaLerDadosTeclado {


    public static void main(String[] args) {


        /**
         * Variav�l do tipo String, que recebe textos.
         * Esse objeto realiza a leitura dos dados enviados para o teclado.
         * Ao ser invocado fica aguardando a entrada de dados.
         *
         */
        Scanner leitor = new Scanner(System.in);
        String nomeProfessor;

        System.out.println("Informe o seu nome:");
        // Ap�s a exibi��o do texto fica aguardando a digita��o dedos
        nomeProfessor = leitor.nextLine();

        // Exibe as informa��es digitadas no console para o usu�rio.
        System.out.println("Nome " + nomeProfessor);


        /*
        Continue o c�digo, fa�a a impress�o por meio do objeto ProfessorRodrigoFujioka, colhendo
        tamb�m as informa��es de idade*/

    }


}
