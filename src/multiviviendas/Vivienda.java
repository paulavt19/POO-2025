
package multiviviendas;

// clase abstracta base (no se puede crear un objeto directamente de esta clase)
public abstract class Vivienda implements IViviendas {
// Atributos comunes a todas las viviendas
    protected String calle;
    protected double precio;
    protected int superficieEnMetros;

    // Constructor (inicializa los datos)
    public Vivienda(String calle, int superficieEnMetros) {
        this.calle = calle;
        this.superficieEnMetros = superficieEnMetros;
        this.precio = calcularPrecio(); // el precio se calcula automáticamente
    }

    // Método que calcula el precio base (superficie * 1000)
    public double calcularPrecio() {
        return superficieEnMetros * 1000;
    }

    // Método abstracto (las clases hijas deben definirlo)
    public abstract double impuestoMunicipal();

    // Método de la interfaz: aumenta el precio en una cantidad dada
    @Override
    public void aumentarPrecio(int aumento) {
        this.precio += aumento;
    }

    // Métodos para obtener los valores (getters)
    public String getCalle() {
        return calle;
    }

    public double getPrecio() {
        return precio;
    }

    public int getSuperficieEnMetros() {
        return superficieEnMetros;
    }

    // Método para mostrar la información de la vivienda
    
    @Override
    public String toString() {
        return "Calle: " + calle + ", Superficie: " + superficieEnMetros + " m², Precio: " + precio;
    }
}
