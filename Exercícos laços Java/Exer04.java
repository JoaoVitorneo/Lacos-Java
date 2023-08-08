/* Supondo que a população de uma pais A seja de ordem de 8000 habitantes
com uma taxa anual de crescimento de 3% e que a população de B seja 20000  habitantes
com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do pais A ultrapasse ou iguale a população do pais B, mantidas
as taxas de crescimento.

 */

public class Exer04 {
    public static void main(String[]args){
        int a = 8000;
        int b = 20000;
        int anos = 0;

        while(a < b){
            a += (a/100) * 3;
            b += (b/100) * 1.5;
            anos++;
        }

        System.out.println("População A:" + a);
        System.out.println("População B: " + b);
        System.out.println("Quantidade de anos:" + anos);
    }
}
