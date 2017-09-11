/**
 * Esta clase representa objetos circulo co un radio
 * @autor Joe Diaz
 * @version 1.0 (09/08/2017)
 */
public class Circulo extends Figura
{
    private float radio;
    /**
     * Constructor de la clase circulo
     * @param unRadio Es el radio del circulo.
     */
    public Circulo(float unRadio)
    {
        radio = unRadio;
    }
    
    /**
     * Metodo calcula el area de un circulo.
     * @param override te avisa que no hay sobreescribir.
     */
    @Override 
    public void calcularArea()
    {
        area = 3.14f * radio * radio;
    }
    
    /**
     * Metodo que calcula la circunferencia de un circulo.
     * @param override te avisa que no hay sobreescribir
     */
    @Override
    public void calcularPerimetro()
    {
        perimetro = 2 * 3.14f * radio;
    }
}