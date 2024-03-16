package DTO;

public class VehiculoDTO {

    private String color;
    private String linea;
    private String marca;
    private String modelo;
    private int numSerie;

    public VehiculoDTO() {
    }

    public VehiculoDTO(String color, String linea, String marca, String modelo, int numSerie) {
        this.color = color;
        this.linea = linea;
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
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

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

}
