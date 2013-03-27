/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

/**
 *
 * @author Felipe Bill
 */
public class CEPConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String string) {
        return string == null || string.isEmpty() ? null : Integer.valueOf(string.replace("-", ""));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object o) {
        Integer cep = (Integer) o;
        return String.format("%05d-%03d", cep / 1000, cep % 1000);
    }
    
}
