/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basic;

import java.util.Scanner;
import basic.GraphicMessage;

/**
 *
 * @author USER
 */
public class Sample {
    public static float leerInt(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Por favor ingrese el valor del entero: ");
        return entrada.nextFloat();
    }
    
    public static float calcularCompra(){
        
        final float IVA=1.19f;
        float a=GraphicMessage.readInt("Ingresa el costo de tu compra: ");
        if (a > 150000){
            a= (a * 0.95f)*IVA;
            
            
        }else{
        
            a=a+(a*0.19f);
        }
        
        return a;      
        
    }

    public static void calificacionEstudiante(){
        float suma=0;
        float promedio;
        for (int i = 0; i < 5; i++) {
            float a= GraphicMessage.readInt((i+1) +". Ingresa tu nota: ");
            suma+=a;
        }
        
        promedio =(float) suma/5f;
        if (promedio >= 3){
            System.out.println("Has aprobado con: "+ promedio);
        }else{
            System.out.println("Reprobaste con: "+ promedio);
        }
    }

}
