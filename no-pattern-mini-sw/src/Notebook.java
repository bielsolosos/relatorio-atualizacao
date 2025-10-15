public class Notebook {
    private String dono;
    private String marca;
    private String modelo;
    private int versaoWindows;

    public Notebook(String dono, String marca, String modelo, int versaoWindows) {
        this.dono = dono;
        this.marca = marca;
        this.modelo = modelo;
        this.versaoWindows = versaoWindows;
    }

    public boolean precisaAtualizar() {
        return versaoWindows < 12;
    }

    public String getDono() {
        return dono;
    }

    public int getVersaoWindows() {
        return versaoWindows;
    }

    @Override
    public String toString() {
        return dono + " - " + marca + " " + modelo + " (Windows " + versaoWindows + ")";
    }
}
