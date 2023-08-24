package Desafioceuma.desafio01.desafio06;

import javax.swing.*;
import java.io.Console;

public class Desafio06
{
    public static void main(String[] args)
    {
        final int VALOR1 = 1;
        final int VALOR2 = 1;

        int quant1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade o produto1: "));
        int quant2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade o produto2: "));

        int cod1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o codígo do seu produto 1:"));
        int cod2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o codígo do seu produto 2:"));

        double tipi = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa que irá ser aplicada:"));
        double ipi = (tipi/100)+1;
        double valor_da_compra = (quant1*VALOR1 + quant2*VALOR2)*ipi;

        System.out.println(valor_da_compra);

    }
}
