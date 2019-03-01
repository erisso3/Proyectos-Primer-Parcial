/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coleccion;
import java.util.ArrayList;
import Objects.Vehiculo;
/**
 *
 * @author eriss
 */
public class MyArrayList extends ArrayList<Vehiculo> {

    @Override
    public boolean add(Vehiculo vehiculo) {
        if(isRepetido(vehiculo)){
            return false;
        }else{
            return super.add(vehiculo);
        }
    }
    
    private Boolean isRepetido(Vehiculo vehiculo){
        boolean p=false;
        boolean encontrado=false;
        int contador=0;
        while (!encontrado&&contador<super.size()) {
            encontrado=this.get(contador).getPlaca()==vehiculo.getPlaca();
            p=this.get(contador).getNoSerie()==vehiculo.getNoSerie();
            contador++;
        }
        return encontrado||p;
        
        
    }
}
