/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Wilson
 */
public class CPFValidator implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String cpf = (String) o;
        cpf = cpf.trim();
        
        try{
            long cpfLong = Long.valueOf(cpf);
        }catch(NumberFormatException e){
            throw new ValidatorException(new FacesMessage("CPF deve conter apenas números"));
 
        }
        
        if(cpf.length() != 11)
            throw new ValidatorException(new FacesMessage("CPF deve conter 11 dígitos sem pontuação"));
        
        int digitos[] = new int[11];
        int soma = 0;
        
        for(int i = 0 ; i < cpf.length(); i++){
            digitos[i] = Integer.valueOf(cpf.substring(i,i+1));
 
            if(i < 9)
                soma += digitos[i]*(10-i);
            
        }
        
        int digito1 = soma%11;
        if(digito1<2)
            digito1 = 0;
        else
            digito1 = 11 - digito1;
        
        if(digito1 != digitos[9])
            throw new ValidatorException(new FacesMessage("Dígito verificador inválido"));
        
        soma = 0;
        
        for(int i = 0 ; i < digitos.length; i++){
            if(i < 10)
                soma += digitos[i]*(11-i);
        }
        
        int digito2 = soma%11;
        if(digito2 < 2)
            digito2 = 0;
        else
            digito2 = 11 - digito2;
        
        if(digito2 != digitos[10])
            throw new ValidatorException(new FacesMessage("Dígito verificador inválido"));
        
        
   
                
    }
    
}
