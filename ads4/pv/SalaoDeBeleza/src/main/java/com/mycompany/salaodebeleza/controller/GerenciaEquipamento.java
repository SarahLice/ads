/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salaodebeleza.controller;

import com.mycompany.salaodebeleza.model.Equipamento;
import com.mycompany.salaodebeleza.model.Funcionario;
import java.util.ArrayList;

public class GerenciaEquipamento {
    private ArrayList<Equipamento> equipamentos;
    private Integer codigo;

    public GerenciaEquipamento(ArrayList<Equipamento> e) {
        equipamentos = e;
        codigo = 1;
    }
    
    public boolean inserir(int codigo, String nome, String descricao, Funcionario funcionario) {
        Equipamento equipamento = new Equipamento(codigo, nome, descricao, funcionario);
        
        equipamentos.add(equipamento);
        
        return true;
    }
    
    public void gerarCodigo(){
        codigo += 1;
    }
    
    public String getCodigo(){
        return codigo.toString();
    }
}
