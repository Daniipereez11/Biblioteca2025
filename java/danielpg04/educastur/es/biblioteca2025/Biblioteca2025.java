/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package danielpg04.educastur.es.biblioteca2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alu21d
 */
public class Biblioteca2025 {

    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamos;

    public Biblioteca2025() {
        this.libros = libros;
        this.usuarios = usuarios;
        this.prestamos = prestamos;
    }
        
    public static void main(String[] args) {
        Biblioteca2025 b = new Biblioteca2025();
        b.cargaDatos();
        b.menu();
    }
        
    private void cargaDatos(){
        
    }
    
    private void menu(){
        
    }
    
    
    /**
     * 
     * @param dni El dni de la persona que pidio el prestamo
     * @param isbn Isbn del libro que se ha presatado
     * @return posicion (int) del prestamo en el Arraylist, valor -1 si no encuentra un prestamo con esos datos
     */
    public int buscaPrestamo(String dni, String isbn){
        int pos=1;
                for (int i = 0;i < prestamos.size(); i++){
                    if (prestamos.get(i).getUsuarioPrest().getDni().equals(dni)
                        && prestamos.get(i).getLibroPrest().getIsbn().equals(isbn)){
                        pos=i;
                        break;
                    }
                }
                return pos;
    }
    
    
    private void prorroga(){
        System.out.println("Datos para prorrga del prestamo: ");
        
        String dni = solicitaDni();
        String isbn = solicitaIsbn();
        int pos=buscaPrestamo(solicitaDni(), solicitaIsbn());
        if (pos==1){
            System.out.println("No hay ningun prestamo con esos datos");
        }else{
            prestamos.get(pos).getFechaDev(prestamos.get(pos).getFechaDev().plusDays(15));
        }
    }
    
    private void devolucion(){
        System.out.println("Datos para prorrga del prestamo: ");
        String isbnLibro = solicitaIsbn();
        int pos = buscaPrestamo(solicitaDni(), solicitaIsbn());
        if (pos==1){
            System.out.println("No hay ningun prestamo con esos datos");
        }else{
            prestamos.get(pos).getFechaDev(LocalDate.now());
        }
    }
    
    
    private String solicitaDni(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el dni: ");
        String Dni = sc.nextLine();
        return Dni;
    }
    
    private String solicitaIsbn(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el Isbn: ");
        String Isbn = sc.nextLine();
        return Isbn;
    }
    
}
