/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.alvimpl.atestados.entidadesRN;

/**
 *
 * @author Alvaro
 */
public interface AtestadoRN {
    public void checaDuplicado(); // checar funcionário e data
    public void checaDataAtestado(); // checar se o atestado está com data futura
    public void checaAtestadoVigente(); // checar se o funcionário já está com algum atestado ativo
    public void checaSomaAtestado(); // checar se a soma de dias de atestado com o mesmo cid ultrapassa 15 dias em determinado prazo
}
