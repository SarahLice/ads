/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salaodebeleza.controller;

import com.mycompany.salaodebeleza.model.Servico;
import java.util.ArrayList;

public class GerenciaServico {
    private ArrayList<Servico> servicos;
    private Integer codigo;

    public GerenciaServico(ArrayList<Servico> servicos) {
        this.servicos = servicos;
        this.codigo = 1;
    }
    
    public void gerarCodigo(){
        codigo += 1;
    }
    
    public String getCodigo(){
        return codigo.toString();
    }
    
}
