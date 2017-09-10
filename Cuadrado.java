/**
 * Esta clase representa objetos cuadrado con lado.
 * @autor Joe Diaz
 * @version 1.0 (09/10/2017)
 */
public class Cuadrado extends Figura
{
    private float lado;
    /**
     * Este es el constructor de la clase Cuadrado.
     * @param unLado Es el lado del cuadrado.
     */
    public Cuadrado(float unLado)
    {
        lado = unLado;
    }
    
    /**
     * Este metodo es para calcular el area del cuadrado.
     */
    @Override
    public void calcularArea()
    {
        area = lado * lado;
    }
}