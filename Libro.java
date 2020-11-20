
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro, int cantidadVecesPrestado, boolean libroTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        numeroReferencia = "";
        vecesPrestado = cantidadVecesPrestado;
        esLibroDeTexto = libroTexto;
    }
    public boolean getEsLibroDeTexto(){
        return esLibroDeTexto;
    }
    
    public void prestar() {
        vecesPrestado = vecesPrestado + 1;
        
    }
    public int getPrestar() {
        return vecesPrestado;
    }
    public String getNombreAutor(){
        return autor;
    }  
    public String getTituloDelLibro() {
        return titulo;
    }
    public void imprimeAutor() {
        System.out.println(autor);
    }
    public void imprimeTitulo() {
        System.out.println(titulo);
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void imprimirDetalles() {    
         String detalles = "Titulo: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas + " Numero de veces prestado: " + vecesPrestado; 
        if (numeroReferencia != ("")) {
            System.out.println(detalles + " Número de Referencia: " + numeroReferencia);
        }
        else{
             System.out.println(detalles + " Número de Referencia: ZZZ");
        }    
        if (esLibroDeTexto) {
           System.out.println("Se está usando como libro de texto");	          
        }
        else{
           System.out.println("No se está usando como libro de texto");
        }
    }
    public String getDetalles() {
        String detalles = "Titulo: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas + " Numero de veces prestado: " + vecesPrestado; 
        if (numeroReferencia != ("")) {
            detalles = detalles + " Número de Referencia: " + numeroReferencia;
        }
        else{
            detalles = detalles + " Número de Referencia: ZZZ";
        }    
        if (esLibroDeTexto) {
           detalles = detalles + " Se está usando como libro de texto";	          
        }
        else{
           detalles = detalles + " No se está usando como libro de texto";
        }
        return detalles;
    }
    public void setNumeroReferencia(String nuevoNumeroReferencia) {
        int numeroCaracteresReferencia = 3;
        if(numeroReferencia.length() >= 3){
           System.out.println("Se necesitan 3 o más caracteres para realizar este metodo.");
        }
        numeroReferencia = nuevoNumeroReferencia;
    }
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
}

