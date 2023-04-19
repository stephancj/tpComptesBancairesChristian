/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tpbanquechristian.jsf;

import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import mg.itu.tpbanquechristian.ejb.GestionnaireCompte;
import mg.itu.tpbanquechristian.entities.CompteBancaire;

/**
 *
 * @author Stéphan J. Christian
 */
@Named(value = "listeComptes")
@ViewScoped
public class ListeComptes implements Serializable {

    List<CompteBancaire> allComptes;
    /**
     * Creates a new instance of ListeComptes
     */
    @EJB
    private GestionnaireCompte gc;

    public ListeComptes() {
    }

    public List<CompteBancaire> getAllComptes() {
        if (this.allComptes == null) {
            this.allComptes = this.gc.getAllComptes();
        }
        return this.allComptes;
    }

}
