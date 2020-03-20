/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import static productos.Venta1.listaFact;

/**
 *
 * @author Jorge Tapia Flores
 */
public class Metodos {

    public static DefaultListModel obtenerStock(ArrayList<Industriales> a, 
            ArrayList<Utensilios> b, ArrayList<Comestibles> c, ArrayList<Oficina> d) {
        DefaultListModel texto = new DefaultListModel<>();
        
        int i = 0;
        for (Industriales f : a) {
             texto.addElement(f.getNombre());
            i++;
        }
        for (Utensilios f : b) {
             texto.addElement(f.getNombre());
            i++;
        }
        for (Comestibles f : c) {
             texto.addElement(f.getNombre());
            i++;
        }
        for (Oficina f : d) {
             texto.addElement(f.getNombre());
            i++;
        }
        
        return texto;
    }
    public static DefaultListModel buscar(String aux){
        DefaultListModel texto = new DefaultListModel<>();
        
            for (Industriales d : ControlStock.listaInd) {
                   if (d.getNombre().equals(aux)) {
                       texto.addElement(d.getNombre());
                       texto.addElement(d.getCosto());
                       texto.addElement(d.getStock());
                       texto.addElement(d.getTipo()); 
                   }}
            for (Comestibles d : ControlStock.listaCome) {
                   if (d.getNombre().equals(aux)) {
                       texto.addElement(d.getNombre());
                       texto.addElement(d.getCosto());
                       texto.addElement(d.getStock());
                       texto.addElement(d.getTipo()); 
                   }}
            for (Utensilios d : ControlStock.listaUten) {
                   if (d.getNombre().equals(aux)) {
                       texto.addElement(d.getNombre());
                       texto.addElement(d.getCosto());
                       texto.addElement(d.getStock());
                       texto.addElement(d.getTipo()); 
                   }}

            for (Oficina d : ControlStock.listaOfi) {
                   if (d.getNombre().equals(aux)) {
                       texto.addElement(d.getNombre());
                       texto.addElement(d.getCosto());
                       texto.addElement(d.getStock());
                       texto.addElement(d.getTipo()); 
                   }}   
        return texto;
    } }


  


