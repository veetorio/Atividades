package Desafioceuma.desafio01.desafio3;

import javax.swing.*;

public class desafio03
{
    public static void main(String[] args)
    {

        var entrada = JOptionPane.showInputDialog("Qual seu saldo atual");//entrada do saldo do cliente
        entrada = Corretor(entrada);//aqui ele irá fazer correção da "," para "."

        double saldo = Double.parseDouble(entrada);//após correção, aqui o saldo irá ser convertido para double para fins de calculo
        System.out.println(reajustemais(saldo));//reajuste do saldo para mais
        System.out.println(reajustemenos(saldo));//reajuste do saldo para menos

    }
   static String Corretor(String valor0)
   {
       return valor0.replace(",",".");
   }//esta função executa a correção
   static double reajustemais(double valor1)//esta função executa o calculo do reajuste para mais
   {
       final double variação = 0.01;
       return valor1+(valor1*variação);
   }
   static double reajustemenos(double valor1)//esta função executa o calculo do reajuste para menos
   {
       final double variação = 0.01;
       return valor1-(valor1*variação);
   }


}
