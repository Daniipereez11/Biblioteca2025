/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//daniel devuelveme la nintendo
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
        libros.add(new Libro("1-11","El Hobbit","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-22","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-33","El Medico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-44","Chaman","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-55","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-66","Paraiso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","Olvidado Rey Gudu","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-88","El ultimo barco","D.Villar","Novela Negra",3)); 
        libros.add(new Libro("1-99","Ojos de agua","D.Villar","Novela Negra",2)); 

        usuarios.add(new Usuario("11","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("22","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("33","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("44","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("55","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("66","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(8),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(6),usuarios.get(2), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(1), hoy,hoy.plusDays(15)));
    }
    
    private void menu(){
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Gestion de Libros");
            System.out.println("2. Gestion de Usuarios");
            System.out.println("3. Gestion de Prestamos");
            System.out.println("9. Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    menuLibros();
                    break;
                case 2:
                    menuUsuarios();
                    break;
                case 3:
                    menuPrestamos();
                    break;
            }
        } while (opcion != 9);

        sc.close();
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
