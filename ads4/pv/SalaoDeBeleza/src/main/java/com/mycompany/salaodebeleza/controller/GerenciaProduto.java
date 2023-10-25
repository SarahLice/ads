/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salaodebeleza.controller;

import com.mycompany.salaodebeleza.model.Produto;
import java.util.ArrayList;

public class GerenciaProduto {
    private ArrayList<Produto> produtos;
    private Integer codigo;

    public GerenciaProduto(ArrayList<Produto> produtos) {
        this.produtos = produtos;
        this.codigo = 1;
    }
    
    public boolean inserir(int codigo, String nome, String descricao, int quantidadeDisponivel, float preco) {
        Produto produto = new Produto(nome, descricao, quantidadeDisponivel, preco);
        
        produto.setCodigo(codigo);
        
        produtos.add(produto);
        
        return true;
    }
    
    public void gerarCodigo(){
        codigo += 1;
    }
    
    public String getCodigo(){
        return codigo.toString();
    }
    
}
