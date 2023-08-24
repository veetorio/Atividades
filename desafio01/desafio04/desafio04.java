package Desafioceuma.desafio01.desafio04;

import javax.swing.*;

public class desafio04
{
    public static void main(String[] args)
    {
        double sm;
        final int sm1 = 778;
        double sala = Double.parseDouble(JOptionPane.showInputDialog("Quanto que você recebe"));
        sm = sala/sm1;
        System.out.printf("você recebe %.2f salários",(sm));



    }
}
