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

    public void mostrarDatos() {
        System.out.println("Patente: " + patente + " | Marca: " + marca + " | Modelo: " + modelo + " | Dueño: " + duenio + " | Problema: " + problema + " | Estado: " + estado);
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public String getEstado() {
        return estado;
    }
}
