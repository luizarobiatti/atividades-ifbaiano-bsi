package Algoritmos1SemestreExercícios.VillarimPg58_Ex15a30;

//16) A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.

import javax.swing.JOptionPane;
public class ex16 {
    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIÁVEIS
        double hambúrguer = 100;
        double presunto = 50;
        double queijo = 50;
        int quantidade;
        String s_quantidade;

        // INPUT
        s_quantidade = JOptionPane.showInputDialog(null, "Quantos sanduíches você irá fazer?");

        // CONVERSÃO DE STRING
        quantidade = Integer.parseInt(s_quantidade);

        // CÁLCULOS
        hambúrguer = hambúrguer * quantidade / 1000;
        queijo = queijo * quantidade * 2 / 1000;
        presunto = presunto * quantidade/ 1000;

        // OUTPUT
        JOptionPane.showMessageDialog(null, "Hambúguer: " + hambúrguer + ", Queijo: " + queijo + ", Presunto: " + presunto);
    }
}
