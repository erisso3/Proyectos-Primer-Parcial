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
public class Camion extends Carga {

    private Integer ejes;
    public Camion(String placa, String noSerie, String marca, Integer modelo, double valorFactura, Integer toneladas, boolean publico,Integer ejes) {
        super(placa, noSerie, marca, modelo, valorFactura, toneladas, publico);
        this.ejes=ejes;
    }

     public String toString(){
        return String.format("Placa:%s\nNumero de serie:%s\nMarca:%s\nModelo:%d\nImpuesto:%.2f\nToneladas:%d\nPublico:%b\nNumero de ejes:%d\n",this.getPlaca(),this.getNoSerie(),this.getMarca(),this.getModelo(),this.getValorFactura(),this.getToneladas(),this.isPublico(),this.getEjes());
    }
    
    @Override
    public double calcularBaseGravable() {
        return super.calcularBaseGravable()*(1+(this.ejes*0.01));
    }

    
    public Integer getEjes() {
        return ejes;
    }

    public void setEjes(Integer ejes) {
        this.ejes = ejes;
    }
    
}
