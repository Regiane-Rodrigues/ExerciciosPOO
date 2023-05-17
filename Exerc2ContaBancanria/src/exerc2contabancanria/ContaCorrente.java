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
public class ContaCorrente extends ContaBancaria{
    
    
    
    public ContaCorrente(double saldo,String titular){
    
        super(saldo, titular);
    }
    
    @Override
    public void CalculaChequeEspecial(){
        
        double saldo =  getSaldo();
        String titular = getTitular();
        double limiteChequeEspecial = 1000.00;
        
        System.out.println("Titular: ");
        titular = ler.nextLine();
        
         System.out.println("Saldo: ");
         saldo = ler.nextDouble();
         
         limiteChequeEspecial = limiteChequeEspecial - saldo;
         System.out.println("Limite disponível: " +limiteChequeEspecial);
    }
    
   
    
    
}
