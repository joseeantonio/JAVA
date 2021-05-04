package Actividad_7;

public class coche {
    private String color;
    private String marca;
    private String modelo;
    private int numero_caballos;
    private int numero_puertas;
    private int matricula;


    public coche(String color, String marca, String modelo, int numero_caballos, int numero_puertas, int matricula) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.numero_caballos = numero_caballos;
        this.numero_puertas = numero_puertas;
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public int getNumero_caballos() {
        return numero_caballos;
    }

    public void setNumero_caballos(int numero_caballos) {
        this.numero_caballos = numero_caballos;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }

    public void setNumero_puertas(int numero_puertas) {
        this.numero_puertas = numero_puertas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "coche{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numero_caballos=" + numero_caballos +
                ", numero_puertas=" + numero_puertas +
                ", matricula=" + matricula +
                '}';
    }


}
