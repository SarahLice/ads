/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salaodebeleza.model;

public class Cliente extends Pessoa {
    private boolean eVip;

    public Cliente() {
        super();
        eVip = false;
    }

    public Cliente(boolean eVip, int codigo, String nome, String endereco, String telefone, String email) {
        super(codigo, nome, endereco, telefone, email);
        this.eVip = eVip;
    }

    public boolean getEVip() {
        return eVip;
    }

    public void setEVip(boolean eVip) {
        this.eVip = eVip;
    }
    
}
