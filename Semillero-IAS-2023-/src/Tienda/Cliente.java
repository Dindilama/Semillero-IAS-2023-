package Tienda;

public class Cliente {
    private String nombre;
    private int cedula;

    public Cliente(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Cliente() {
    }



    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
