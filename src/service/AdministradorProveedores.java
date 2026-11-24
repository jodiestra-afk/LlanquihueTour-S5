package service;
import model.*;
import java.util.List;
import java.util.ArrayList;

public class AdministradorProveedores {
    private List<Proveedor> listaDeProveedores;

    public AdministradorProveedores() {
        this.listaDeProveedores = new ArrayList<>();
    }

    public List<Proveedor> getListaDeProveedores() {
        return listaDeProveedores;
    }

    public void setListaDeProveedores(List<Proveedor> lista) {
        this.listaDeProveedores = lista;
    }

    public void VerProveedores(){
        if(listaDeProveedores.isEmpty()){
            System.out.println("Proveedores no registrados");
            return;
        }
        for (Proveedor p: listaDeProveedores){
            System.out.println(p);
        }
    }

    public List<Proveedor> buscarPorAlojamientos(String alojamientos){
        List<Proveedor> resultados = new ArrayList<>();
        for (Proveedor p: listaDeProveedores){
            if (p.getServicios().getAlojamiento().equalsIgnoreCase(alojamientos)){
                resultados.add(p);
            }
        }
        return resultados;
    }

    public List<Proveedor> buscarDiasdeOferta(String diasOfertas){
        List<Proveedor> resultados = new ArrayList<>();
        for(Proveedor p:listaDeProveedores){
            if (p.getHorarios().getDiasDeOferta().equalsIgnoreCase(diasOfertas)){
                resultados.add(p);
            }
        }
        return resultados;
    }
}