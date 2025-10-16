public class RelatorioService {

    public static String gerarRelatorio() {
        NotebookDB bancoDeDadosNotebook = new NotebookDB();
        StringBuilder sb = new StringBuilder();
        sb.append("=== Relatório de Atualização de Windows ===\n");

        for (Notebook n : bancoDeDadosNotebook.listarTodos()) {
            if (precisaAtualizar(n)) {
                sb.append(n.getDono())
                        .append(" precisa atualizar o Windows (atual: ")
                        .append(n.getVersaoWindows())
                        .append(")\n");
            }
        }

        return sb.toString();
    }

    public static boolean precisaAtualizar(Notebook notebookParaAtualizar) {
        return notebookParaAtualizar.getVersaoWindows() < 12 ? true : false;
    }
}