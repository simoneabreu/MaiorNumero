/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeromaior;

import java.util.Scanner;

/**
 *
 * @author SIMONE ABREU
 */
public class NumeroMaior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1;
        int num2;
        int maior;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o 1º numero");
        num1 = entrada.nextInt();
        System.out.println("Informe o 2º número: ");
        num2 = entrada.nextInt();
        
        entrada.close();
        
        if(num1 > num2)
            maior = num1;
        else
            maior = num2;
        System.out.println("O numero maior é" + maior);
    }
    
}
