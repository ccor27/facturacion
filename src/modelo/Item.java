/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;
import service.Observado;
import service.Observador;

/**
 *
 * @author cristian
 */
public class Item  implements Observado{
    
    private String concepto;
    private double precio;
    private int cantidad;
    private double total;

    public Item(String concepto, double precio, int cantidad) {
        this.concepto = concepto;
        this.precio = precio;
        this.cantidad = cantidad;
        calcularTotal();
        
    }
    
    public void calcularTotal(){
        this.total = precio*cantidad;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
       // notificarObservadores();
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        calcularTotal();
        //notificarObservadores();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        calcularTotal();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public void Actualizar(Item item) {
        //System.out.println("entro a actualizar");
        JOptionPane.showMessageDialog(null, "el item "+this.concepto+" se ha modificado");
       // System.out.println();
    }
    


    
    
}
