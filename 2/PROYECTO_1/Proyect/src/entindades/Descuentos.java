
package entindades;

/**
 *
 * @author GEORGE NAMOC
 */
public interface Descuentos {
    public float SUELDO_BASICO=930.0f;
    
    public void descuentosFalta(int diasFaltados);
    public void descuentosTardanza(float minutosDeTardanza);
}
