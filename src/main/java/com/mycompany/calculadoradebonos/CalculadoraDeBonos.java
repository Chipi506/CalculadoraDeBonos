
package com.mycompany.calculadoradebonos;
 
public class CalculadoraDeBonos {
    int salario; // salario de una persona
    String mensajeDeBono; // especifica el bono de trabajo
        public void Calcular(){
            salario = 50000;
        mensajeDeBono = "El bono es de = $" + (.02 * salario);
        System.out.println(mensajeDeBono);
            
        }
    public static void main(String[] args) {

        CalculadoraDeBonos NuevoBono = new CalculadoraDeBonos();
        NuevoBono.Calcular();
         
    }

}
