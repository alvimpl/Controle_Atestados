/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.alvimpl.atestados.entidades;

import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Alvaro
 */
class Funcao {
    @Id
    @PrimaryKeyJoinColumn
    private int id;
    public String descricao;
}
