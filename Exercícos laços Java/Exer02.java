/*Faça um programa uqe leia e valide as seguintes informações:
    a. Nome: maior que 3 caracteres;
    b. Idade: entre 0 e 150;
    c. Salário: maior que zero;
    d. Sexo: "f" ou "m";
    e. Estado Civil: "s", "c", "v", "d".
 */

import java.util.Scanner;

public class Exer02 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        boolean validateInfo = false;

        String name;
        int age;
        double wage;
        String gender;

        do{
            System.out.println("Digite seu nome: ");
            name = scan.next();

            if(name.length() > 3){
                validateInfo = true;
            }else{
                System.out.println("O nome precisa ser maior que 3 caracteres.");
            }
        }while(!validateInfo);

        validateInfo = false;

        do{
            System.out.println("Digite sua idade: ");
            age = scan.nextInt();

            if(age >= 0 && age <= 150){
                validateInfo = true;
            }else{
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        }while(!validateInfo);

        validateInfo = false;

        do{
            System.out.println("Informe seu salário: ");
            wage = scan.nextDouble();

            if(wage > 0 ){
                validateInfo = true;
            }else{
                System.out.println("Salário informado precisa ser maior que 0.");
            }
        }while(!validateInfo);

        validateInfo = false;

        do{
            System.out.println("Informe seu genero: ");
            gender = scan.next();

            if(gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("m")){
                validateInfo = true;
            }else{
                System.out.println("Genero precisa ser 'f' ou 'm'.");
            }
        }while (!validateInfo);

        System.out.println("Nome:" + name);
        System.out.println("Idade:" + age);
        System.out.println("Salaro:" + wage);
        System.out.println("Genero:" + gender);
    }
}
