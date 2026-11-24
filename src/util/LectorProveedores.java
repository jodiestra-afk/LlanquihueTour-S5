package util;
import model.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorProveedores {
    public static List<Proveedor> cargarDesdeArchivo(String rutaArchivo) {
        List<Proveedor> lista = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;

            int numlinea = 0;

            while((linea = bufferedReader.readLine()) != null) {
                numlinea++;
                if (linea.trim().isEmpty())
                    continue;

                String[] partes = linea.split(";");

                if (partes.length==6){
                    try {
                        String rut = partes[0].trim();
                        String nombre = partes[1].trim();
                        int telefono = Integer.parseInt(partes[2].trim());

                        String restaurantes = partes[3].trim();
                        String alojamientos = partes[4].trim();

                        String diasDeOferta= partes[5].trim();

                        Servicios servicios = new Servicios(restaurantes, alojamientos);
                        Horarios horarios = new Horarios(diasDeOferta);
                        Proveedor proveedor = new Proveedor(rut, nombre, telefono, servicios, horarios);

                        lista.add(proveedor);

                    }catch (NumberFormatException e){
                        System.out.println("Error en la linea " + numlinea + " : el telefono debe ser numerico");
                    }
                }else{
                    System.out.println("Error en la linea " + numlinea + " : cantidad de datos incorrectos");
                }
            }
            System.out.println("Exito: Cargado exitosamente " +lista.size()+ " proveedores");
        }
        catch(IOException e){
            System.out.println("Error al ingresar al archivo " + rutaArchivo + " : " + e.getMessage());
        }
        return lista;
    }
}