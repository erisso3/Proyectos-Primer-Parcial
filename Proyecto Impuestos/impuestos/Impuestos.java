/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestos;

import Coleccion.MyArrayList;
import Objects.Camion;
import Objects.Camioneta;
import Objects.Particular;
import Objects.Taxi;
import Objects.Vehiculo;

/**
 *
 * @author eriss
 */
public class Impuestos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Particular p=new Particular("UEHX","JDIE9", "HONDA", 2003,29034.1,9);
        Taxi t=new Taxi("HSDJS","DJSHDDF", "BMW", 1999,29044,3,5);
        Camioneta camio=new Camioneta("HSDJS","HDIWSOD", "HONDA", 2000,29043.12,10,true);
        Camion ca=new Camion("SKFIS","JDIE9", "HOND", 2019,290034.2,4,true,7);
        
      
        MyArrayList vehiculos= new MyArrayList();
        vehiculos.add(p);
        vehiculos.add(t);
        vehiculos.add(camio);
        vehiculos.add(ca);
        
        for(Vehiculo v:vehiculos){
            System.out.println(v.toString());
        }
        System.out.println("Listado de placas");
        for(Vehiculo v:vehiculos){
            System.out.println("*"+v.getPlaca());
        }
        System.out.println("\nListado de Numero de serie");
        for(Vehiculo v:vehiculos){
            System.out.println("*"+v.getNoSerie());
        }
        System.out.println("\nListado de Modelos");
        for(Vehiculo v:vehiculos){
            System.out.println("*"+v.getModelo());
        }
        System.out.println("\nListado de Impuesto");
        for(Vehiculo v:vehiculos){
            System.out.println("*"+v.getValorFactura());
        }
    }
    
}
