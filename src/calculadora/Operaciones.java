/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 * @author regen
 */
public class Operaciones {
    public double resultado;
    public int result;
    
 
    public Double sumar(double num1, double num2){
        try{
         resultado= num1+num2;
         
    } catch (InputMismatchException e){
                num1= 0;
                num2=0;
                resultado=0;
            } catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null,"Por favor ingrese un número"); }
         return resultado;}
    
    public Double restar( double num1, double num2){
        try{
        resultado= num1-num2;} catch(InputMismatchException e){
                System.out.println("se devuelve un cero por error");
                num1= 0;
                num2=0;
            }
        return resultado;}
    
        
    public Integer sumarEnteros( int numE1, int numE2){
         
                 result= numE1+numE2;
            
         return result;
    }
    
     public Integer restarEnteros( int numE1, int numE2){
            try {
                 result= numE1-numE2;
            }catch(InputMismatchException e){
                System.out.println("se devuelve un cero por error");
                numE1= 0;
                numE2=0;
            }
         return result;
    }
    
    public Double multiplicar(double num1, double num2){
        resultado= num1*num2;
        return resultado;
    
    }
    
    public Double potencia(double num1, double num2){
        try{
        resultado= Math.pow(num1,num2);
        } 
        catch(InputMismatchException e){
        num1=1;
        num2=0;
        } return resultado;
    }
    
    public Double raiz(double num1){
        try{
        resultado= Math.sqrt(num1);}
        
         catch(InputMismatchException e){
        num1=0;
        resultado=0;
       
        }
        return resultado;
    }
    
}
    
    