import java.util.ArrayList;
import java.util.List;

public class NotebookDB {

    // Simula nosso "banco de dados"
    public List<Notebook> listarTodos() {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Gabriel", "Lenovo", "ThinkPad", 10));
        notebooks.add(new Notebook("Murilo", "Dell", "Latitude", 12));
        notebooks.add(new Notebook("José", "HP", "Pavilion", 11));
        notebooks.add(new Notebook("Ana", "Acer", "Aspire", 12));
        notebooks.add(new Notebook("Jorge", "Samsung", "Book", 7));
        return notebooks;
    }
}
