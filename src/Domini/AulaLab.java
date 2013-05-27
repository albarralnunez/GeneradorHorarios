/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini;

/**
 *
 * @author Daniel Albarral
 */
public class AulaLab extends Aula {

    private boolean material;

    /**
     * Crea un Aula de laboratori.
     */
    public AulaLab(String nom, int cap, boolean mat) {
        super(nom, cap);
        this.material = mat;
    }

    /**
     * Creadora per defecte
     */
    public AulaLab() {
        super();
        this.material = false; //La creadora por defecto no da material al aula.
    }

    /**
     *
     * @return Retorna si l'aula te material.
     */
    public boolean getMaterial() {
        return material;
    }

    /**
     *
     * @param mar Si disposa de material l'aula
     */
    public void setMaterial(boolean material) {
        this.material = material;
    }
}
