/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String [] args){
        Llanta[] delantera= new Llanta[2];
        delantera[0]=new Llanta(10,"m");
        delantera[1]=new Llanta(10,"m");
        
        Llanta[] atras = new Llanta[2];
        atras[0]=new Llanta(10,"m");
        atras[1]=new Llanta(10,"m");
        Carro carro = new Carro(100,"xxx");
        carro.adicionarLLantasDelanteras(delantera);
        carro.adicionarLLantasTraseras(atras);    
    }
    
}
