package model;

public class Servicios {
    private String restaurantes;
    private String alojamiento;

    public Servicios() {
    }

    public Servicios(String restaurantes, String alojamiento) {
        this.restaurantes = restaurantes;
        this.alojamiento = alojamiento ;
    }

    public String getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(String restaurantes) {
        this.restaurantes = restaurantes;
    }

    public String getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(String Alojamiento) {
        this.alojamiento = alojamiento;
    }

    @Override
    public String toString() {
        return "Restaurantes: '" + restaurantes + '\'' +
                ", Alojamiento: '" + alojamiento + '\'';
    }
}
