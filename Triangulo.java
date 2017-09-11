/**
 * Esta clase representa objetos triangulo con base y altura.
 * @autor Joe Diaz
 * @version 1.0 (09/10/2017)
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    private float cateto1;
    private float cateto2;
    private float hipotenusa;
    private float x;
    /**
     * Este es el constructor de la clase triangulo. pon ceros en los que no necesitas.
     * @param unaBase Es la base del triangulo.
     * @param unaAltura Es la altura del triangulo.
     * @param unCateto1 Es un cateto del triangulo.
     * @param unCateto2 Es un cateto del triangulo.
     * @param unaHipotenusa Es la hipotenusa del triangulo.
     */
    public Triangulo(float unaBase, float unaAltura, float unCateto1, float unCateto2, float unaHipotenusa)
    {
        base = unaBase;
        altura = unaAltura;
        cateto1 = unCateto1;
        cateto2 = unCateto2;
        hipotenusa = unaHipotenusa;
        x = 0;
    }
    
    /**
     * Este metodo es para calcular el area de un triangulo.
     */
    @Override
    public void calcularArea()
    {
        area = (base * altura)/2;
    }
    
    /**
     * Este metodo es para calcular el perimetro de un triangulo.
     */
    @Override
    public void calcularPerimetro()
    {
        if(cateto1!=0 && cateto2!=0 && hipotenusa!=0)
        {
            perimetro = cateto1 + cateto2 + hipotenusa;
        }
        if(cateto1!=0 && cateto2 == 0 && hipotenusa!=0)
        {
            x = (hipotenusa * hipotenusa)-(cateto1 * cateto1)
            perimetro = Math.sqrt();
        }
        
    }
}