/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Domini;

/**
 *
 * @author albertomarin
 */

//PONER UN ASSIG+GRUPO A UNA HORA
public class RestGrupSessio extends Restriccio{

    //Atributos
    private String assignatura;
    private Integer grup;
    private Integer dia;
    private Integer horaInici; //Hora d'inici.

    //Constructora por defecto
    public RestGrupSessio() {
        super(2); //ID PRIVISIONAL 1002
    }

    public RestGrupSessio( String assignatura, Integer grup, Integer dia, Integer hora) {
        super(2);
        this.assignatura = assignatura;
        this.grup = grup;
        this.dia = dia;
        this.horaInici = hora;
    }

    //Getters y Setters
    public String getAssignatura() {
        return assignatura;
    }

    public void setAssignatura( String assignatura) {
        this.assignatura = assignatura;
    }

    public Integer getGrup() {
        return grup;
    }

    public void setGrup(Integer grup) {
        this.grup = grup;
    }

    public Integer getHora() {
        return horaInici;
    }
    
    public int getDia(){
        return dia;
    }
    
    public void setDia( int d){
        dia = d;
    }

    public void setHora(Integer hora) {
        this.horaInici = hora;
    }

    @Override
    public boolean CompleixRes() {return false;}

    /*
     * NOMÉS S HA DE MIRAR AMB LA 1A HORA
     */
    public boolean CompleixRes(String assignatura, Integer grup, int dia, Integer hora) {
        boolean compleix = true; //Miramos si habla de la restriccion que afecta a nuestro grupo
        if ( this.assignatura.equals(assignatura) && this.grup.equals(grup)) {
            if( this.dia != dia) return false;
            if (this.horaInici != hora) compleix = false;
        }
        return compleix;
    }

    /**
     *
     * @param cjtRestGrupSesio Conjunt al que afeigir la noestra restriccio y en el que es poden produir incoherencies.
     * @return true si es pot afeigir al conjunt de restriccions del tipus o false si no es pot perque provoca alguna incoherencia.
     */

    public boolean esPotAfegir(CjtRestriccions cjtRestGrupSesio) {
        boolean espot = true;
        for (Restriccio res: cjtRestGrupSesio.getCjtRes()) {
            RestGrupSessio res_grup_sesio = (RestGrupSessio) res;
            if ((res_grup_sesio.getAssignatura().equals(this.assignatura)) && (res_grup_sesio.getGrup().equals(this.grup))) {
                //Si ya hay una restriccion que obliga a hacer la misma ASSIG+GRUPO en una hora, esta restriccion no podra añadirse al
                //CjtRestGrupSesio porque crearía conflicto con el resto.
                espot = false;
            }
        }
        return espot;
    }

}