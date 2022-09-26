/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapadeNegocio;

/**
 *
 * @author Fernando
 */
public class Complejo {
  //  Atributos
    float real;
    int imaginaria;
    //Constructor

    
    /*
Descripción: Crea una Instancia de la clase Complejo
Datos de Entrada: Ninguno
Datos de salida: Ninguno
Pre Condición: Ninguno
Post Condición: El complejo esta Creado   */
    public Complejo() {
        this.real=0;
        this.imaginaria=0;
    }
    /*
Nombre: Constructor Sobrecargado
Descripción: Crea una Instancia de la clase Complejo con datos de entrada
Datos de Entrada: Float ParteReal, Entero Parte Imaginaria
Datos de salida: Ninguno
Pre Condición: Ninguno
Post Condición: El complejo esta Creado */

    public Complejo(float real, int imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public void setPReal(float real) {
        this.real = real;
    }

    public void setPImaginaria(int imaginaria) {
        this.imaginaria = imaginaria;
    }

    public float getReal() {
        return real;
    }

    public int getImaginaria() {
        return imaginaria;
    }

    @Override
    public String toString() {
       String S="";
        
        
       if(imaginaria>0){
         S=S+real+"+"+Math.abs(imaginaria)+"i";   
       }else{
         S=S+real+"-"+Math.abs(imaginaria)+"i";
         int d=(int) real;
       }
       if (real==0) {
            S=S+Math.abs(imaginaria)+"i"; 
        }
        if (imaginaria==0) {
            S=S+real; 
        }
       return S;
    }
    
    ///----otra forma
     public Complejo sumar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real + c.real;
        aux.imaginaria = imaginaria + c.imaginaria;
        return aux;
    }
    
    
    public void suma( Complejo A,Complejo B){
        this.real=A.real+B.real;
        this.imaginaria=A.imaginaria+B.imaginaria;
    }
    
    public void resta( Complejo A,Complejo B){
        this.real=A.real-B.real;
        this.imaginaria=A.imaginaria-B.imaginaria;
    }
    ///Llamada
    public static void main(String[] args) {
        Complejo complejoA=new Complejo(8, 12);
        System.out.println(complejoA.toString());
        Complejo complejoB=new Complejo(2, 12);
        System.out.println(complejoB.toString());
        Complejo complejoC=new Complejo();
        //System.out.println(complejoC.toString());
                
        //llamada de Procedimientos es asi
        complejoC.resta(complejoA, complejoB);
        System.out.println(complejoC.toString());
    }
    
    
    
    
    
    
    
    
     
}
