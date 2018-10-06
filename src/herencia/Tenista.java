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
public class Tenista extends Humano {
    String marcaraqueta;
    int maxposrank;

    public void saque(){
        System.out.println("Tiene un gran saque.");
    }
    public void revés(){
        System.out.println("Su revés lo hace a dos manos.");
    }
        public static void main(String[] args) {
            
        Tenista jugadorA = new Tenista();
        jugadorA.nombre="Juan Martín Del Potro";
        jugadorA.añodenacimiento = 1988;
        jugadorA.ultañocampeón = 2018;
        jugadorA.marcaraqueta="Wilson";
        jugadorA.maxposrank=3;
        
        jugadorA.Caract();
        jugadorA.correr();
        jugadorA.frenar();
        jugadorA.saque();
        jugadorA.revés();
            System.out.println("");
            
        Futbolista jugadorB = new Futbolista();
        jugadorB.nombre="Pablo Pérez";
        jugadorB.añodenacimiento=1985;
        jugadorB.nombreequipo="Boca Jrs.";
        jugadorB.posicióntabla=5;
        jugadorB.ultañocampeón=2018;
        
        jugadorB.Caract();
        jugadorB.correr();
        jugadorB.Admirable();
        jugadorB.Dureza();
        
         
                         
        
}
}
