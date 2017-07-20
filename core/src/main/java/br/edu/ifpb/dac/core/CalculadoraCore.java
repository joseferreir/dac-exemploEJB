/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.core;

import br.edu.ifpb.dac.shared.Calculadora;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author miolivc
 */

@Stateless
@Remote(Calculadora.class)
public class CalculadoraCore implements Calculadora {

    @Override
    public int soma(int x, int y) {
        return x + y;
    }
    
}
