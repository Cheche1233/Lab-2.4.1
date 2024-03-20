// Clase Corazon
class Corazon {
    private int ritmo;
    private int ventriculos;
    private boolean sano;

    public Corazon(int ritmo, int ventriculos, boolean sano) {
        this.ritmo = ritmo;
        this.ventriculos = ventriculos;
        this.sano = sano;
    }

    public int getRitmo() {
        return ritmo;
    }

    public void setRitmo(int ritmo) {
        this.ritmo = ritmo;
    }

    public int getVentriculos() {
        return ventriculos;
    }

    public void setVentriculos(int ventriculos) {
        this.ventriculos = ventriculos;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }
}

// Clase Pulmon
class Pulmon {
    private String lado;
    private double capacidad;
    private boolean sano;

    public Pulmon(String lado, double capacidad, boolean sano) {
        this.lado = lado;
        this.capacidad = capacidad;
        this.sano = sano;
    }

    public String getLado() {
        return lado;
    }

    public void setLado(String lado) {
        this.lado = lado;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }
}

// Clase Higado
class Higado {
    private double tamano;
    private boolean sano;
    private int celulas;

    public Higado(double tamano, boolean sano, int celulas) {
        this.tamano = tamano;
        this.sano = sano;
        this.celulas = celulas;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }

    public int getCelulas() {
        return celulas;
    }

    public void setCelulas(int celulas) {
        this.celulas = celulas;
    }
}

// Clase Apendice
class Apendice {
    private boolean presente;
    private String tipo;
    private boolean inflamado;

    public Apendice(boolean presente, String tipo, boolean inflamado) {
        this.presente = presente;
        this.tipo = tipo;
        this.inflamado = inflamado;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isInflamado() {
        return inflamado;
    }

    public void setInflamado(boolean inflamado) {
        this.inflamado = inflamado;
    }
}

// Clase CuerpoHumano
class CuerpoHumano {
    private Corazon corazon;
    private Pulmon pulmon;
    private Higado higado;
    private Apendice apendice;
    private String nombre;

    public CuerpoHumano(Corazon corazon, Pulmon pulmon, Higado higado, Apendice apendice, String nombre) {
        this.corazon = corazon;
        this.pulmon = pulmon;
        this.higado = higado;
        this.apendice = apendice;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Pulmon getPulmon() {
        return pulmon;
    }

    public void setPulmon(Pulmon pulmon) {
        this.pulmon = pulmon;
    }

    public Higado getHigado() {
        return higado;
    }

    public void setHigado(Higado higado) {
        this.higado = higado;
    }

    public Apendice getApendice() {
        return apendice;
    }

    public void setApendice(Apendice apendice) {
        this.apendice = apendice;
    }
}

// Clase Main

public class Main2 {
    public static void main(String[] args) {
        // Crear un pulmón
        Pulmon pulmon = new Pulmon("Derecho", 3.5, true);
        // Crear un corazón
        Corazon corazon = new Corazon(75, 4, true);
        // Crear un hígado
        Higado higado = new Higado(1.5, true, 100000000);
        // Crear un apéndice
        Apendice apendice = new Apendice(true, "Vermiforme", false);
        // Crear un cuerpo humano con el corazón, pulmón, hígado, y apéndice
        CuerpoHumano cuerpoHumano = new CuerpoHumano(corazon, pulmon, higado, apendice, "Juan");

        // Imprimir información de cada clase
        System.out.println("Información del cuerpo humano:");
        System.out.println("Nombre: " + cuerpoHumano.getNombre());
        System.out.println("Información del corazón:");
        System.out.println("Ritmo cardíaco: " + cuerpoHumano.getCorazon().getRitmo() + " latidos por minuto");
        System.out.println("Número de ventrículos: " + cuerpoHumano.getCorazon().getVentriculos());
        System.out.println("Estado del corazón: " + (cuerpoHumano.getCorazon().isSano() ? "Sano" : "Enfermo"));
        System.out.println("Información del pulmón:");
        System.out.println("Lado del pulmón: " + cuerpoHumano.getPulmon().getLado());
        System.out.println("Capacidad del pulmón: " + cuerpoHumano.getPulmon().getCapacidad() + " litros");
        System.out.println("Estado del pulmón: " + (cuerpoHumano.getPulmon().isSano() ? "Sano" : "Enfermo"));
        System.out.println("Información del hígado:");
        System.out.println("Tamaño del hígado: " + cuerpoHumano.getHigado().getTamano() + " kg");
        System.out.println("Estado del hígado: " + (cuerpoHumano.getHigado().isSano() ? "Sano" : "Enfermo"));
        System.out.println("Número de células en el hígado: " + cuerpoHumano.getHigado().getCelulas());
        System.out.println("Información del apéndice:");
        System.out.println("¿Está presente el apéndice? " + (cuerpoHumano.getApendice().isPresente() ? "Sí" : "No"));
        System.out.println("Tipo de apéndice: " + cuerpoHumano.getApendice().getTipo());
        System.out.println("¿Está inflamado el apéndice? " + (cuerpoHumano.getApendice().isInflamado() ? "Sí" : "No"));
    }
}