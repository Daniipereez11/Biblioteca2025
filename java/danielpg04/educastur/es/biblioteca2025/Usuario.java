/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danielpg04.educastur.es.biblioteca2025;

/**
 *
 * @author alu21d
 */
public class Usuario {
    private String dni;
    private String nombre;
    private String email;
    private String telefono;
    private String fechaNac;

    public Usuario(String dni, String nombre, String email, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Usuario{" + "dni=" + dni + ", nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + ", fechaNac=" + fechaNac + '}';
    }
    
    
    
}
