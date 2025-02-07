package Algoritmos1SemestreExercícios.VillarimPg58_Ex15a30;
//19) A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos.

import javax.swing.JOptionPane;
public class ex19 {
    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIÁVEIS
        int frangos;
        double gasto;
        String s_frangos;

        // INPUT
        s_frangos = JOptionPane.showInputDialog(null, "Quantos frangos tem na granja");
        
        // CONVERSÃO DE STRING
        frangos = Integer.parseInt(s_frangos);

        // CÁLCULOS
        gasto = frangos * (4 + 2*3.50);

        // OUTPUT
        JOptionPane.showMessageDialog(null, "Gasto total é: " + gasto);
    }
}
