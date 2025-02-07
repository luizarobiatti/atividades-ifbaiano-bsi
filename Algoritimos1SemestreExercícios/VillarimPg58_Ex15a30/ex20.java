package Algoritmos1SemestreExercícios.VillarimPg58_Ex15a30;
//20) Uma confecção produz X blusas de lã e para isto gasta uma certa quantidade de novelos. Faça um algoritmo para calcular quantos novelos de lã ela gasta por blusa.

import javax.swing.JOptionPane;
public class ex20 {
    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIÁVEIS
        double novelos, blusas, novelos_por_blusa;
        String s_novelos, s_blusas;

        // INPUT
        s_blusas = JOptionPane.showInputDialog(null, "Quantas blusas foram fabricadas?");
        s_novelos = JOptionPane.showInputDialog(null, "Quantos novelos foram gastos?");

        // CONVERSÃO DE STRING
        blusas = Double.parseDouble(s_blusas);
        novelos = Double.parseDouble(s_novelos);

        // CÁLCULOS
        novelos_por_blusa = novelos / blusas;

        // OUTPUT
        JOptionPane.showMessageDialog(null, "Você gastou " + novelos_por_blusa + " novelos por blusa.");
    }
}
