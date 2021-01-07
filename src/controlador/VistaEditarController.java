/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Factura;
import modelo.Item;
import vista.VistaListado;

/**
 *
 * @author cristian
 */
public class VistaEditarController {
    
    Factura factura;
    VistaListado vistaListado;

    public VistaEditarController( Factura factura,VistaListado vistaListado) {
        this.factura = factura;
        this.vistaListado = vistaListado;
    }
    
    public Item obtenerItem(String concepto){
        return factura.obtenerItem(concepto);
    }
    
    public ArrayList<Item> obtenerItems(){
        return factura.getListaItemnFactura();
    }
    
    public void mofificarItem(String concepto, double precio, int cantidad){
        factura.modificarItem(concepto, precio, cantidad);
    }
    public void eliminarItem(String concepto){
        factura.eliminarItem(concepto);
    }
    public void llenarTabla(){
        vistaListado.llenarTabla();
    }
            
}
