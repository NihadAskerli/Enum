/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enum;

/**
 *
 * @author ASUS
 */
public enum Emeliyyat {
    TOPLA('+'), CIX('-'), VUR('*'), BOL('/');
    private char c;
    Emeliyyat(char c) {
    this.c=c;
}
    public char getOpertionsymbol(){
        return this.c;
    }
    public double hesabla(double a,double b){
        if(c=='+'){
            return a+b;
        }
        return -1;
    }
}
