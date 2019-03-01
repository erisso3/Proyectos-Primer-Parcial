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
public abstract  class Vehiculo {
    private String placa;
    private String noSerie;
    private String marca;
    private Integer modelo;
    private double valorFactura;

    public Vehiculo(String placa, String noSerie, String marca, Integer modelo, double valorFactura) {
        this.placa = placa;
        this.noSerie = noSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.valorFactura = valorFactura;
    }
    
    public String toString(){
        return String.format("Placa:%s\nNumero de serie:%s\nMarca:%s\nModelo:%d\nImpuesto:%.2f\n",this.getPlaca(),this.getNoSerie(),this.getMarca(),this.getModelo(),this.getValorFactura());
    }

    public abstract double calcularTenencia();
    
    public double calcularBaseGravable(){
        return this.modelo>=2009?0.05:0.02;
    }

    /*@Override
    public boolean equals(Object obj) {
        if(obj instanceof Vehiculo){
            Vehiculo v=(Vehiculo)obj;
            return this.getPlaca()=
        }
    }
    
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the noSerie
     */
    public String getNoSerie() {
        return noSerie;
    }

    /**
     * @param noSerie the noSerie to set
     */
    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public Integer getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the valorFactura
     */
    public double getValorFactura() {
        return valorFactura;
    }

    /**
     * @param valorFactura the valorFactura to set
     */
    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }
    
    
    
}
