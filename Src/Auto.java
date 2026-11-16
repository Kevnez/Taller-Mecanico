public class Auto {
    private String patente;
    private String marca;
    private String modelo;
    private String duenio;
    private String problema;

    public Auto(String patente, String marca, String modelo, String duenio, String problema) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.duenio = duenio;
        this.problema = problema;
    }

    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDuenio() {
        return duenio;
    }

    public String getProblema() {
        return problema;
    }

    public void mostrarDatos() {
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Dueño: " + duenio);
        System.out.println("Problema: " + problema);
        System.out.println("--------------------");
    }
}
