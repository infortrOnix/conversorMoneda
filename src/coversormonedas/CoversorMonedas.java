
package coversormonedas;

import javax.swing.JOptionPane;

/**
 *
 * @author Merliques
 */
public class CoversorMonedas {

   
    public static void main(String[] args) {
       
        //Conversor de monedas
        
        //atributos
        
        double pesos;
        double dolarHoy = 292.50;
        double euroHoy = 138.50;
        double realHoy = 27.50;
        double pesosDolares;
              
       
        
        String[] opciones = { "Monedas","Temperaturas","Presiones" };
        String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione conversor ...",
        "Conversor Universal", JOptionPane.QUESTION_MESSAGE, null,opciones,opciones[0]);
        
        JOptionPane.showMessageDialog(null,"Ud selecciono la opcion : "+ opcion);
        
        
        if(opcion == "Monedas"){
            
            //opciones de monedas convertibles
            
            String[] monedas = { "Dolares","Euros","Reales" };
            
            String opcionMoneda = (String) JOptionPane.showInputDialog(null, "Seleccione la Moneda a la que deseas convertir ...",
        "Conversor Universal", JOptionPane.QUESTION_MESSAGE, null,monedas,monedas[0]);
            
            if(opcionMoneda == "Dolares"){
                
                pesos = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la cantidad de Pesos a convertir en "+opcionMoneda));
            pesosDolares = pesos / dolarHoy;
            
           
          
            JOptionPane.showMessageDialog(null," la cantidad de $"+Math.round(pesos)+" equivalen a "+  Math.round(pesosDolares*100.0)/100.0+" Dolares");
            }else if(opcionMoneda == "Euros"){
                
                pesos = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la cantidad de Pesos a convertir en "+opcionMoneda));
            pesosDolares = pesos / euroHoy;
          
            JOptionPane.showMessageDialog(null," la cantidad de $"+Math.round(pesos)+" equivalen a "+  Math.round(pesosDolares*100.0)/100.0+" Euros");
            
            }else{
                
                 pesos = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingresa la cantidad de Pesos a convertir en "+opcionMoneda));
            pesosDolares = pesos / realHoy;
          
            JOptionPane.showMessageDialog(null," la cantidad de $"+Math.round(pesos)+" equivalen a "+  Math.round(pesosDolares*100.0)/100.0+" Reales");
            
            }
        }
    }
    
    
}
