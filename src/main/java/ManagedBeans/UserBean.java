/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import converter.CEPConverter;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import validator.CPFValidator;

/**
 *
 * @author JOAO
 */
@ManagedBean
@SessionScoped
public class UserBean {
    
    private String nome;
    private String CPF;
    private String RG;
    private String rua;
    private Integer numero;
    private String complemento;
    private String cidade;         
    private String estado;
    private String CEP;
    private String telFixo;
    private String telCelular;
    private String email;
    
    private CPFValidator CPFValidator = new CPFValidator();
    private CEPConverter cepConverter = new CEPConverter();

    public CEPConverter getCepConverter() {
        return cepConverter;
    }

    public void setCepConverter(CEPConverter cepConverter) {
        this.cepConverter = cepConverter;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    

    public CPFValidator getCPFValidator() {
        return CPFValidator;
    }

    public void setCPFValidator(CPFValidator CPFValidator) {
        this.CPFValidator = CPFValidator;
    }
    
    
    
    /**
     * Creates a new instance of UserBean
     */
    public UserBean() {
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the telFixo
     */
    public String getTelFixo() {
        return telFixo;
    }

    /**
     * @param telFixo the telFixo to set
     */
    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }

    /**
     * @return the telCelular
     */
    public String getTelCelular() {
        return telCelular;
    }

    /**
     * @param telCelular the telCelular to set
     */
    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
