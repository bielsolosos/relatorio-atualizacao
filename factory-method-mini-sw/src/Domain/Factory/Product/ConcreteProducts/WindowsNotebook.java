package Domain.Factory.Product.ConcreteProducts;

import Domain.Factory.Product.Notebook;

public class WindowsNotebook implements Notebook {
    private String dono;
    private String marca;
    private String modelo;
    private int versaoWindows;

    public WindowsNotebook(String dono, String marca, String modelo, int versaoWindows) {
        this.dono = dono;
        this.marca = marca;
        this.modelo = modelo;
        this.versaoWindows = versaoWindows;
    }

    @Override
    public String getDono() {
        return dono;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public int getVersaoSO() {
        return versaoWindows;
    }

    @Override
    public String getTipoSistema() {
        return "Windows";
    }
}
