public class Auto {
    private String patente;
    private String marca;
    private String modelo;
    private String duenio;
    private String problema;
    private String estado;

    public Auto(String patente, String marca, String modelo, String duenio, String problema) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.duenio = duenio;
        this.problema = problema;
        this.estado = "En espera";
    }

    public String getPatente() { return patente; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public String getDuenio() { return duenio; }
    public String getProblema() { return problema; }
    public String getEstado() { return estado; }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarDatos() {
        System.out.println("Patente: " + patente + " | Marca: " + marca + " | Modelo: " + modelo);
        System.out.println("Dueño: " + duenio + " | Problema: " + problema + " | Estado: " + estado);
        System.out.println("--------------------");
    }
}
