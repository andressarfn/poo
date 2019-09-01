/**
 * Projeto das trilhas de treinamento de Java b�sico ou avan�ado 
 * com foco nas certifica��es java e em treinamentos corporativos. 
 * Fontes dispon�veis em https://github.com/rodrigofujioka
 * 
 * Professor: Rodrigo da Cruz Fujioka
 * Ano: 2016
 * http://www.rodrigofujioka.com
 * http://www.fujideia.com.br
 * http://lattes.cnpq.br/0843668802633139
 * 
 * Contato: rcf4@cin.ufpe.br 
 * 
 */
package com.rodrigofujioka.javabasico.aula03_objects;

/**
 * Classe executavel utilizada para inst�nciar o objeto professor 
 * e executar algumas de suas opera��es.
 * @author: Rodrigo
 * @date: 10 de fev de 2016
 * @Time: 05:46:31
 */
public class UsaProfessor {
	
	public static void main(String[] args) {
		
		Professor fujioka = new Professor();
		
		fujioka.disciplina = "Metodologia e Linguagem de Programa��o 2";
		
		fujioka.ensina();
		
	}

}
