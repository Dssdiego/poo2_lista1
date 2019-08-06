/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooiilistaum.controllers;

/**
 *
 * @author dseabra
 */
interface ICrud {
    public void cadastrar (Object o);
    public void remover (Object o);
    public void atualizar (Object o);
}
