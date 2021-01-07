/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Factura;
import modelo.Item;

/**
 *
 * @author cristian
 */
public class VistaTotalesController {

    Factura factura;

    public VistaTotalesController( Factura factura) {
        this.factura = factura;
    }

    public ArrayList<Item> obtenerListaItem() {
        return factura.getListaItemnFactura();
    }

}
