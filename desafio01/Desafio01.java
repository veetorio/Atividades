package Desafioceuma.desafio01;

import javax.swing.*;

public class Desafio01
{
    public static void main(String[] args)
    {
        double conver_ano;
        double conver_mes;
        double calc;

        double ano = Double.parseDouble(JOptionPane.showInputDialog("diga a sua idade: "));
        double mês = Double.parseDouble(JOptionPane.showInputDialog("diga o mês em que nasceu"));
        double dia = Double.parseDouble(JOptionPane.showInputDialog("digite o dia"));

        conver_ano = ano*365;
        conver_mes = mês*30;

        calc = conver_ano + conver_mes + dia;

        System.out.println(calc);


    }

}
