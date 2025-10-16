package DB;

import java.util.*;

public class NotebookDB {

    public List<Map<String, String>> listarTodos() {
        List<Map<String, String>> dados = new ArrayList<>();

        Map<String, String> nb1 = Map.of("dono", "Gabriel", "marca", "Lenovo", "modelo", "ThinkPad", "versaoSO", "10");
        Map<String, String> nb2 = Map.of("dono", "Murilo", "marca", "Dell", "modelo", "Latitude", "versaoSO", "12");
        Map<String, String> nb3 = Map.of("dono", "José", "marca", "HP", "modelo", "Pavilion", "versaoSO", "11");
        Map<String, String> nb4 = Map.of("dono", "Ana", "marca", "Acer", "modelo", "Aspire", "versaoSO", "12");
        Map<String, String> nb5 = Map.of("dono", "Jorge", "marca", "Samsung", "modelo", "Book", "versaoSO", "7");

        dados.add(nb1);
        dados.add(nb2);
        dados.add(nb3);
        dados.add(nb4);
        dados.add(nb5);

        return dados;
    }
}
