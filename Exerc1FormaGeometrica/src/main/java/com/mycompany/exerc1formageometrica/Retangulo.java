/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc1formageometrica;

/**
 *
 * @author aluno
 */
public class Retangulo extends FormaGeometrica {
    public double valorResultado;
    public Retangulo(double largura, double comprimento, double raio) {

        super(largura, comprimento, raio);

    }

    @Override
    public void calcularArea() {
        System.out.println("Calcular Area do Retângulo");
        System.out.println("Informe o Comprimento: \n");
        comprimento = ler.nextDouble();
        System.out.println("Informe a Largura: \n");
        largura = ler.nextDouble();
        
        valorResultado = comprimento*largura;
        System.out.println("Area Total: " +valorResultado);
    }
}
