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
public class Taxi extends Pasajero {

    private Integer aniosConcesion;
    public Taxi(String placa, String noSerie, String marca, Integer modelo, double valorFactura, Integer noPasajeros,Integer anios) {
        super(placa, noSerie, marca, modelo, valorFactura, noPasajeros);
        this.aniosConcesion=anios;
    }

     public String toString(){
        return String.format("Placa:%s\nNumero de serie:%s\nMarca:%s\nModelo:%d\nImpuesto:%.2f\nAños de concesion:%d\n",this.getPlaca(),this.getNoSerie(),this.getMarca(),this.getModelo(),this.getValorFactura(),this.getAniosConcesion());
    }
    
    @Override
    public double calcularTenencia() {
        return super.calcularTenencia()*(1+(this.getNoPasajeros()/10.0));
    }

    
    /**
     * @return the aniosConcesion
     */
    public Integer getAniosConcesion() {
        return aniosConcesion;
    }

    /**
     * @param aniosConcesion the aniosConcesion to set
     */
    public void setAniosConcesion(Integer aniosConcesion) {
        this.aniosConcesion = aniosConcesion;
    }
    
    
}
