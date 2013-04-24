/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio;
import Domini.CtrDomini;
import Domini.Horari;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author miquelmasrieraquevedo
 */
public class CtrPresentacio {
    
    static String unitatDocent;  // nom de la unitat docent
    static CtrDomini cd;
    static Scanner s;
    
    public static void main(String[] args) {
        
       boolean tancar = false;
        
        while(!tancar){
            s = new Scanner( System.in ); // scanner d'entrada
        
            System.out.println("Nom de la unitat docent: ");
            unitatDocent = s.next(); //Agafa un string per teclat
        
            cd = new CtrDomini( unitatDocent );
      
            int opcio = 0;
            boolean opcio4 = false;
        
            while( !tancar && !opcio4) {
                System.out.println(" MENU ");
                System.out.println(" 1 - generar horari");
                System.out.println(" 2 - cargar horari");
                System.out.println(" 3 - modificar dades");
                System.out.println(" 4 - logOut");
                System.out.println(" 5 - Tancar");
                System.out.println();
                System.out.println(" Entra opcio");
                opcio = s.nextInt();
            
                if(opcio == 1) generar();
                else if(opcio == 2) carregar();
                else if(opcio == 3) modificar(); // la unica implementada
                else if(opcio == 4) opcio4 = true;
                else if(opcio == 5) tancar = true;
            }
           if(opcio4) System.out.println("-----------------------------------------------------------");
            System.out.println();
        }
        System.out.println(" FIN "); 
    }
    
    
    private static void generar() {
        //Horari h = new Horari();
        //System.out.println("tria un arxiu de disponibilitat horaria\n");
        //String a = s.next()
       /*
        * ALICIA NOS HA DICHO QUE SOLO TENGAMOS UNA CONFIGURACION POR UNDIAD DOCENTE        
        */
       cd.crearQuadricula(); 
    }


    private static  void carregar() {} // 3a entrega
    
    private static void modificar() {
        
        int opcio = 0;
        while( opcio != 4 ) {
            System.out.println(" OPCIONS ");
            System.out.println("1-assignatures\n2-aules\n3-restriccions\n4-tornar");
            opcio = s.nextInt();
            
            if(opcio == 1) opcionsAsignatures();
            else if(opcio == 2) opcionsAules();
            else if(opcio == 3) opcionsRestriccions();
        }
    }
    
    private static  void opcionsAsignatures(){
        
        int opcio = 0;
        while( opcio != 4 ) {
            //llista les assignatures
            System.out.println(" Unitat Docent:"+unitatDocent+" llista d'assignatures:");
            ArrayList llista = cd.llistaAssignatures();
            for( int i = 0; i < llista.size(); ++i)    
                System.out.println(llista.get(i) );
            
            System.out.println("");
            System.out.println(" OPCIONS ");
            System.out.println("1-crear\n2-esborrar\n3-modificar\n4-tornar");
            opcio = s.nextInt();
            
            System.out.println("");
            if(opcio == 1) creaAssignatura();
            else if(opcio == 2) esborraAssignatura();
            else if(opcio == 3) modificaAssignatura();
<<<<<<< HEAD
           
=======
>>>>>>> 89ab4d578432ae05cf86b0c1fbc0109be8e7cc61
        }
        
    }
    
    
    private static void opcionsAules(){
        int opcio = 0;
        while( opcio != 4 ) {
            //llista les assignatures
            System.out.println(" Unitat Docent:"+unitatDocent+" llista aules:");
            ArrayList llista = cd.llistaAules();
            for( int i = 0; i < llista.size(); ++i)
            System.out.println(llista.get(i) );
            System.out.println("");
            System.out.println(" OPCIONS ");
            System.out.println("1-crear\n2-esborrar\n3-modificar\n4-tornar");
            opcio = s.nextInt();

            System.out.println("");
            if(opcio == 1) creaAula();
            else if(opcio == 2) esborraAula();
            else if(opcio == 3) modificaAula();
        }
    }

    private static void logout() {
        
    }
    
    private static void opcionsRestriccions(){
        
    }
   /**
    * Crea una assigatura (  un arxiu .txt amb tota la info)
    * nom de l arxiu (unitat docent)-(nom assignatura)
    * 
    * ara nomes posa el nom pero tenen que posarse i validar tots
    * els parametres
    */
    private static void creaAssignatura(){  
        
        System.out.println("nom de la assigatura a crear ");
        String nomAsg;
        nomAsg = s.next(); // nom de la assignatura 
        if( cd.existeixAssignatura( nomAsg) ) System.err.println("ja existeix");
        else {
            System.out.println("nivell");
            int nivell = s.nextInt();
            System.out.println("hores de teoria ");
            int horest;
            horest = s.nextInt();
            ArrayList<Integer> intervalsT = definirIntervalsHores( horest);
            System.out.println("hores de practica");
            int horesp;
            horesp = s.nextInt();
            ArrayList<Integer> intervalsP = definirIntervalsHores( horesp);
            System.out.println("Capacitat grups Teoria");
            int capTeo = s.nextInt();
            System.out.println("Capacitat grups Laboratori");
            int capLab = s.nextInt();
            System.out.println("Numero de grups de teoria");
            int ngt = s.nextInt();
            System.out.println("Numero de grups de laboratori");
            int ngl = s.nextInt();
            ArrayList<Integer> grups = new ArrayList();
            for(int i = 0; i < ngt; ++i){
                for(int j = 0; j < ngl+1; ++j) grups.add((i+1)*10+j);
            }
            cd.creaAssignatura( nomAsg, nivell , horest, intervalsT, horesp, intervalsP,
                    capTeo ,capLab, grups); // crea l'arxiu txt amb la info
        }
    }
    
