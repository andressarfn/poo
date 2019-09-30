package com.rodrigofujioka.projeto.seguradora;

import com.rodrigofujioka.projeto.seguradora.modelo.Cliente;
import com.rodrigofujioka.projeto.seguradora.tiposenumerados.TipoPessoa;

import java.util.Scanner;

public class Principal {

    private static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {

        Menu menu = new Menu();
        int opcao = 99;
        Seguradora seguradora = new Seguradora();

        while (true) {
            menu.menuPrincipal();
            opcao = Integer.parseInt(leitor.nextLine());

        }
    }

    public static Cliente obterCliente() {
        System.out.println("Informe o c�digo");
        int codigo = Integer.parseInt(leitor.nextLine());
        System.out.println("Informe o nome: ");
        String nome = leitor.nextLine();
        System.out.println("Informe o tipo: 1- Pessoa Jur�dica\n "
                + " : 2 - F�sica");
        int tPessoa = Integer.parseInt(leitor.nextLine());
        TipoPessoa tipoPessoa = tPessoa == 1
                ? TipoPessoa.JURIDICA : TipoPessoa.FISICA;

        Cliente cliente = new Cliente();
        cliente.setCodigo(codigo);
        cliente.setNome(nome);
        cliente.setTipoPessoa(tipoPessoa);
        return cliente;
    }

}
