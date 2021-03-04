package herencia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prog
 */
public class Vehiculo {

    
    
    String matricula;
    String marca;
    String modelo;
    String color;
    int numRuedas;
    int numPuertas;
    int numPlazas;
    int potencia;
    int capacidadMaletero;
    Seguro seguro;

    public Vehiculo(){
        
    }
    
    public Vehiculo(String matricula, String marca, String modelo, String color,int numRuedas, int numPuertas, int numPlazas, int Potencia, int capacidadMaletero, Seguro seguro) {
        this.numRuedas = numRuedas;
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.potencia = Potencia;
        this.capacidadMaletero = capacidadMaletero;
        this.seguro = seguro;
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numRuedas=" + numRuedas + ", numPuertas=" + numPuertas + ", numPlazas=" + numPlazas + ", Potencia=" + potencia + ", capacidadMaletero=" + capacidadMaletero + ", seguro=" + seguro + '}';
    }
    
    //EQUALS
    
    public boolean Equals(Vehiculo other){
        if(!this.matricula.equals(other.matricula)){
            return false;
        }if(!this.marca.equals(other.marca)){
            return false;
        }if(!this.modelo.equals(other.modelo)){
            return false;
        }if(!this.color.equals(other.color)){
            return false;
        }if(this.numRuedas != other.numRuedas){
            return false;
        }if(this.numPuertas != other.numPuertas){
            return false;
        }if(this.numPlazas != other.numRuedas){
            return false;
        }if(this.potencia != other.numRuedas){
            return false;
        }if(this.capacidadMaletero != other.capacidadMaletero){
            return false;
        }
            
            return true;
    }
    
    
    public static void Arrancar(){
        System.out.println("Vehiculo Arrancado");
    }
    public static void Avanzar(){
        System.out.println("Vehiculo En Movemiento");
    }
    public static void Detener(){
        System.out.println("Vehiculo Detenido");
    }
    
    //GETTERS
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setNumePlazas(int numePlazas) {
        this.numPlazas = numePlazas;
    }

    public void setPotencia(int Potencia) {
        this.potencia = Potencia;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
    
    //SETTERS

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public int getNumePlazas() {
        return numPlazas;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public Seguro getSeguro() {
        return seguro;
    }
}
