package Algoritmos1SemestreExercícios.VillarimPg58_Ex15a30;
// 22) Pedrinho tem um cofrinho com muitas moedas, e deseja saber quantos reais conseguiu poupar. Faça um algoritmo para ler a quantidade de cada tipo de moeda, e imprimir o total economizado em reais. Considere que existam moedas de 1, 5, 10, 25 e 50 centavos, e ainda moedas de 1 real. Não havendo moeda de um tipo, a quantidade respectiva é zero.

import javax.swing.JOptionPane;
public class ex22 {
    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIÁVEIS
        int qtd1, qtd5, qtd10, qtd25, qtd50, qtd100;
        double reais;
        String s_qtd1, s_qtd5, s_qtd10, s_qtd25, s_qtd50, s_qtd100;

        // INPUT
        s_qtd1 = JOptionPane.showInputDialog(null, "Quantas moedas de 1 centavo você tem?");
        s_qtd5 = JOptionPane.showInputDialog(null, "Quantas moedas de 5 centavos você tem?");
        s_qtd10 = JOptionPane.showInputDialog(null, "Quantas moedas de 10 centavos você tem?");
        s_qtd25 = JOptionPane.showInputDialog(null, "Quantas moedas de 25 centavos você tem?");
        s_qtd50 = JOptionPane.showInputDialog(null, "Quantas moedas de 50 centavos você tem?");
        s_qtd100 = JOptionPane.showInputDialog(null, "Quantas moedas de 1 real você tem?");

        // CONVERSÃO DE STRING
        qtd1 = Integer.parseInt(s_qtd1);
        qtd5 = Integer.parseInt(s_qtd5);
        qtd10 = Integer.parseInt(s_qtd10);
        qtd25 = Integer.parseInt(s_qtd25);
        qtd50 = Integer.parseInt(s_qtd50);
        qtd100 = Integer.parseInt(s_qtd100);

        // CÁLCULOS
        reais = qtd1 + qtd5 * 5 + qtd10 * 10 + qtd25 * 25 + qtd50 * 50 + qtd100 * 100;
        reais = reais / 100;
    
        // OUTPUT
        JOptionPane.showMessageDialog(null, "Total de reais: " + reais);
    }
}
