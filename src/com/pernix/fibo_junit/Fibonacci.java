/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pernix.fibo_junit;

/**
 *
 * @author Adrián
 */
public class Fibonacci {
    
    
    public int succession(int n){
        if (n > 1){
            return this.succession(n-1) +this.succession(n-2);
        }else if(n == 1){
            return 1;
        }else if (n == 0){
            return 0;
        }else{
            return -1;
        }
    }
}
