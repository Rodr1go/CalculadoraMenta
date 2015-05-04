package org.calculadora.action;
 
import org.calculadora.AppManager;
import org.mentawai.core.BaseAction;
 
public class Operacao extends BaseAction {
    
    public String inicio() {
      
       return SUCCESS;
    }
    //--------------------------------------
    public String efetuar() {
      String op = input.getString("op");
      output.setValue("op", op);
       
      return op;
    }
    
    public String resolver() {
        String op = input.getString("op");
        int vl1, vl2, res;
        vl1 = input.getInt("valor1");
        vl2 = input.getInt("valor2");
        res = 0;
        
        String operador = "";
        
        switch(op){
            case "soma":
                res = vl1 + vl2;
                operador = "+";
            break;
                
            case "sub":
                res = vl1 - vl2;
                operador = "-";
            break;
                
            case "mult":
                res = vl1 * vl2;
                operador = "*";
            break;
                
            case "div":
                res = vl1 / vl2;
                operador = "/";
            break;
            
            default:
                break;
        }
        
        output.setValue("res", vl1 + " " + operador + vl2 + " = "+ res);
        
       return SUCCESS;
    }
    //----------------------------------------
    /*public String paginaSoma() {
      
       return SUCCESS;
    }
   
    public String paginaSub() {
      
        return SUCCESS;
    }
    
    public String paginaMult() {
      
        return SUCCESS;
    }
    
    public String paginaDiv() {
      
        return SUCCESS;
    }*/
    
    /*public String somar() {
        int vl1, vl2, res;
        vl1 = input.getInt("valor1");
        vl2 = input.getInt("valor2");
        res = vl1 + vl2;
        output.setValue("res", "O resultado da soma entre "+vl1+" e "+vl2+ "= "+res);
        
       return SUCCESS;
    }
    
    public String subtrair() {
        int vl1, vl2, res;
        vl1 = input.getInt("valor1");
        vl2 = input.getInt("valor2");
        res = vl1 - vl2;
        output.setValue("res", "O resultado da subtração entre "+vl1+" e "+vl2+" = "+res);
        
        return SUCCESS;
    }
    
    public String multiplicar() {
       int vl1, vl2, res;
        vl1 = input.getInt("valor1");
        vl2 = input.getInt("valor2");
        res = vl1 * vl2;
        output.setValue("res", "O resultado da multiplicação entre "+vl1+" e "+vl2+" = "+res);
        
        return SUCCESS;
    }
    
    public String dividir() {
        int vl1, vl2, res;
        vl1 = input.getInt("valor1");
        vl2 = input.getInt("valor2");
        res = vl1 / vl2;
        output.setValue("res", "O resultado da divisão entre "+vl1+" e "+vl2+" = "+res);
        
        return SUCCESS;
    }*/   
}