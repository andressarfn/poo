/**
 *
 */
package com.rodrigofujioka.projeto.seguradora.tiposenumerados;

/**
 * @author rodrigo.fujioka
 *
 */
public enum TipoPessoa {

    FISICA("Pessoa F�sica"),
    JURIDICA("Pessoa Juridica");

    private String tipo;

    private TipoPessoa(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
