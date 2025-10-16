package Domain.Factory.Creator;

import java.util.Map;

import Domain.Factory.Product.Notebook;

public interface NotebookFactory {

    Notebook criarNotebook(Map<String, String> dados);

}
