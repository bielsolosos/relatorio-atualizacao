import java.util.Map;

public class RelatorioService {

    public static String gerarRelatorio() {
        NotebookDB bancoDeDadosNotebook = new NotebookDB();
        StringBuilder sb = new StringBuilder();
        sb.append("=== Relatório de Atualização de Windows ===\n");

        // Recebe dados crus e monta os objetos Notebook
        for (Map<String, String> dados : bancoDeDadosNotebook.listarTodos()) {
            Notebook n = criarNotebook(dados);

            if (precisaAtualizar(n)) {
                sb.append(n.getDono())
                        .append(" precisa atualizar o Windows (atual: ")
                        .append(n.getVersaoWindows())
                        .append(")\n");
            }
        }

        return sb.toString();
    }

    // Monta um objeto Notebook a partir dos dados do "banco"
    private static Notebook criarNotebook(Map<String, String> dados) {
        String dono = dados.get("dono");
        String marca = dados.get("marca");
        String modelo = dados.get("modelo");
        int versaoWindows = Integer.parseInt(dados.get("versaoWindows"));

        return new Notebook(dono, marca, modelo, versaoWindows);
    }

    public static boolean precisaAtualizar(Notebook notebookParaAtualizar) {
        return notebookParaAtualizar.getVersaoWindows() < 12 ? true : false;
    }
}