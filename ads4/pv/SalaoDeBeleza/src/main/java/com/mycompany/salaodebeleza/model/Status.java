/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salaodebeleza.model;

public enum Status{

  AGENDADO("Agendado"), CONCLUIDO("Concluído"), CANCELADO("Cancelado");

  private String descricao;

  Status(String descricao) {
     this.descricao = descricao;
  }

  public String getDescricao() {
     return descricao;
  }
}
