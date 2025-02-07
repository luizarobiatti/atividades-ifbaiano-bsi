package Algoritmos1SemestreExercícios.VillarimPg58_Ex15a30;
// 21) A fábrica de refrigerantes Meia-Cola vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, faça um algoritmo para calcular quantos litros de refrigerante ele comprou.

import javax.swing.JOptionPane;
public class ex21 {
    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIÁVEIS
        int qtd_lata, qtd_garrafa_p, qtd_garrafa_g;
        double litros;
        String s_qtd_lata, s_qtd_garrafa_p, s_qtd_garrafa_g;

        // INPUT
        s_qtd_lata = JOptionPane.showInputDialog(null, "Quantas latas de 350 ml você comprou?");
        s_qtd_garrafa_p = JOptionPane.showInputDialog(null, "Quantas garrafas de 600 ml você comprou?");
        s_qtd_garrafa_g = JOptionPane.showInputDialog(null, "Quantas garrafas de 2L você comprou?");

        // CONVERSÃO DE STRING
        qtd_lata = Integer.parseInt(s_qtd_lata);
        qtd_garrafa_p = Integer.parseInt(s_qtd_garrafa_p);
        qtd_garrafa_g = Integer.parseInt(s_qtd_garrafa_g);

        // CÁLCULOS
        litros = (qtd_lata * 350 + qtd_garrafa_p * 600 + qtd_garrafa_g * 2000);
        litros = litros / 1000;

        // OUTPUT
        JOptionPane.showMessageDialog(null, "Litros no total: " + litros);
    }
}
