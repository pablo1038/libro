
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginasLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroPaginasLibro;
        numeroReferencia = "";
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
         String detalles = "Titulo: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas; 
        if (numeroReferencia != ("")) {
            System.out.println(detalles + " Número de Referencia: " + numeroReferencia);
        }
        else{
             System.out.println(detalles + " Número de Referencia: ZZZ");
        }    
        
    }
    public String getDetalles() {
        String detalles = "Titulo: " + titulo + "," + " Autor: " + autor + "," + " Páginas: " + numeroPaginas; 
        if (numeroReferencia != ("")) {
            detalles = detalles + " Número de Referencia: " + numeroReferencia;
        }
        else{
            detalles = detalles + " Número de Referencia: ZZZ";
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

