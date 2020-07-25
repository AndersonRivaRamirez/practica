
package Datos;


public class Datos {
    
    public String colegio (int opcionescad){
        String rptaopcionescad = "";
        
        switch (opcionescad){
            case 0:
                rptaopcionescad="PARTICULAR";
                break;
            case 1:
                rptaopcionescad="NACIONAL";
                break;
        }
        return rptaopcionescad;
    }
    
    public String instituto (int opciones1cad){
        String rptaopciones1cad = "";
        
        switch (opciones1cad){
            case 0:
                rptaopciones1cad="IDAT";
                break;
            case 1:
                rptaopciones1cad="CIBERTEC";
                break;
            case 2:
                rptaopciones1cad="SISE";
                break;
        }
        return rptaopciones1cad;
    }
    
    public int cuota (int cuotacad){
        int rptacuotacad;
        rptacuotacad= cuotacad;
        return rptacuotacad;
    }
    
    public double descuento (int opcionescad, int opciones1cad, int cuotacad){
        double rptadescuento;
        double desc=0;
        
        if((opcionescad==0)&&(opciones1cad==0)){
            desc=0.25;
        }else if ((opcionescad==0)&&(opciones1cad==1)){
            desc= 0.20;
        }else if ((opcionescad==0)&&(opciones1cad==2)){
            desc=0.15;
        }else if ((opcionescad==1)&&(opciones1cad==0)){
            desc=0.50;
        }else if ((opcionescad==1)&&(opciones1cad==1)){
            desc= 0.40;
        }else if ((opcionescad==1)&&(opciones1cad==2)){
            desc= 0.30;
        }
        
        rptadescuento= cuotacad*desc;
        return rptadescuento;
    }
    
    public double importe (int opcionescad, int opciones1cad, int cuotacad){
        double rptadescuento;
        double desc=0;
        double rptaimporte;
        
        if((opcionescad==0)&&(opciones1cad==0)){
            desc=0.25;
        }else if ((opcionescad==0)&&(opciones1cad==1)){
            desc= 0.20;
        }else if ((opcionescad==0)&&(opciones1cad==2)){
            desc=0.15;
        }else if ((opcionescad==1)&&(opciones1cad==0)){
            desc=0.50;
        }else if ((opcionescad==1)&&(opciones1cad==1)){
            desc= 0.40;
        }else if ((opcionescad==1)&&(opciones1cad==2)){
            desc= 0.30;
        }
        
        rptadescuento= cuotacad*desc;
        rptaimporte= cuotacad-rptadescuento;
        return rptaimporte;
    }
}
