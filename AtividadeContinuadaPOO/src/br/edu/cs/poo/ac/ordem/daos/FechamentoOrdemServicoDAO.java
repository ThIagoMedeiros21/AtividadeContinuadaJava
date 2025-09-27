package br.edu.cs.poo.ac.ordem.daos;
import java.io.Serializable;
import br.edu.cs.poo.ac.ordem.entidades.FechamentoOrdemServico;
import br.edu.cs.poo.ac.ordem.daos.DAOGenerico;
public class FechamentoOrdemServicoDAO extends DAOGenerico {
    public FechamentoOrdemServicoDAO() {
        super(FechamentoOrdemServico.class);
    }
    public FechamentoOrdemServico buscar(String numeroOrdemServico) {
        return (FechamentoOrdemServico) cadastroObjetos.buscar(numeroOrdemServico);
    }
    public boolean incluir(FechamentoOrdemServico fechamentoOrdemServico) {
        if (buscar(fechamentoOrdemServico.getNumeroOrdemServico()) == null) {
            cadastroObjetos.incluir(fechamentoOrdemServico, fechamentoOrdemServico.getNumeroOrdemServico());
            return true;
        } else {
            return false;
        }
    }
    public boolean alterar(FechamentoOrdemServico fechamentoOrdemServico) {
        if (buscar(fechamentoOrdemServico.getNumeroOrdemServico()) == null) {
            return false;
        } else {
            cadastroObjetos.alterar(fechamentoOrdemServico, fechamentoOrdemServico.getNumeroOrdemServico());
            return true;
        }
    }
    public boolean excluir(String numeroOrdemServico) {
        if (buscar(numeroOrdemServico) == null) {
            return false;
        } else {
            cadastroObjetos.excluir(numeroOrdemServico);
            return true;
        }
    }
    public FechamentoOrdemServico[] buscarTodos() {
        Serializable[] ret = cadastroObjetos.buscarTodos();
        FechamentoOrdemServico[] retorno;
        if (ret != null && ret.length > 0) {
            retorno = new FechamentoOrdemServico[ret.length];
            for (int i = 0; i < ret.length; i++) {
                retorno[i] = (FechamentoOrdemServico) ret[i];
            }
        } else {
            retorno = new FechamentoOrdemServico[0];
        }
        return retorno;
    }
}