    private static ArrayList<Integer> definirIntervalsHores( int numHores ){
        ArrayList<Integer> intervals = new ArrayList<Integer>();
        System.out.println("vos dividir les "+numHores+" en intervals ? (s/n)");
        String resposta;
        resposta = s.next();
        if( resposta.equals("s")) {
            System.out.println("HAS RESPONDIDO "+resposta);
            System.out.println("quants intervals vols ?");
            int numInt;
            numInt = s.nextInt();
            while( numInt > numHores ) {
                System.err.println("impossible\n quants intervals vols ?");
                numInt = s.nextInt();
            }
            int horesUsades = 0;
            for( int i = 1; i <= numInt; ++i ){ // ASSUMIM QUE L USUARI HO FA BÉ
                System.out.println("numero d'hores de l'interval "+i+ " ( usades "+horesUsades+" )");
                int nh = s.nextInt();
                horesUsades = horesUsades+nh;
                intervals.add(nh); // es posa l'interval
            }
            if( horesUsades != numHores) System.err.println("numero d'hores incorrecte");
        }
        else {
            intervals.add(numHores);
        }
        return intervals;
    }
    
    private static void esborraAssignatura(){         
        System.out.println("nom de la assigatura a esborrar ");
        String nomAsg = s.next(); // nom de la assignatura 
        if( ! cd.esborraAssignatura(nomAsg) ) 
            System.err.println(nomAsg+" no existeix "); 
    }
    
    private static void modificaAssignatura() {
        
        System.out.println("nom de la assigatura a modificar ");
        String nomAsg;
        nomAsg = s.next(); // nom de la assignatura 
        if( ! cd.existeixAssignatura( nomAsg) ) 
            System.err.println(nomAsg+" no existeix");
        else {
            cd.printAssig(nomAsg);
            System.out.println("hores de teoria ");
            int horest;
            horest = s.nextInt();
            System.out.println("hores de practica");
            int horesp;
            horesp = s.nextInt();
            System.out.println("nivell");
            int nivell = s.nextInt();
            System.out.println("Capacitat grups Teoria");
            int capTeo = s.nextInt();
            System.out.println("Capacitat grups Laboratori");
            int capLab = s.nextInt();
            System.out.println("Numero de grups de teoria");
            int ngt = s.nextInt();
            System.out.println("Numero de grups de laboratori");
            int ngl = s.nextInt();
            ArrayList<Integer> a = new ArrayList();
            for(int i = 0; i < ngt; ++i){
                for(int j = 0; j < ngl+1; ++j) a.add((i+1)*10+j);
            }
            //cd.creaAssignatura( nomAsg, horest, horesp, nivell, capTeo,capLab, a);
            
        }
    }

    private static void creaAula(){  
        
        System.out.println("nom de la aula a crear ");
        String nomAula = s.next(); // nom de la aula 
        if( cd.existeixAula( nomAula) ) System.err.println("ja existeix");
        else {
            System.out.println("es de teoria? (y/n)");
            String y = s.next();
            System.out.println("capacitat ");
            int c = s.nextInt();
            if (y.equals("y")) System.out.println("te projector? (y/n)");
            else System.out.println("te material?(y/n)");
            String n = s.next();
            int teo, boo;
            if (y.equals("y")) teo = 1;
            else teo = 0;
            if (n.equals("n")) boo = 0;
            else boo = 1;
            cd.creaAula(nomAula, c, teo, boo);
        }
    }
    
    private static void esborraAula(){         
        System.out.println("nom de l'aula a esborrar ");
        String nomAula = s.next(); 
        if( ! cd.esborraAula(nomAula) ) 
            System.err.println(nomAula+" no existeix "); 
    }
    
    private static void modificaAula() {
        
        System.out.println("nom de la l'aula a modificar ");
        String nomAula;
        nomAula = s.next();
        if( ! cd.existeixAula( nomAula) ) 
            System.err.println(nomAula+" no existeix");
        else {
            cd.printAula(nomAula);
            System.out.println("es de teoria? (y/n)");
            String y = s.next();
            System.out.println("capacitat ");
            int c = s.nextInt();
            if (y.equals("y")) System.out.println("te projector? (y/n)");
            else System.out.println("te material?(y/n)");
            String n = s.next();
            int teo, boo;
            if (y.equals("y")) teo = 1;
            else teo = 0;
            if (n.equals("n")) boo = 0;
            else boo = 1;
            cd.creaAula(nomAula, c, teo, boo);
        }
    }
}
