/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author guille
 */
public class Humano {
    
    String nombre;
    int añodenacimiento;
    int ultañocampeón;
   
    public void correr(){
        System.out.println("¡Cómo corre!");
    }
    public void frenar(){
        System.out.println("Sabe frenar a tiempo");
    }
    protected void Caract(){
    
            
      System.out.println("Su nombre es: "+ nombre);
      System.out.println("Nació en el año: "+ añodenacimiento);
      System.out.println("Salió campeón por última vez en el : "+ ultañocampeón);
            
    }
        
    
    
}
