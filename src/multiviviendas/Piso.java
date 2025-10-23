
package multiviviendas;


public class Piso extends Vivienda {
    
    private int planta;
    private int puerta;

    // Constructor del Piso
    public Piso(String calle, int superficieEnMetros, int planta, int puerta) {
        super(calle, superficieEnMetros); // Llama al constructor de Vivienda
        this.planta = planta;
        this.puerta = puerta;
    }

    // El impuesto municipal es el 5% del precio
    @Override
    public double impuestoMunicipal() {
        return getPrecio() * 0.05;
    }

    // Muestra toda la información del piso
    @Override
    public String toString() {
        return "Piso - " + super.toString() + ", Planta: " + planta + ", Puerta: " + puerta +
               ", Impuesto: " + impuestoMunicipal();
    }
}

    
