//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrnado uma mensagem de erro e voltando a pedir as informações


import java.util.Scanner;

public class Exer01 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        boolean validateInfo = false;

        String userName;
        String password;

        do{
            System.out.println("Digite seu nome de usuário: ");
            userName = input.next();

            System.out.println("Digite sua senha: ");
            password = input.next();

            if(userName.equalsIgnoreCase(password)){
                validateInfo = false;
                System.out.println("Sua senha não pode ser igual ao seu nome de usuário, tente outra senha.");
            }else{
                validateInfo = true;
                System.out.println("Senha e usuário válidos.");
            }

        }while(!validateInfo);
    }
}
