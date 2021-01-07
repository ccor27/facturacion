/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Factura;
import modelo.Item;
import vista.VistaEditar;
import vista.VistaListado;

/**
 *
 * @author cristian
 */
public class VistaInsertarController {

    Factura factura;
    VistaListado vistaListado;
    VistaEditar ventanaEditar;

    public VistaInsertarController(Factura factura, VistaListado vistaListado,VistaEditar ventanaEditar) {
        this.factura = factura;
        this.vistaListado = vistaListado;
        this.ventanaEditar= ventanaEditar;

    }

    public void crearItem(String concepto, double precio, int cantidad) {
        factura.agregarItem(concepto, precio, cantidad);
    }
    public void llenarTabla(){
        vistaListado.llenarTabla();
    }
    public void agregarItemsComboBox(){
        ventanaEditar.agregarItemsComboBox();
    }
}
