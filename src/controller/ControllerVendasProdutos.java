package controller;

import model.ModelVendasProdutos;
import DAO.DAOVendasProdutos;
import java.util.ArrayList;

/**
*
* @author Leandro
*/
public class ControllerVendasProdutos {

    private DAOVendasProdutos daoVendasProdutos = new DAOVendasProdutos();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * return int
    */
    public int salvarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * recupera VendasProdutos
    * @param pIdVendaProduto
    * return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosController(int pIdVendaProduto){
        return this.daoVendasProdutos.getVendasProdutosDAO(pIdVendaProduto);
    }

    /**
    * recupera uma lista deVendasProdutos
    * 
    * return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * return boolean
    */
    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pIdVendaProduto
    * return boolean
    */
    public boolean excluirVendasProdutosController(int pIdVendaProduto){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pIdVendaProduto);
    }

    /**
     * Salvar um lista de produtos da venda
     * @param pListaModelVendasProdutoses
     * @return 
     */
    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> pListaModelVendasProdutoses) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(pListaModelVendasProdutoses);
    }
}