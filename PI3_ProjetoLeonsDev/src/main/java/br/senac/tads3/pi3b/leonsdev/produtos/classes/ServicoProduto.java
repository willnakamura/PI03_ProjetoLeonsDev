/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.produtos.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoProdutos;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.ProdutoException;
import java.util.List;

/**
 *
 * @author Rafael Rodrigues
 */
public class ServicoProduto {

    public static void cadastrarProduto(Produtos prod) throws DataExceptions, ProdutoException {

        try {
            ValidadorProduto.Validar(prod);
        } catch (ProdutoException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

        try {
            DaoProdutos.inserir(prod);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }

    public static void atualizarProduto(Produtos prod) throws ProdutoException, DataExceptions {

        ValidadorProduto.Validar(prod);

        try {
            DaoProdutos.atualizar(prod);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um cliente por nome na fonte de dados
    public static List<Produtos> procurarProduto(String valor) throws ProdutoException, DataExceptions {

        try {
            if (valor.equals("") || valor == null) {
                return DaoProdutos.listar();
            } else {
                return DaoProdutos.procurar(valor);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados", e);
        } 
        
    }

    public static Produtos obterProduto(Integer id) throws ProdutoException, DataExceptions {
        try {
            return DaoProdutos.obter(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }

    public static void excluirProduto(Integer id) throws ProdutoException, DataExceptions {
        try {
            DaoProdutos.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }
}
