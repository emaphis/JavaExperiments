/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stuff;

/**
 *
 * @author emaph
 */
    public class GestionBiblioteca {

        public static void main(String[] args) {
            Biblioteca unaBiblioteca;

            unaBiblioteca = new Biblioteca();
            Libro unLibro;
            unLibro = new Libro("El principito", "El Lector", 200, "Disponible");
            unaBiblioteca.setUnLibro(unLibro);
            Lector unLector;
            unLector = new Lector("Info", "", "");
            unLector.setLibroPrestado(unLibro);
            unaBiblioteca.setUnLector(unLector);
            Lector otroLector = unaBiblioteca.getUnLector();
            System.out.println(" El nombre del Lector: " + otroLector.getNombre());
            //
            System.out.println(" El nombre del Lector: " + unaBiblioteca.getUnLector().getNombre());
            System.out.println(" El nombre del libro prestado por el lector es: " + unaBiblioteca.getUnLector().getLibroPrestado().getNombre());
            System.out.println(" El nombre de la Editorial del Libro prestado es: " + unaBiblioteca.getUnLector().getLibroPrestado().getEditorial());
            System.out.println(" El numero de paginas del Libro: " + unaBiblioteca.getUnLector().getLibroPrestado().getNumPagina());
            System.out.println(" La direccion del Lector es: " + unaBiblioteca.getUnLector().getDireccion());
            System.out.println(" El numero de telefono del Lector es: " + unaBiblioteca.getUnLector().getNumCelular());
        }
    }
