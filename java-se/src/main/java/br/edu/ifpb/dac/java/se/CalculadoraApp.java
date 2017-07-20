/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.java.se;

import br.edu.ifpb.dac.shared.Calculadora;
import br.edu.ifpb.dac.shared.ServiceLocator;
import java.util.Scanner;

/**
 *
 * @author miolivc
 */
public class CalculadoraApp {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int x = in.nextInt();   in.nextLine();
        
        System.out.println("Digite um numero: ");
        int y = in.nextInt();   in.nextLine();
       
        String name = "";
        Calculadora calculadora = ServiceLocator.loockup(name);
        
        int soma = calculadora.soma(x, y);
        
        System.out.println("O resultado da soma foi: " + soma);
    }
    
}
