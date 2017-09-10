/**
 * Esta clase representa objetos triangulo con base y altura.
 * @autor Joe Diaz
 * @version 1.0 (09/10/2017)
 */
public class Triangulo extends Figura
{
    public float base;
    public float altura;
    /**
     * Este es el constructor de la clase triangulo.
     * @param unaBase Es la base del triangulo.
     * @param unaAltura Es la altura del triangulo.
     */
    public Triangulo(float unaBase, float unaAltura)
    {
        base = unaBase;
        altura = unaAltura;
    }
    
    /**
     * Este metodo es para calcular el area de un triangulo.
     */
    @Override
    public void calcularArea()
    {
        area = (base * altura)/2;
    }
}