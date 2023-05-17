/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerc1formageometrica;

/**
 *
 * @author aluno
 */
public class Exerc1FormaGeometrica {

    public static void main(String[] args) {
        FormaGeometrica forma = new Retangulo(12,13,14);
        forma.calcularArea();
        
        forma =  new Circulo(12,13,14);
        forma.calcularArea();
    }
}
