/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerc1formageometrica;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class FormaGeometrica {

    Scanner ler = new Scanner(System.in);
    public double largura;
    public double comprimento;
    public double raio;
    public int opcao;

    public FormaGeometrica(double largura, double comprimento, double raio) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.raio = raio;
    }

    public void calcularArea() {
        System.out.println("Informe o Comprimento: \n");
        comprimento = ler.nextDouble();
        System.out.println("Informe a Largura: \n");
        largura = ler.nextDouble();

    }
}
