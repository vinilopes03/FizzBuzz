/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz;

/**
 *
 * @author alunoinf
 */
public class Game {
    
    
    public String validaNum(int num){
        if(num%3==0 && num%5==0){
            return "fizz buzz";
        }
        else if(num%3==0){
            return "fizz";
        }
        else if(num%5==0){
            return "buzz";
        }
        else return Integer.toString(num);
    }
}
