/**
 * Esta clase representa objetos circulo co un radio
 * @autor Joe Diaz
 * @version 1.0 (09/08/2017)
 */
public class Circulo extends Figura
{
    private float radio;
    
    public Circulo(float unRadio)
    {
        radio = unRadio;
    }
    
    /**
     * @override te avisa que no hay sobreescribir.
     */
    @Override 
    public void calcularArea()
    {
        area = 3.14f * radio * radio;
    }
}