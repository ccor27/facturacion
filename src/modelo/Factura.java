/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import service.Observador;

/**
 *
 * @author cristian
 */
public class Factura implements Observador {

    private ArrayList<Item> listaItemnFactura;

    public Factura() {
        listaItemnFactura = new ArrayList<>();
    }

    public ArrayList<Item> getListaItemnFactura() {
        return listaItemnFactura;
    }

    public void setListaItemnFactura(ArrayList<Item> listaItemnFactura) {
        this.listaItemnFactura = listaItemnFactura;
    }

    public void agregarItem(String concepto, double precio, int cantidad) {

        Item item = new Item(concepto, precio, cantidad);

        if (listaItemnFactura.contains(item)) {
            JOptionPane.showMessageDialog(null, "este item ya existe, si desea puede agregar mas cantidad");
        } else {
            listaItemnFactura.add(item);

        }
    }

    public void eliminarItem(String concepto) {

        for (int i = 0; i < listaItemnFactura.size(); i++) {
            Item item = listaItemnFactura.get(i);
            if (item.getConcepto().equalsIgnoreCase(concepto)) {
                //System.out.println("concepto del item a eliminar: " + item.getConcepto());
                listaItemnFactura.remove(item);
                //System.out.println("lo elimino");
            }
        }
    }

    public void modificarItem(String concepto, double precio, int cantidad) {

        for (Item item : listaItemnFactura) {
            if (item.getConcepto().equalsIgnoreCase(concepto)) {
                item.setPrecio(precio);
                item.setCantidad(cantidad);
                notificar(item);
                //notificarObservadores();
            }
        }

    }

    public Item obtenerItem(String concepto) {

        Item itemRetornar = null;

        for (Item item : listaItemnFactura) {

            if (item.getConcepto().equalsIgnoreCase(concepto)) {
                itemRetornar = item;
            }
        }

        return itemRetornar;
    }

    public double calcularIva(double subtotal) {

        return (subtotal * 15) / 100;
    }

    @Override
    public void notificar(Item itemModif) {
        //System.out.println("entro a notificar");
        for (Item item : listaItemnFactura) {
            if (item.equals(itemModif)) {
                item.Actualizar(item);
            }
        }
    }

}
