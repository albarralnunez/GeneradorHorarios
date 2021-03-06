/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domini;

/**
 *
 * @author Daniel Albarral
 */
public class RestGrupoAula extends Restriccio {



    private String assignatura;
    private Integer grup;
    private String aula;

    /**
     *
     */
    public RestGrupoAula() {
        super(1);
    }
    
    public String getAssignatura() {
        return assignatura;
    }

    public void setAssignatura(String assignatura) {
        this.assignatura = assignatura;
    }

    public Integer getGrup() {
        return grup;
    }

    public void setGrup(Integer grup) {
        this.grup = grup;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean CompleixRes(){return false;}
    
    
    /**
     *
     * @param cjtRga
     * @param cjtResAul
     * @param cjtResAssig
     * @return
     */
    public boolean esPotAfegir(CjtRestGrupoAula cjtRga,CjtRestriccioAula cjtResAul,
            CjtRestAssignatura cjtResAssig) {
        boolean comp = true;
        for (Restriccio  res: cjtRga.getCjtRes()) {
            RestGrupoAula resdw = (RestGrupoAula) res; 
            if (resdw.getAssignatura().equals(this.assignatura) &&
                    resdw.getGrup() == this.grup) comp = false;
        } 
        for (Restriccio resa : cjtResAul.getCjtRes()) {
            RestriccioAula resAuldw = (RestriccioAula)resa; 
            if (this.aula.equals(resAuldw.getAula().getNom())) {
                for (Restriccio resb : cjtResAssig.getCjtRes()) {
                    RestAssignatura resAssdw = (RestAssignatura)resb;
                    if (this.assignatura.equals(resAssdw.getAssignatura().getNom()) &&
                            this.grup == resAssdw.getGrup()){
                        if (resAuldw.getDia() == null) {
                            if (resAssdw.getHora() == resAuldw.getHora())
                                comp = false;
                        }
                        else if (resAuldw.getHora() == -1) { 
                            if (resAssdw.getDia().equals(resAuldw.getDia()))
                                comp = false;
                        }
                        else {
                            if (resAssdw.getHora() == resAuldw.getHora() && 
                                    resAssdw.getDia().equals(resAuldw.getDia())) {
                                comp = false;
                            }
                        }
                    }
                }
            }
        }
        return comp;
    }
    
    
    /**
     *
     * @param assignatura
     * @param grup
     * @param aula
     * @return
     */
     public boolean compleixRes(Clausula c, ClausulaNom cn) {
        if (c.getAssignatura().getNom().equals(this.assignatura) &&
                c.getGrup() == this.grup) {
            boolean b = this.aula.equals(cn.getAula().getNom());
            return (b ? true : false);
        }
        return true;
    }
     
    /**
     *
     * @param assignatura
     * @param grup
     * @param aula
     * @return
     */
     public boolean compleixRes(CjtElements el) {
         boolean b = false;
        for (Element elcjt : el.getAssignacions()) {
            if (b) break;
            if (elcjt.getAssignatura().getNom().equals(this.assignatura) &&
                    elcjt.getGrupo() == this.grup){
                b = (elcjt.getAula().getNom().equals(this.aula));
            }
            else b = true;
        }
        return b;
    }
    
    
    
}
