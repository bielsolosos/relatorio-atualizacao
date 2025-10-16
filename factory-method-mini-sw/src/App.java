import Domain.Service.RelatorioService;

public class App {
    

    public static void main(String[] args) throws Exception {
         RelatorioService relatorio = new RelatorioService("Windows");

         System.out.println(relatorio.gerarRelatorio());
    }
}
