
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
        double dolares;
              
       
        
        String[] opciones = { "Monedas","Temperaturas","Presiones" };
        String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione conversor ...",
        "Conversor Universal", JOptionPane.QUESTION_MESSAGE, null,opciones,opciones[0]);
        
        JOptionPane.showMessageDialog(null,"Ud selecciono la opcion : "+ opcion);
        
    }
    
    
}
