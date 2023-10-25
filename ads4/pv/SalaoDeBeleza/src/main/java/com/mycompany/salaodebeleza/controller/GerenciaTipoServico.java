/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salaodebeleza.controller;

import com.mycompany.salaodebeleza.model.TipoServico;
import java.util.ArrayList;

public class GerenciaTipoServico {
    private ArrayList<TipoServico> tiposServico;
    private Integer codigo;

    public GerenciaTipoServico(ArrayList<TipoServico> tiposServico) {
        this.tiposServico = tiposServico;
        this.codigo = 1;
    }
    
    public void gerarCodigo() {
        codigo += 1;
    }
    
    public String getCodigo() {
        return codigo.toString();
    }
    
    public boolean inserir(int codigo, String nome, String descricao, float preco) {
        TipoServico tipoServico = new TipoServico(codigo, nome, descricao, preco);

        tiposServico.add(tipoServico);

        return true;
    }
}
