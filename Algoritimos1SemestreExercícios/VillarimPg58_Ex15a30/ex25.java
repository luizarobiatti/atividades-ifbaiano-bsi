package Algoritmos1SemestreExercícios.VillarimPg58_Ex15a30;
// 25) Calcule o volume de uma caixa d'água cilíndrica.

import javax.swing.JOptionPane;
public class ex25 {
    public static void main(String[] args) {
         // DECLARAÇÃO DE VARIÁVEIS
        double volume, raio, altura;
        String s_raio, s_altura;

        // INPUT
        s_raio = JOptionPane.showInputDialog(null, "Qual o raio da circunferência da caixa d'água?");
        s_altura = JOptionPane.showInputDialog(null, "Qual a altura da caixa d'água?");

        // CONVERSÃO DE STRING
        raio = Double.parseDouble(s_raio);
        altura = Double.parseDouble(s_altura);

        // CÁLCULOS
        volume = Math.PI * (raio * raio) * altura;

        // OUTPUT
        JOptionPane.showMessageDialog(null, "O volume é: " + volume);
    }
}