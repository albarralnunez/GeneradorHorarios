/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini;

import java.util.ArrayList;

/**
 *
 * @author Daniel Albarral
 */
public class RestriccioTemps {

    private ArrayList<Integer> dilluns;
    private ArrayList<Integer> dimarts;
    private ArrayList<Integer> dimecres;
    private ArrayList<Integer> dijous;
    private ArrayList<Integer> divendres;
    private ArrayList<Integer> dissabte;
    private ArrayList<Integer> diumenge;


    //Constructora por defecto
    public RestriccioTemps() {}


    public ArrayList<Integer> getDissabte() {
        return dissabte;
    }

    public void setDissabte(ArrayList<Integer> dissabte) {
        this.dissabte = dissabte;
    }

    public ArrayList<Integer> getDiumenge() {
        return diumenge;
    }

    public void setDiumenge(ArrayList<Integer> diumenge) {
        this.diumenge = diumenge;
    }
    
    
    public ArrayList<Integer> getDilluns() {
        return dilluns;
    }

    public void setDilluns(ArrayList<Integer> dilluns) {
        this.dilluns = dilluns;
    }

    public ArrayList<Integer> getDimarts() {
        return dimarts;
    }

    public void setDimarts(ArrayList<Integer> dimarts) {
        this.dimarts = dimarts;
    }

    public ArrayList<Integer> getDimecres() {
        return dimecres;
    }

    public void setDimecres(ArrayList<Integer> dimecres) {
        this.dimecres = dimecres;
    }

    public ArrayList<Integer> getDijous() {
        return dijous;
    }

    public void setDijous(ArrayList<Integer> dijous) {
        this.dijous = dijous;
    }

    public ArrayList<Integer> getDivendres() {
        return divendres;
    }

    public void setDivendres(ArrayList<Integer> divendres) {
        this.divendres = divendres;
    }

    

}
