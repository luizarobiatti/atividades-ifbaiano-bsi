package Algoritmos1SemestreExercícios.VillarimPg58_Ex15a30;
//17) Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit. Faça um algoritmo para ler uma temperatura Celsius e imprimi-la em Fahrenheit (pesquise como fazer este tipo de conversão).

import javax.swing.JOptionPane;
public class ex17 {
    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIÁVEIS
        double celsius, fahrenheit;
        String s_celsius;
        
        // INPUT
        s_celsius = JOptionPane.showInputDialog(null, "Graus em celsius:");

        // CONVERSÃO DE STRING
        celsius = Double.parseDouble(s_celsius);

        // CÁLCULOS
        fahrenheit = (1.8 * celsius) + 32;

        // OUTPUT
        JOptionPane.showMessageDialog(null, "" + celsius + "°C são " + fahrenheit + "°F");
    }
}
