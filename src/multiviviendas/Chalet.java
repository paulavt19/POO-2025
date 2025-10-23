
package multiviviendas;


// La clase Chalet hereda de Vivienda
public final class Chalet extends Vivienda {
    private final int numParcela;
    private final boolean conPiscina;

    // Constructor
    public Chalet(String calle, int superficieEnMetros, int numParcela, boolean conPiscina) {
        super(calle, superficieEnMetros);
        this.numParcela = numParcela;
        this.conPiscina = conPiscina;
        this.precio = calcularPrecio(); // recalcula el precio según la regla especial
    }

    // El chalet cuesta más: 1300 por metro cuadrado
    @Override
    public double calcularPrecio() {
        return superficieEnMetros * 1300;
    }

    // El impuesto es el 5% del precio + 200 si tiene piscina
    @Override
    public double impuestoMunicipal() {
        double impuesto = getPrecio() * 0.05;
        if (conPiscina) {
            impuesto += 200;
        }
        return impuesto;
    }

    // Muestra toda la información del chalet
    @Override
    public String toString() {
        return "Chalet - " + super.toString() + ", Parcela: " + numParcela +
               ", Piscina: " + (conPiscina ? "Sí" : "No") +
               ", Impuesto: " + impuestoMunicipal();
    }
}
    
