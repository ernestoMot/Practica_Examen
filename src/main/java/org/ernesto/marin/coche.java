package org.ernesto.marin;

public class coche {

 /*<coche id="3">
    <marca>Suzuki</marca>
    <modelo>Vitara</modelo>
    <cilindrada>1.9</cilindrada>
  </coche>*/


    String marca;
    String modelo;
    String cilindrada;
    String id;


    public coche() {

    }

    public coche(String marca, String modelo, String cilindrada, String id) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
