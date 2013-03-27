/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ManagedBeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author JOAO
 */
@ManagedBean
@SessionScoped
public class CursosBean {
    
    private List cursos = new ArrayList();
    @ManagedProperty(value="#{userBean}")
    private UserBean user;
    
    /**
     * Creates a new instance of CursosBean
     */
    public CursosBean() {
    }

    /**
     * @return the cursos
     */
    public List getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(List cursos) {
        this.cursos = cursos;
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
}
