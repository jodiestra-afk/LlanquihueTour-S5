package model;

public class Horarios  {
    private String diasDeOferta;

    public Horarios() {
    }

    public Horarios(String diasDeOferta) {
        this.diasDeOferta = diasDeOferta;
    }

    public String getDiasDeOferta() {
        return diasDeOferta;
    }

    public void setDiasDeOferta(String diasDeOferta) {
        this.diasDeOferta = diasDeOferta;
    }

    @Override
    public String toString() {
        return "diasConDescuento: '" + diasDeOferta + '\'';
    }
}