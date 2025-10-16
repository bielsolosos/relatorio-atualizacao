package Domain.Factory.Creator.ConcreteFactory;

import java.util.Map;

import Domain.Factory.Creator.NotebookFactory;
import Domain.Factory.Product.Notebook;
import Domain.Factory.Product.ConcreteProducts.WindowsNotebook;

public class WindowsNotebookFactory implements NotebookFactory {

    @Override
    public Notebook criarNotebook(Map<String, String> dados) {
        String dono = dados.get("dono");
        String marca = dados.get("marca");
        String modelo = dados.get("modelo");
        int versao = Integer.parseInt(dados.get("versaoSO"));

        return new WindowsNotebook(dono, marca, modelo, versao);
    }
    
}