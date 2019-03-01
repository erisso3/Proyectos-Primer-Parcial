/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author eriss
 */
public class Particular extends Pasajero{

    public Particular(String placa, String noSerie, String marca, Integer modelo, double valorFactura, Integer noPasajeros) {
        super(placa, noSerie, marca, modelo, valorFactura, noPasajeros);
    }
     public String toString(){
        return String.format("Placa:%s\nNumero de serie:%s\nMarca:%s\nModelo:%d\nImpuesto:%.2f\nNumero de pasajero:%d\n",this.getPlaca(),this.getNoSerie(),this.getMarca(),this.getModelo(),this.getValorFactura(),this.getNoPasajeros());
    }
}
