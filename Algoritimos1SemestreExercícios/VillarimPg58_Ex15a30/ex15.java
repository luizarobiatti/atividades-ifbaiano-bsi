package Algoritmos1SemestreExercícios.VillarimPg58_Ex15a30;

//15) Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para Carlos, R$33,00 para André e R$35,53 para Felipe*/

import javax.swing.JOptionPane;
public class ex15 {
    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIÁVEIS
        int carlos_andré;
        double conta, conta_rachada, centavos, felipe;
        String s_conta;

        // INPUT
        s_conta = JOptionPane.showInputDialog(null, "Qual o total da conta?");
        
        // CONVERSÃO DE STRING
        conta = Double.parseDouble(s_conta); 

        // CÁLCULOS
        conta_rachada = conta / 3;
        carlos_andré = (int)conta_rachada;
        centavos = conta_rachada - carlos_andré;
        felipe = carlos_andré + 3 * centavos;
        
        // OUTPUT
        JOptionPane.showMessageDialog(null, "Carlos: " + carlos_andré + ", André: " + carlos_andré + ", Felipe: " + felipe);
    }
}

/* PORTUGOL
 * VAR
 * carlos_andré: inteiro
 * conta, conta_rachada, centavos, felipe: real
 * 
 * INICIO
 * ler conta
 * conta_rachada <- conta / 3
 * carlos_andré <- (inteiro)conta_rachada
 * centavos <- conta_rachada - carlos_andré
 * felipe <- carlos_andré + 3 * centavos
 * escreva "Carlos: " + carlos_andré + ", André: " + carlos_andré + ", Felipe: " + felipe
 * FIM
 */