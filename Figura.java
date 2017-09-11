/**
 * Esta clase es una superclase para representar las caracteristicas
 * comunes de muchas figuas.
 * @autor Joe Diaz
 * @version 1.0 (9/8/2017)
 */
public class Figura
{
    protected float area; // area de cada figura
    protected float perimetro; //perimetro de cada figura    
    /**
     * constructor de la clase Figura.
     */
    public Figura()
    {
        area = 0;
        perimetro = 0;
    }
    
    /**
     * Calcula el area de la figura.
     */
    public void calcularArea()
    {
        System.out.println("No se calcular el area.");
    }
    
    public void imprimirArea()
    {
        System.out.println("El area de la figura es: " + area);
    }
    
    public void calcularPerimetro()
    {
        System.out.println("No se calcular el perimetro.");
    }
    
    public void imprimirPerimetro()
    {
        System.out.println("El perimetro de la figura es: " + perimetro);
    }
}