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
public class Camioneta extends Carga {

    public Camioneta(String placa, String noSerie, String marca, Integer modelo, double valorFactura, Integer toneladas, boolean publico) {
        super(placa, noSerie, marca, modelo, valorFactura, toneladas, publico);
    }
    
    public String toString(){
        return String.format("Placa:%s\nNumero de serie:%s\nMarca:%s\nModelo:%d\nImpuesto:%.2f\nToneladas:%d\nPublico:%b\n",this.getPlaca(),this.getNoSerie(),this.getMarca(),this.getModelo(),this.getValorFactura(),this.getToneladas(),this.isPublico());
    }
}
