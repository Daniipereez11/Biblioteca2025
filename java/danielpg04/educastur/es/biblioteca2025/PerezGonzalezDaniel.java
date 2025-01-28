/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danielpg04.educastur.es.biblioteca2025;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alu21d
 */
public class PerezGonzalezDaniel {
    private ArrayList <Libro> libros;
    private ArrayList <Usuario> usuarios;
    private ArrayList <Prestamo> prestamos;
    private ArrayList <Prestamo> prestamosHist;

    public PerezGonzalezDaniel() {
        this.libros = new ArrayList();
        this.usuarios = new ArrayList();
        this.prestamos = new ArrayList();
        this.prestamosHist = new ArrayList();
    }
    
    public static void main(String[] args) {
       PerezGonzalezDaniel b= new PerezGonzalezDaniel();
       b.cargaDatos();
       b.menu();
    }
    
    public void menu(){
        Scanner sc=new Scanner (System.in);
        int opcion=0;
        do{
            System.out.println("\n\n\n\n\n\t\t\t\tBIBLIOTECA\n");
            System.out.println("\t\t\t\t1 - EXAMEN1");
            System.out.println("\t\t\t\t2 - EXAMEN2");
            System.out.println("\t\t\t\t3 - EXAMEN3");
            System.out.println("\t\t\t\t4 - EXAMEN4");
            System.out.println("\t\t\t\t9 - SALIR");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:{
                    exam1();
                    break;
                }    
                case 2:{
                    exam2();
                    break;
                } 
                case 3:{
                    exam3();
                    break;
                } 
                case 4:{
                    exam4();
                    break;
                } 
            }
        }while (opcion != 9);
    }
    
    public void cargaDatos(){
        
        libros.add(new Libro("1-00","El Hobbit","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-11","El Silmarillon","JRR Tolkien","Aventuras",3)); 
        libros.add(new Libro("1-22","El Medico","N. Gordon","Aventuras",4)); 
        libros.add(new Libro("1-33","Chaman","N. Gordon","Aventuras",3)); 
        libros.add(new Libro("1-44","Momo","M. Ende","Aventuras",2)); 
        libros.add(new Libro("1-55","Paraiso inhabitado","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-66","Olvidado Rey Gudu","A.M.Matute","Aventuras",2)); 
        libros.add(new Libro("1-77","El ultimo barco","D.Villar","Novela Negra",3)); 
        libros.add(new Libro("1-88","Ojos de agua","D.Villar","Novela Negra",9)); 

        usuarios.add(new Usuario("00","Ana","ana@email.com","621111111")); 
        usuarios.add(new Usuario("11","David","david@email.com","622222222")); 
        usuarios.add(new Usuario("22","Bea","bea@email.com","623333333")); 
        usuarios.add(new Usuario("33","Lucas","lucas@email.com","624444444")); 
        usuarios.add(new Usuario("44","Carlota","carlota@email.com","625555555")); 
        usuarios.add(new Usuario("55","Juan","juan@email.com","626666666"));
        
        LocalDate hoy= LocalDate.now();
        prestamos.add(new Prestamo(libros.get(0),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(0),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(5),usuarios.get(0), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(1),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(2),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(3),usuarios.get(4), hoy.minusDays(20),hoy.minusDays(5)));
        prestamos.add(new Prestamo(libros.get(1),usuarios.get(4), hoy,hoy.plusDays(15)));
        prestamos.add(new Prestamo(libros.get(8),usuarios.get(1), hoy,hoy.plusDays(15)));
        
        prestamosHist.add(new Prestamo(libros.get(0),usuarios.get(0),LocalDate.parse("2023-01-01"),LocalDate.parse("2023-01-20")));//OUT
        prestamosHist.add(new Prestamo(libros.get(2),usuarios.get(0),LocalDate.parse("2023-02-02"),LocalDate.parse("2023-02-11")));
        prestamosHist.add(new Prestamo(libros.get(7),usuarios.get(4),LocalDate.parse("2023-10-10"),LocalDate.parse("2023-10-20")));
        prestamosHist.add(new Prestamo(libros.get(5),usuarios.get(4),LocalDate.parse("2023-11-11"),LocalDate.parse("2023-11-30")));//OUT
        prestamosHist.add(new Prestamo(libros.get(1),usuarios.get(1),LocalDate.parse("2023-12-12"),LocalDate.parse("2023-12-28")));//OUT
        prestamosHist.add(new Prestamo(libros.get(7),usuarios.get(2),LocalDate.parse("2024-08-08"),LocalDate.parse("2024-08-18")));
        prestamosHist.add(new Prestamo(libros.get(6),usuarios.get(3),LocalDate.parse("2024-09-09"),LocalDate.parse("2024-09-19")));
        prestamosHist.add(new Prestamo(libros.get(0),usuarios.get(0),LocalDate.parse("2024-10-10"),LocalDate.parse("2024-10-30")));//OUT
        prestamosHist.add(new Prestamo(libros.get(2),usuarios.get(0),LocalDate.parse("2024-11-11"),LocalDate.parse("2024-11-21")));
        prestamosHist.add(new Prestamo(libros.get(7),usuarios.get(4),LocalDate.parse("2024-12-12"),LocalDate.parse("2024-12-28")));//OUT
        prestamosHist.add(new Prestamo(libros.get(5),usuarios.get(4),LocalDate.parse("2025-01-01"),LocalDate.parse("2025-01-11")));
        prestamosHist.add(new Prestamo(libros.get(1),usuarios.get(1),LocalDate.parse("2025-01-01"),LocalDate.parse("2025-01-15")));
    }
    
    private void exam1(){
        System.out.println("Libros ACTUALMENTE no prestados: ");
        for (Libro l : libros){
            boolean enPrestamo = false;
            for (Prestamo p : prestamos){
                if (p.getLibroPrest().equals(l)){
                    enPrestamo = true;
                    break;
                }
            }
            
            if (!enPrestamo){
                System.out.println(l);
            }
        }
        
        System.out.println("Libros NUNCA prestados: ");
        for (Libro l : libros){
            boolean prestado = false;
            for (Prestamo prestamo : prestamos){
                if (prestamo.getLibroPrest().equals(l)){
                    prestado= true;
                    break;
                }
            }
            if (!prestado){
                for (Prestamo pHist : prestamosHist){
                    if(pHist.getLibroPrest().equals(l)){
                        prestado = true;
                        break;
                    }
                }
            }
            if (!prestado){
                System.out.println(l);
            }
        }
        
    }
    
    private void exam2(){
        System.out.println("Usuarios/as que TIENEN algun libro en prestamo actualmente: ");
        for (int i = 0; i < prestamos.size(); i++){
            Usuario u = prestamos.get(i).getUsuarioPrest();
            boolean mostrado = false;
            for (int m = 0; m < i; m++){
                if (prestamos.get(m).getUsuarioPrest().equals(u)){
                    mostrado = true;
                    break;
                }
            }
            if (!mostrado) {
                System.out.println(u);
            }
        }
    }
    
    private void exam3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el DNI del usuario: ");
        String dni = sc.nextLine();
        Usuario usuario = null;
        
        for (Usuario u : usuarios){
            if(u.getDni().equals(dni)){
                usuario = u;
                break;
            }
        }
        if (usuario == null){
            System.out.println("Usuario no encontrado");
            return;
        }
        
        System.out.println("Teclea el año para consultar el prestamo (2023/2024): ");
        int ano = sc.nextInt();
        
        System.out.println("Prestamos del usuario/a " + usuario.getNombre() + " en el año " + ano + ": ");
        boolean prestado = false;
        for (Prestamo p : prestamosHist){
            if (p.getUsuarioPrest().equals(usuario) && p.getFechaPrest().getYear() == ano){
                System.out.println(p.getLibroPrest());
                prestado = true;
            }
        }
        if (!prestado){
            System.out.println("No se ha encontrado un prestamo para ese año");
        }
    }
    
    private void exam4(){
        System.out.println("Prestamos realizados año a año: ");
        ArrayList<Integer> anoPrest = new ArrayList<>();
        for (Prestamo p : prestamos){
            int ano = p.getFechaPrest().getYear();
            if (anoPrest.contains(ano)){
                continue;
            }
            int c = 0;
            for (Prestamo pr : prestamosHist){
                if (pr.getFechaPrest().getYear() == ano) {
                c++;
                }
            }
            anoPrest.add(ano);
            System.out.println("Total de prestamos en el año" + ano + " es: " + c);
        }
        
    }
    
}
