package Desafioceuma.desafio01.desafio05;

import javax.swing.*;

public class desafio05
{
    public static void main(String[] args)
    {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        System.out.printf("o sucessor de %d = %d, e o antecessor é %d",(num1),(num1+1),(num1-1));

    }
}
