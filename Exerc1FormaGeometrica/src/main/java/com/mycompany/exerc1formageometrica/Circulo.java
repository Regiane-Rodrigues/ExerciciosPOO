/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc1formageometrica;

/**
 *
 * @author aluno
 */
public class Circulo extends FormaGeometrica {

    public double valorResultado;

    public Circulo(double largura, double comprimento, double raio) {

        super(largura, comprimento, raio);

    }

    @Override
    public void calcularArea() {
        System.out.println("\nCalcula Area do Circulo");
        System.out.println("Informe o Raio: \n");
        raio = ler.nextDouble();

        valorResultado = 3.14 * raio;
        System.out.println("Area Total: " + valorResultado);
    }
}
