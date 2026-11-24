package app;
import model.*;
import util.LectorProveedores;
import service.AdministradorProveedores;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     LISTA DE PROVEEDORES     ");
        System.out.println("=================================\n");

        AdministradorProveedores gestor = new AdministradorProveedores();
        String rutaArchivo = "src/resources/archivo.txt";

        System.out.println("--PROVEEDORES EXISTENTES--");
        List<Proveedor> proveedores = LectorProveedores.cargarDesdeArchivo(rutaArchivo);
        gestor.setListaDeProveedores(proveedores);

        System.out.println("\n --LISTA COMPLETA DE PROVEEDORES--");
        for(Proveedor proveedor : proveedores){
            System.out.println(proveedor.toString());
        }

        String filtrocasas = "Casas AirBnb";
        System.out.println("\n --ALOJAMIENTOS FILTRADOS (TIPO: " + filtrocasas.toUpperCase() +")--");
        List<Proveedor> buscarAlojamientos = gestor.buscarPorAlojamientos(filtrocasas);
        for (Proveedor p : buscarAlojamientos) {
            System.out.println(p);
        }

        String findeSemana = "Viernes a Domingo";
        System.out.println("\n --ALOJAMIENTOS FILTRADOS (TIPO: " + findeSemana.toUpperCase() +")--");
        List<Proveedor> buscarDiasDeOferta = gestor.buscarDiasdeOferta(findeSemana);
        for (Proveedor p : buscarDiasDeOferta) {
            System.out.println(p);
        }
    }
}