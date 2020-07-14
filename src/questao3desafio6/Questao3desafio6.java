/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3desafio6;

/**
 *
 * @author AliraMaria
 */
public class Questao3desafio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // Escrever um algoritmo que lê 10 valores, um de cada vez, e conta 
     // quantos deles estão no intervalo [10,20] e quantos deles estão 
     // fora do intervalo, escrevendo estas informações.
     //
    public static void main(String[] args) {
        int cont, num, contDentro, contFora;
        contDentro = 0;
        contFora = 0; cont=1;
        while(cont <= 10){
            num = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite um número: "));
            if(num>=10 && num<=20){
                contDentro++;
            }else{
                contFora++;
            }//fim do if
            cont++;
        }//fim do loop
        JOptionPane.showMessageDialog(null,"No intervalo de  [10,20] "
                + "Tem: "+contDentro+" e fora deste intervalo "
                + "Tem: "+contFora,"Resultados",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
