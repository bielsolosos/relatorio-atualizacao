import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotebookDB {

    // Simula nosso "banco de dados"
    // Simula nosso "banco de dados"
    public List<Map<String, String>> listarTodos() {
        List<Map<String, String>> dados = new ArrayList<>();

        Map<String, String> nb1 = new HashMap<>();
        nb1.put("dono", "Gabriel");
        nb1.put("marca", "Lenovo");
        nb1.put("modelo", "ThinkPad");
        nb1.put("versaoWindows", "10");
        dados.add(nb1);

        Map<String, String> nb2 = new HashMap<>();
        nb2.put("dono", "Murilo");
        nb2.put("marca", "Dell");
        nb2.put("modelo", "Latitude");
        nb2.put("versaoWindows", "12");
        dados.add(nb2);

        Map<String, String> nb3 = new HashMap<>();
        nb3.put("dono", "José");
        nb3.put("marca", "HP");
        nb3.put("modelo", "Pavilion");
        nb3.put("versaoWindows", "11");
        dados.add(nb3);

        Map<String, String> nb4 = new HashMap<>();
        nb4.put("dono", "Ana");
        nb4.put("marca", "Acer");
        nb4.put("modelo", "Aspire");
        nb4.put("versaoWindows", "12");
        dados.add(nb4);

        Map<String, String> nb5 = new HashMap<>();
        nb5.put("dono", "Jorge");
        nb5.put("marca", "Samsung");
        nb5.put("modelo", "Book");
        nb5.put("versaoWindows", "7");
        dados.add(nb5);

        return dados;
    }
}
