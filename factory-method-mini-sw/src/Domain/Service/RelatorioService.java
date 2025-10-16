package Domain.Service;

import java.util.Map;

import DB.NotebookDB;
import Domain.Factory.Creator.NotebookFactory;
import Domain.Factory.Creator.ConcreteFactory.WindowsNotebookFactory;
import Domain.Factory.Product.Notebook;

public class RelatorioService {

    private final NotebookDB banco;
    private final NotebookFactory factory;

    public RelatorioService(String tipoFactory) {
        this.banco = new NotebookDB();

        if (tipoFactory.equals("Windows")) {
            this.factory = new WindowsNotebookFactory();
        } else {
            this.factory = null;
        }
    }

    public String gerarRelatorio() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Relatório de Atualização de SO ===\n");

        for (Map<String, String> dados : banco.listarTodos()) {
            Notebook notebook = factory.criarNotebook(dados);

            if (precisaAtualizar(notebook)) {
                sb.append(notebook.getDono())
                        .append(" precisa atualizar o ")
                        .append(notebook.getTipoSistema())
                        .append(" (atual: ")
                        .append(notebook.getVersaoSO())
                        .append(")\n");
            }
        }

        return sb.toString();
    }

    private boolean precisaAtualizar(Notebook notebook) {
        return notebook.getVersaoSO() < 12;
    }
}
