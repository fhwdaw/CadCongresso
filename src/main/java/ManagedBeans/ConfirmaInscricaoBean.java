/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author JOAO
 */
@ManagedBean
@SessionScoped
public class ConfirmaInscricaoBean {
    
    private final float PRECO_POR_CURSO = 50.0f;
    
    @ManagedProperty(value="#{userBean}")
    private UserBean user;
    @ManagedProperty(value="#{cursosBean}")
    private CursosBean cursos;
    private float preco;

    /**
     * Creates a new instance of ConfirmaInscricaoBean
     */
    public ConfirmaInscricaoBean() {
    }

    /**
     * @return the user
     */
    public UserBean getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(UserBean user) {
        this.user = user;
    }

    /**
     * @return the cursos
     */
    public CursosBean getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(CursosBean cursos) {
        this.cursos = cursos;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        preco = 0;
        preco = 100.0f+cursos.getCursos().size()*PRECO_POR_CURSO;
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
