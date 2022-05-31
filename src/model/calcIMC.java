/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author casso
 */
public class calcIMC {
    public Double imc(double peso, double altura){
        return peso / (altura*altura); 
    }
    public String resultado(double imc){
        if (imc <= 18.5) {
        return "magreza";
        } else if (imc > 18.5 && imc <= 24.9) {
        return "normal";
        } else if (imc >= 25 && imc <= 29.9) {
        return "sobrepeso";
        } else {
        return "obesidade";
        }
    }
}
