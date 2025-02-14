package Algoritmos1SemestreExercícios.VillarimPg58_Ex15a30;

import javax.swing.JOptionPane;
public class ex23 {
    public static void main(String[] args) {
        // DECLARAÇÃO DE VARIÁVEIS
        double alt_pessoa, som_pessoa, alt_predio, som_predio;
        String s_alt_pessoa, s_som_pessoa, s_som_predio;
        
        // INPUT
        s_alt_pessoa = JOptionPane.showInputDialog(null, "Sua altura (em metros): ");
        s_som_pessoa = JOptionPane.showInputDialog(null, "Sua sombra (em metros): ");
        s_som_predio = JOptionPane.showInputDialog(null, "Sombra do prédio (em metros): ");
        
        
        // CONVERSÃO DE STRING
        alt_pessoa = Double.parseDouble(s_alt_pessoa);
        som_pessoa = Double.parseDouble(s_som_pessoa);
        som_predio = Double.parseDouble(s_som_predio);
        
        // CÁLCULOS
        alt_predio = (alt_pessoa * som_predio) / som_pessoa;

        // OUTPUT
        JOptionPane.showMessageDialog(null, "A altura do prédio é: "+ alt_predio +" metros");
    }
}
