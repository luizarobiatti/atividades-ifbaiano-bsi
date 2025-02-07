package Algoritmos1SemestreExercícios.VillarimPg58_Ex15a30;
// 18) A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra. Faça um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado funcionário. Considere que o salário líquido é igual ao salário bruto descontando-se 10% de impostos.

import javax.swing.JOptionPane;
public class ex18 {
    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIÁVEIS
        int horas_normais, horas_extras;
        double salário;
        String s_horas_normais, s_horas_extras;

        //INPUT
        s_horas_normais = JOptionPane.showInputDialog(null, "Quantas horas normais você trabalhou?");
        s_horas_extras = JOptionPane.showInputDialog(null, "Quantas horas extras você trabalhou?");

        // CONVERSÃO DE STRING
        horas_normais = Integer.parseInt(s_horas_normais);
        horas_extras = Integer.parseInt(s_horas_extras);

        // CÁLCULOS
        salário = 10 * horas_normais + 15 * horas_extras;

        // OUTPUT
        JOptionPane.showMessageDialog(null, "Seu salário bruto é: " + salário + ", e o líquido é: " + salário * 0.90);
    }
}
