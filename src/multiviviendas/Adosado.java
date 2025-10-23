/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiviviendas;

/**
 *
 * @author pau
 */
// La clase Adosado también hereda de Vivienda
public class Adosado extends Vivienda {
    private int numPlantas;

    // Constructor
    public Adosado(String calle, int superficieEnMetros, int numPlantas) {
        super(calle, superficieEnMetros);
        this.numPlantas = numPlantas;
    }

    // El impuesto es el 5% del precio
    @Override
    public double impuestoMunicipal() {
        return getPrecio() * 0.05;
    }

    // Muestra la información del adosado
    @Override
    public String toString() {
        return "Adosado - " + super.toString() + ", Número de plantas: " + numPlantas +
               ", Impuesto: " + impuestoMunicipal();
    }
}

    
