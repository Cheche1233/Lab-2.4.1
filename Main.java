// Clase padre Bicicleta
class Bicicleta {
    // Componentes de la bicicleta
    private Rueda ruedaDelantera; // Rueda delantera
    private Rueda ruedaTrasera; // Rueda trasera
    private Cuadro cuadro; // Cuadro de la bicicleta
    private String marca; // Marca de la bicicleta

    // Constructor de la clase Bicicleta
    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro, String marca) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
        this.marca = marca;
    }

    // Métodos getter para los componentes de la bicicleta
    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public String getMarca() {
        return marca;
    }

}

// Clase componente Rueda
class Rueda {
    // Atributos de la clase Rueda
    private int presion; // Presión de la rueda
    private String color;
    private String tipoRueda; // Tipo de rueda (resina, caucho, etc.)

    // Constructor de la clase Rueda
    public Rueda(int presion, String color, String tipoRueda) {
        this.presion = presion;
        this.color = color;
        this.tipoRueda = tipoRueda;
    }

    // Métodos getter y setter para los atributos de la clase Rueda
    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoRueda() {
        return tipoRueda;
    }

    public void setTipoRueda(String tipoRueda) {
        this.tipoRueda = tipoRueda;
    }

}
// Clase componente Cuadro
class Cuadro {
    // Atributos de la clase Cuadro
    private String material; //{Acero, aluminio, fibra de carbono y titanio}
    private String tipo; 
    private String tamaño; 

    // Constructor de la clase Cuadro
    public Cuadro(String material, String tipo, String tamaño) {
        this.material = material;
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    // Métodos getter y setter para los atributos de la clase Cuadro
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

}

public class Main {
    public static void main(String[] args) {
        // Crear las ruedas
        Rueda ruedaDelantera = new Rueda(35, "Negro", "Aluminio");
        Rueda ruedaTrasera = new Rueda(35, "Negro", "Aluminio");

        // Crear un cuadro
        Cuadro cuadro = new Cuadro("Aluminio", "MTB", "Grande");

        // Crear una bicicleta con las ruedas y el cuadro
        Bicicleta bicicleta = new Bicicleta(ruedaDelantera, ruedaTrasera, cuadro, "Specialized");

        // Imprimir la marca de la bicicleta
        System.out.println("Marca de la bicicleta: " + bicicleta.getMarca());
        // Imprimir la presión de la rueda delantera
        System.out.println("Presión de la rueda delantera: " + bicicleta.getRuedaDelantera().getPresion() + " PSI");
        // Imprimir la presión de la rueda trasera
        System.out.println("Presión de la rueda trasera: " + bicicleta.getRuedaTrasera().getPresion() + " PSI");
    }
}
