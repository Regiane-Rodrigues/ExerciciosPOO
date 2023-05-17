/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerc2contabancanria;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ContaBancaria {
    Scanner ler = new Scanner(System.in);
    
    private double saldo;
    private String titular;

    
    public ContaBancaria(double saldo, String titular){
    
        this.saldo = saldo;
        this.titular = titular;
    
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
     public void CalculaChequeEspecial(){
    
         System.out.println("Calcular Limite Cheque Especial");
         
        
            
    }
    
    
}
