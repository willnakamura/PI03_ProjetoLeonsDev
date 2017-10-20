/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.produtos.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.ProdutoException;

/**
 *
 * @author Rafael Rodrigues
 */
public class ValidadorProduto {
    public static void Validar (Produtos prod) throws ProdutoException{
        if(prod == null){
            throw new ProdutoException("Dados inválidos!");
        }
        
        if(prod.getCombo() == null || prod.getCombo().equals("")){
            throw new ProdutoException("Favor informar o combo desejado.");
        }
        
        if(prod.getCombo().length() > 45){
            throw new ProdutoException("Dados informados sao inválidos.");
        }
        
        if(prod.getPreco() == null || prod.getPreco().equals("")){
            throw new ProdutoException("Favor informar um preço.");
        }
        
        if(prod.getPreco() <= 0){
            throw new ProdutoException("Preço inválido!");
        }
    }
}
