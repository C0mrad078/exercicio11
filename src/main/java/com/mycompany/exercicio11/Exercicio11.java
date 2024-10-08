/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio11;
/**
 *
 * @author Administrator
 */
import javax.swing.JOptionPane;
public class Exercicio11 {
    public static void main(String[] args) {
    int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("escolha um numero"));
    if((numero % 2) == 0)
        {JOptionPane.showMessageDialog(null,"Este numero e multiplo de 2 ");}
        else 
        {JOptionPane.showMessageDialog(null,"Este numero não e multiplo de 2");
}
}
}

    